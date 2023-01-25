package com.wh.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: GooGoo
 * @time: 2023/1/25 13:29
 */
@Configuration
public class GateWayConfig {


    @Bean
    public RouteLocator customeRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        return routes.route("path_route_wh", r -> r.path("/guonei").uri("http://new.baidu.com/guonei")).build();
    }

}
