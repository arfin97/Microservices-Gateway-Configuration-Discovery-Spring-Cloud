package com.moviedatabase.gatewayserver.Configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    //https://www.javainuse.com/spring/cloud-gateway-eureka
    //https://youtu.be/jOawuL1Xnwo?t=858
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r -> r.path("/movie/**").uri("lb://movie-service").id("movieService"))
                .route(r -> r.path("/name/**").uri("lb://movie-name-service").id("movieNameService"))
                .route(r -> r.path("/detail/**").uri("lb://movie-detail-service").id("movieDetailService"))
                .build();
    }
}
