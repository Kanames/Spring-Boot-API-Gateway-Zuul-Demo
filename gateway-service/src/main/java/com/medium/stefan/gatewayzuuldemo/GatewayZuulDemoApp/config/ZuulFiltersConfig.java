package com.medium.stefan.gatewayzuuldemo.GatewayZuulDemoApp.config;

import com.medium.stefan.gatewayzuuldemo.GatewayZuulDemoApp.zuul_filters.ErrorFilter;
import com.medium.stefan.gatewayzuuldemo.GatewayZuulDemoApp.zuul_filters.PostFilter;
import com.medium.stefan.gatewayzuuldemo.GatewayZuulDemoApp.zuul_filters.PreFilter;
import com.medium.stefan.gatewayzuuldemo.GatewayZuulDemoApp.zuul_filters.RouterFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulFiltersConfig {

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouterFilter routerFilter() {
        return new RouterFilter();
    }
}
