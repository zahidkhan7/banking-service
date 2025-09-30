package com.zad.eng.excellence.poc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {


    @Bean
    public RestTemplate restTemplate() {
        // Simple RestTemplate suitable for basic GET and POST requests
        return new RestTemplate();
    }

    /*
    @Bean
    public RestTemplate restTemplate() {
        // Using HttpComponentsClientHttpRequestFactory allows more features like PATCH, timeout settings, etc.
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setConnectTimeout(5000); // 5 seconds connection timeout
        factory.setReadTimeout(5000);    // 5 seconds read timeout

        return new RestTemplate(factory);
    }
    */


}
