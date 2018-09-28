package com.ai.git.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Wayne.Wang
 * @Date 18/9/28
 */
@RestController
public class HelloController {

    @RequestMapping("/test/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
}
