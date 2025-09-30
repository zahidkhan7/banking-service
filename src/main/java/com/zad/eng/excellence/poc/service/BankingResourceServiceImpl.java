package com.zad.eng.excellence.poc.service;

import com.zad.eng.excellence.poc.model.ApiResponse;
import com.zad.eng.excellence.poc.model.CustomerPayload;
import com.zad.eng.excellence.poc.exception.DataNotAvailableException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.zad.eng.excellence.poc.model.SuccessResponse;
import com.zad.eng.excellence.poc.model.ErrorDetail;
import org.springframework.beans.factory.annotation.Value;

@Service
public class BankingResourceServiceImpl  implements BankingResourceService {

    @Value("${customer.api.base-url}")
    private String customerApiBaseUrl;

    private final RestTemplate restTemplate;

    public BankingResourceServiceImpl(RestTemplate template) {
        this.restTemplate = template;
    }

    @Override
    public SuccessResponse getCustomerById(Long id) {
        String url = customerApiBaseUrl + "/" + id;

        // Use exchange() with ParameterizedTypeReference for generic types
        ResponseEntity<ApiResponse<CustomerPayload>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<ApiResponse<CustomerPayload>>() {
                }
        );

        ApiResponse<CustomerPayload> apiResponse = response.getBody();

        if (apiResponse == null) {
            throw new DataNotAvailableException("No response received from customer API.");
        }

        if (apiResponse.isSuccess()) {
            CustomerPayload payload = apiResponse.getPayload();  // Use getData(), not getPayload()
            if (payload != null) {
                return toSuccessResponse(payload);
            } else {
                throw new DataNotAvailableException("API returned success but payload is empty for customer id: " + id);
            }
        }
        return null;
    }

    private SuccessResponse toSuccessResponse (CustomerPayload customerPayload){
        SuccessResponse response = new SuccessResponse();

        response.setDataResponse(customerPayload);
        response.setOprstatus(0);
        response.setReturnCode("0");
        response.setOpstatus(0);
        response.setHttpStatusCode(0);

        return response;
    }


}
