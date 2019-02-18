package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.http.Http;

@Configuration
public class IntegrationFlowConfig {

    @Bean
    public IntegrationFlow flow() {
        return IntegrationFlows.from(Http.inboundChannelAdapter("test")
                    .requestMapping(m -> m.methods(HttpMethod.GET)))
                .handle(msg -> {})
                .get();
    }
}
