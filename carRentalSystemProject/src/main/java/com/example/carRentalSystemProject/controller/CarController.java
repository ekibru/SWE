package com.example.carRentalSystemProject.controller;

import com.example.carRentalSystemProject.model.Car;
import com.example.carRentalSystemProject.model.CarType;
import com.example.carRentalSystemProject.model.Reservation;
import com.example.carRentalSystemProject.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping("/cars")
    public String listCustomer(Model model) {
        model.addAttribute("cars", carService.getAllCar());
        return "cars";

    }
    @GetMapping("/cars/new")
    public String addCar(Model model){
         CarType carTypes = new CarType();
         model.addAttribute("carTypes",carTypes);
         return "addcars";
    }
    @PostMapping("/cars")
    public String saveCars(@ModelAttribute("carTypes") CarType carType){
        carService.saveCars(carType);
        return "redirect:/cars";

    }
    public String reserveCarForm(@PathVariable("id") Long id, Model model) {
        Car car = carService.getCarById(id);
        if (car != null&& car.getAvailable().equalsIgnoreCase("yes")) {
            Reservation reservation = new Reservation();
            reservation.getCarList().add(car);
            model.addAttribute("reservation", reservation);
            return "reservecar";
        } else {
            // Handle the case where the car is not available or not found
            return "redirect:/cars";
        }
    }

    @PostMapping("/cars/{id}/reserve")
    public String reserveCar(@PathVariable("id") Long id, @ModelAttribute("reservation") Reservation reservation) {
        Car car = carService.getCarById(id);
        if (car != null&& car.getAvailable().equalsIgnoreCase("yes")) {
            car.setAvailable("No"); // Set the car as unavailable after reserving
            carService.saveCar(car);
        }
        return "redirect:/cars";
    }
    }
