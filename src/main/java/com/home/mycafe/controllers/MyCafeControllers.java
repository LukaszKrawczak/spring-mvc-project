package com.home.mycafe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyCafeControllers {

    // return the welcome-page
    @RequestMapping("/cafe")
    public String showWelcomePage(Model model) {
        return "welcome-page";
    }

    @RequestMapping("/processOrder")
    public String processOrder(HttpServletRequest request,  Model model) {
        // handle the data received fromt he user
        String userEnteredValue = request.getParameter("foodType");

        // adding the captured value to the model
        model.addAttribute("userInput", userEnteredValue);

        // set the user data with the model object and send it to view
        return "process-order";
    }
}
