package com.example.demo.feign.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface AnyFeignApi {
    @GetMapping({"/any-api"})
    ResponseEntity<String> test();
}
