package dev.kbekind.beancomponentdemo.controller;


import dev.kbekind.beancomponentdemo.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class MessageController {

    private final MessageService messageService;

    // When spring creates an instance of this MessageController it will see the CONSTRUCTOR ARGUMENTS and it will AUTOWIRE this in.
    // It can find the MessageService because of th @Component annotation on MessageService
    // If there is only a SINGLE CONSTRUCTOR @Autowire is automatically done, and the annotation is not needed.
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public String findAll() {

        return messageService.findAll();

    }





}
