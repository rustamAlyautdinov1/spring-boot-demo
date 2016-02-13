package com.test.controller;

import com.test.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ralyautdinov on 1/28/2016.
 */

@RestController
public class HelloWorldController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/greeting")
    public String hey() {

        return greetingService.say();
    }
}
