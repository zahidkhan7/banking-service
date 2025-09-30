package com.zad.eng.excellence.poc.service;

import com.zad.eng.excellence.poc.model.CustomerPayload;
import com.zad.eng.excellence.poc.model.SuccessResponse;

public interface BankingResourceService {

    SuccessResponse getCustomerById(Long customerId);
}
