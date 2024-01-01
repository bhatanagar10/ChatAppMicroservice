package com.app.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RoutingConfiguration {
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/get")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("http://httpbin.org:80"))
                .route(p-> p
                        .path("/chat/**")
                        .filters(f -> f.rewritePath("/chat/(?<segment>.*)", "/${segment}"))
                        .uri("lb://chatapp"))
                .build();
    }
}
