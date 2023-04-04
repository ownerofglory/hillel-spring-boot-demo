package ua.hillel.springbootdemo.controller;

import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
@RequiredArgsConstructor
public class HelloController {

    @GetMapping
    public String getHello() {
        return "Hello!";
    }
}
