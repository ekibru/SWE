package com.example.carRentalSystemProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class HomepageController {

    @GetMapping(value = {"/", "/home"})
    public String displayHomepage() {
        return "public/home/index";
    }

    @GetMapping(value = {"/about"})
    public String displayAboutpage() {
        return "public/home/about";
    }

}
