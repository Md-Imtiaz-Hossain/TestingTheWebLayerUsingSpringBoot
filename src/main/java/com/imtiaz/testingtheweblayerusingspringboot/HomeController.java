package com.imtiaz.testingtheweblayerusingspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }

    @RequestMapping("/myM")
    public @ResponseBody String myM() {
        return "Welcome to - myMethod";
    }


    @RequestMapping("/myM2")
    public @ResponseBody String myM2() {
        return "10";
    }
}
