package com.nivo1.email.poller.client;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlRunner {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        EmailPollingRequest pollingRequest = new EmailPollingRequest();
        pollingRequest.setEmailHost("smtp.gmail.com");
        pollingRequest.setEmailServerPort("587");
        pollingRequest.setEmailUsername("my.gmail@gmail.com");
        pollingRequest.setEmailPassword("password");
        RabbitService rabbitService = (RabbitService) context.getBean("rabbitService");
        Queue queue  = (Queue) context.getBean("emailPollingRequestQueue");
        RabbitAdmin rabbitAdmin = (RabbitAdmin)context.getBean("rabbitAdmin");
        rabbitAdmin.declareQueue(queue);

        rabbitService.sendRequest(pollingRequest);
    }
}
