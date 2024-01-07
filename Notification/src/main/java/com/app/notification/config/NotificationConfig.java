package com.app.notification.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfig {
    @Value("${rabbitmq.exchanges.internal}")
    private String exchange;
    @Value("${rabbitmq.queue.notification}")
    private String queue;
    @Value("${rabbitmq.routing-keys.internal-notification}")
    private String routing_key;

    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange(this.exchange);
    }

    @Bean
    public Queue queue(){
        return new Queue(this.queue);
    }

    @Bean
    public Binding binding(){
        return BindingBuilder.bind(queue()).to(topicExchange()).with(this.routing_key);
    }
}
