package com.example.carRentalSystemProject.controller;

import com.example.carRentalSystemProject.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
@Autowired
    private CustomerService customerService;

@GetMapping("/customer")
public String listCustomer(Model model){
    model.addAttribute("customer",customerService.getAllCustomer());
    return "customer";


}
}
