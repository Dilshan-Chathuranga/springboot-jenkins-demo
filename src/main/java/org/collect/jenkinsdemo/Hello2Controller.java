package org.collect.jenkinsdemo;

/**
 * Author: Dilshan Chathuranga
 * Date: 20/1/2026
 * Description: HelloController class
 */

import org.springframework.web.bind.annotation.*;

@RestController
public class Hello2Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Spring Boot app is running successfully! wih jenkinsdemo";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
