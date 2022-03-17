package com.eduardoshibukawatw.com.sonarqubepoc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrettingController {

    @GetMapping("hello")
    public String gretting() {
        return "Hello!";
    }

    @GetMapping("oie")
    public String oie() {
        return "Oiee!";
    }
}
