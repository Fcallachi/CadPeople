package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class teste {

    @RequestMapping("/teste")
    public String teste(){
        return "OK";
    }

}
