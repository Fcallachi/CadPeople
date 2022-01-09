package com.cadpeople.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Teste {

    @GetMapping("/123")
    @ResponseBody
    public String teste(){
        return "123";
    }

}
