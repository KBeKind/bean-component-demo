package dev.kbekind.beancomponentdemo.config;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


// @Beans are usually found within an @Configuration class
@Configuration
public class WebConfig {

    // @Bean indicates that whatever this method returns put it in the APPLICATION CONTEXT
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplateBuilder().build();
    }



}
