package com.example.jenkinspipelinedemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Igor Rybak
 * @since 31-Jan-2019
 */
@RestController
public class HelloController {
    @GetMapping("/")
    public String getHello() {
        return "Hello!!!";
    }
}
