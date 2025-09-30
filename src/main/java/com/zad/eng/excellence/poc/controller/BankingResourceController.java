package com.zad.eng.excellence.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zad.eng.excellence.poc.service.BankingResourceService;
import com.zad.eng.excellence.poc.model.CustomerPayload;
import com.zad.eng.excellence.poc.model.SuccessResponse;


@RestController
@RequestMapping("/api/customers")
public class BankingResourceController {

    private final BankingResourceService bankingService;

    @Autowired
    public BankingResourceController(BankingResourceService service) {
        this.bankingService = service;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<SuccessResponse> getCustomerById(@PathVariable Long customerId) {
        SuccessResponse response = bankingService.getCustomerById(customerId);
        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}

