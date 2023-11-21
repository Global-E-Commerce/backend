package com.globalecommerce.backend.controller.redis;

import com.globalecommerce.backend.service.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisTestController {

    @Autowired
    private RedisService redisService;

    @GetMapping("/set")
    public String setValue(@RequestParam String key, @RequestParam String value) {
        redisService.setValue(key, value);
        return "Value set in Redis";
    }

    @GetMapping("/get")
    public String getValue(@RequestParam String key) {
        return "Value from Redis: " + redisService.getValue(key);
    }
}
