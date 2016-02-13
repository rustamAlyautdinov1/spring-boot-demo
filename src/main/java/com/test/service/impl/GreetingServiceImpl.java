package com.test.service.impl;

import com.test.service.GreetingService;
import org.springframework.stereotype.Service;

/**
 * Created by Rustam on 10/02/16.
 */

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String say() {
        return "hey";
    }
}
