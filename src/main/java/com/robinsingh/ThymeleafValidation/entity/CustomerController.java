package com.robinsingh.ThymeleafValidation.entity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @GetMapping("/")
    public String showForm(Model theModel){
        theModel.addAttribute("Customer", new Customer());
        return "customer-from";
    }

}
