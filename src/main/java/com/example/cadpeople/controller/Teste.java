package com.example.cadpeople.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Teste {

    @GetMapping("/123")
    @ResponseBody
    public String teste(){
        return "Marcinho rei da fonte";
    }

}