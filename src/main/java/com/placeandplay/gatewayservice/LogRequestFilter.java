package com.placeandplay.gatewayservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class LogRequestFilter implements GatewayFilter, Ordered {
    private static final Logger log = LoggerFactory.getLogger(LogRequestFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String originalPath = exchange.getRequest().getURI().getPath();
        String finalUrl = exchange.getRequest().getURI().toString();

        log.info("Original URL: {}", originalPath);
        log.info("Final URL after rewrite: {}", finalUrl);

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -2; // Убедись, что фильтр логирования выполняется раньше переписывания URL
    }
}
