package dev.kbekind.beancomponentdemo.service;


import org.springframework.stereotype.Component;


// A Bean is an instantiated class in Spring

// @Component brings this into the APPLICATION CONTEXT
@Component
public class MessageService {

    public String findAll() {

        return "Every Message";

    }

}
