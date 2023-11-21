package com.globalecommerce.backend.controller.kafka;

import com.globalecommerce.backend.service.kafka.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaTestController {

    @Autowired
    private KafkaProducerService producerService;

    @GetMapping("/send-message")
    public String sendMessage(@RequestParam String message) {
        producerService.sendMessage(message);
        return "Message sent to Kafka topic";
    }
}