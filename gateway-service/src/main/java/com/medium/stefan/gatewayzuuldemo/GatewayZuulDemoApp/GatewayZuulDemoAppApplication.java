package com.medium.stefan.gatewayzuuldemo.GatewayZuulDemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayZuulDemoAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulDemoAppApplication.class, args);
    }
}
