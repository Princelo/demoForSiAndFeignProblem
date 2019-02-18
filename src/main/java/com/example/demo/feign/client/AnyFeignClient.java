package com.example.demo.feign.client;

import com.example.demo.feign.api.AnyFeignApi;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient("test")
public interface AnyFeignClient extends AnyFeignApi {
}
