package com.nivo1.email.poller.client;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class RabbitService {

    private String queueName;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void setRabbitTemplate(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendRequest(EmailPollingRequest request) {
        rabbitTemplate.convertAndSend(queueName, request);
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }
}
