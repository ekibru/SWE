package com.example.carRentalSystemProject.controller;

import com.example.carRentalSystemProject.service.CarTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarTypeController {
    private CarTypeService carTypeService;
    @GetMapping("/cars/type")
    public String getAllCarType(Model model){
        model.addAttribute("car_type",carTypeService.getAllCarType());
        return "cars";
    }
}
