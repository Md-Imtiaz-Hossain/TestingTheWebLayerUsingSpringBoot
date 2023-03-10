package com.imtiaz.testingtheweblayerusingspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    private GreetingService greetingService;
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping("/greeting")
    public @ResponseBody String greeting() {
        return greetingService.greet();
    }

    @RequestMapping("/g2")
    public @ResponseBody String m2() {
        return greetingService.anotherTest();
    }

}
