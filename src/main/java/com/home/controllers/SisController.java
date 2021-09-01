package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {

    @ResponseBody
    @RequestMapping("/makeup")
    public String getMakeupKit() {
        return "Just take my makeup kit";
    }

    @ResponseBody
    @RequestMapping("/book")
    public String getBook() {
        System.out.println("getBook method is initialized");
        return "Math book, here you go";
    }
}
