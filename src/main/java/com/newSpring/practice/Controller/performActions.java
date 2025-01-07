package com.newSpring.practice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class performActions {

    @GetMapping("/")
    public String homePage(){
        return "this is from Home Page 1234";
    }
}
