package com.springtechie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
// java  annotation based bean creation.
@Configuration
public class CustomBean {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
