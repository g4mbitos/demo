package com.heleta.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Controller {

    @GetMapping("/test")
    public String test(){
        return "This is test";
    }


    @GetMapping("/test2")
    public String test2(){
        return "This is second test";
    }

    @GetMapping("/test3")
    public String test3(){
        return "This is third test";
    }

}
