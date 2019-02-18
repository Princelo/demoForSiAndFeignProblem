package com.example.demo.config;

import com.example.demo.feign.client.AnyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnyConfig {

//    @Autowired //http://localhost:19218/test return 404.
            // Comment out this annotation, it works
    AnyFeignClient client;

}
