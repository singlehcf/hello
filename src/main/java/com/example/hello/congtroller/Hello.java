package com.example.hello.congtroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/hello/{name}")
    public String getName(@PathVariable String name){
        return "我的名字是："+name;
    }
}
