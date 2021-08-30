package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {
    public MomController() {
        System.out.println("Mom controller obj created " + this.hashCode());
    }

    @ResponseBody
    @RequestMapping("/sugar")
    public String giveSugar() {
        return "Ok... Here is your sugar";
    }
}
