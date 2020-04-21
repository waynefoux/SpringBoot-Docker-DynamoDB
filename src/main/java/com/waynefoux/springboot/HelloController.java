package com.waynefoux.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  A simple hello world type endpoint.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from SpringBoot!";
    }
}
