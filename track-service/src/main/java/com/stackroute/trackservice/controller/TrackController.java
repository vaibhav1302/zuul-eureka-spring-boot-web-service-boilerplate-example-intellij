package com.stackroute.trackservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TrackController {
    @RequestMapping("/hello")
    public String printHome(){
        return "hello";
    }
}
