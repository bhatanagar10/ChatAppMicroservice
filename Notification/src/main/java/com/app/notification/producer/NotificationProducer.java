package com.app.notification.producer;

import com.app.amqp.RabbitMQProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationProducer {

    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    public void produce(){
        rabbitMQProducer.publish("{message: 'Hello' }" , "internal.exchange" , "internal.notification.routing-key");
    }
}
