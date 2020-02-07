package com.deepexi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo")
@RestController
@Payload
public class demoController {
    @GetMapping("/greeting")
    public String greeting(){
        return "hello";
    }
}
