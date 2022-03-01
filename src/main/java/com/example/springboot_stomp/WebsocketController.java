package com.example.springboot_stomp;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebsocketController {

    @MessageMapping("/echo")
    @SendTo("/topic/echo")
    public String echo(String msg){
        return "RECEIVED: "+ msg;
    }
}
