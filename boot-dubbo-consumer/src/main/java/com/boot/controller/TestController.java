package com.boot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.boot.domain.User;
import com.boot.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lin on 2017/11/19.
 */
@RestController
@RequestMapping("/")
public class TestController {
    @Reference(version = "1.0.0")
    private TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("hello")
    public String hello() {
        return testService.sayHello("Hello springboot and dubbo!");
    }

    @GetMapping("user")
    public User user() {
        return testService.findUser();
    }
}
