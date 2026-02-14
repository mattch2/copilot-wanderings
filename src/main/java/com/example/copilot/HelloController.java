package com.example.copilot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("/question")
    public String question(@RequestBody QuestionRequest request) {
        if (request != null && "foo".equals(request.getQuestion())) {
            return "bar";
        }
        return "Unknown question";
    }
}
