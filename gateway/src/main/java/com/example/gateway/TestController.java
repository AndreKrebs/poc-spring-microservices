package com.example.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;

@RestController
@RequestMapping("/gateway")
public class TestController {

    @GetMapping("/get")
    public String teste() {
        return "Gateway!";
    }

}
