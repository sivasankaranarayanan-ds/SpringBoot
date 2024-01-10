package com.example.springboot.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello
{
        @RequestMapping("/home")
        public String welcome()
        {
            return "Hello SpringBoot";
        }
}
