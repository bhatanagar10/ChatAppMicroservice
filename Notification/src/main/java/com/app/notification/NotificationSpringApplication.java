package com.app.notification;

import com.app.notification.consumer.NotificationConsumer;
import com.app.notification.producer.NotificationProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.app.amqp" ,
                "com.app.notification"
        }
)
public class NotificationSpringApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(NotificationSpringApplication.class,args);
    }

    @Autowired
    private NotificationProducer notificationProducer;

    @Override
    public void run(String... args) throws Exception {
        notificationProducer.produce();
    }
}
