package com.wh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: GooGoo
 * @time: 2023/1/17 15:14
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getResTemplate(){
        return new RestTemplate();
    }
}
