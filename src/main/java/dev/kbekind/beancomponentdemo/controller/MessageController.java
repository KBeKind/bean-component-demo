package dev.kbekind.beancomponentdemo.controller;

import dev.kbekind.beancomponentdemo.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


// @RestController is a @Controller and @Controller is annotated with @Component bringing this into the APPLICATION CONTEXT
@RestController
@RequestMapping("/api/posts")
public class MessageController {


    private final MessageService messageService;

    private final RestTemplate restTemplate;

    // When spring creates an instance of this MessageController it will see the CONSTRUCTOR ARGUMENTS and it will AUTOWIRE this in.
    // It can find the MessageService because of the @Service annotation on MessageService.
    // It can find the RestTemplate because of the @Bean on the restTemplate() method and the class WebConfig has @Configuration

    // If there is only a SINGLE CONSTRUCTOR @Autowire is automatically done, and the annotation is not needed.
    public MessageController(MessageService messageService, RestTemplate restTemplate) {
        this.messageService = messageService;
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public String findAll() {

        return messageService.findAll();

    }


    @GetMapping("/load")
    public String loadMessages() {
        return "load-messagesw";
    }
}
