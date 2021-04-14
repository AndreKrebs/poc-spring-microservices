package com.example.serviceone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vaiplaneta")
public class TestController {

    @GetMapping
    public String teste() {
        return "Service One!";
    }

}
