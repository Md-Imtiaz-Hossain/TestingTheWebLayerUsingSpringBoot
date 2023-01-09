package com.imtiaz.testingtheweblayerusingspringboot;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greet() {
        return "Hello, World";
    }

    public String anotherTest() {
        return "Hello, This is another test";
    }

}
