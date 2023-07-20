package dev.kbekind.beancomponentdemo.service;



import org.springframework.stereotype.Service;


// A Bean is an instantiated class in Spring

// @Service has and @Compenent annotation built in.
// @Compenent annotation brings this into the APPLICATION CONTEXT
@Service
public class MessageService {

    public String findAll() {

        return "Every Message";

    }

}
