package laba.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/warehouse/**")
                        .uri("lb://Warehouse/")
                        .id("Warehouse"))
                .route(r -> r.path("/orders/**")
                        .uri("lb://Order/")
                        .id("Order"))
                .route(r -> r.path("/payment/**")
                        .uri("lb://Payment/")
                        .id("Payment"))
                .build();
    }

}
