package com.app.notification.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NotificationConsumer {

    @RabbitListener(queues = "${rabbitmq.queue.notification}")
    public void consumer(String message){
        log.info("Message received {}" , message);
    }
}
