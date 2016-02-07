package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ralyautdinov on 1/28/2016.
 */

@RestController
public class HelloWorldController {

    @RequestMapping("/greeting")
    public String hey() {
        return "hey!";
    }
}
