package com.tuto.springboot.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "currency-service")
@Component //Because we want spring to manage this & create instance of it
public class CurrencyServiceConfiguration {
    
    private String url;
    private String username;
    private String key;

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getKey() {
        return key;
    }

}
