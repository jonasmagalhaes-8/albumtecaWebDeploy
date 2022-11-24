package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class TestController {

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        return "index.html";
    }
}
