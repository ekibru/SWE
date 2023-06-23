package com.example.carRentalSystemProject.controller;

import com.example.carRentalSystemProject.model.Car;
import com.example.carRentalSystemProject.model.Reservation;
import com.example.carRentalSystemProject.service.CarService;
import com.example.carRentalSystemProject.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;
    @Autowired
    private ReservationService reservationService;
    @GetMapping("/cars")
    public String listCustomer(Model model) {
        model.addAttribute("cars", carService.getAllCar());
        return "cars";

    }
    @GetMapping("/cars/aboutus")
    public String aboutUs(){
        return "about";
    }
    

  @GetMapping("/cars/cardisplay")
    private String createDummyCarList(Model model) {


        model.addAttribute("cars", carService.getAllCar());
        return "cardisplay";
    }
    @GetMapping("/cars/addcars")
    public String addCar(Model model){
         Car cars = new Car();
         model.addAttribute("cars",cars);
         return "addcars";
    }
    @PostMapping("/cars")
    public String saveCars(@ModelAttribute("cars") Car car){
        car.setAvailable("Yes");
        carService.saveCar(car);
        return "redirect:/cars";

    }
    @GetMapping( "/cars/reservation")
    public String reservation(Model model){
        Reservation reservation = new Reservation();
        model.addAttribute("reservation",reservation);
        return "reservecar";
    }
    @GetMapping("/cars/rental")
    public String rental(Model model){
        model.addAttribute("cars",carService.getAllCar());
        return "rentals";
    }

    @GetMapping("/cars/edit/{id}")
    public String editCar(@PathVariable("id") Long id, Model model) {
        Car car = carService.getCarById(id);
        model.addAttribute("car", car);
        return "edit";
    }
    @PostMapping("/cars/edit/{id}")
    public String updateCar(@PathVariable("id") Long id, @ModelAttribute("car") Car car, Model model) {
        Car updatedCar = carService.getCarById(id);
       if(car.getAvailable().equals("Yes")){
           List<Car> reservations = carService.getAllCar();
              for(Car reservation: reservations){
                if(reservation.getAvailable().equals("No")){
                     updatedCar.setAvailable("No");
                     carService.saveCar(updatedCar);
                     return "redirect:/cars";
                }

           }}
        updatedCar.setMake(car.getMake());
        updatedCar.setModel(car.getModel());
        updatedCar.setColor(car.getColor());
        updatedCar.setYear(car.getYear());
        updatedCar.setAvailable(car.getAvailable());

        carService.saveCar(updatedCar);
        return "redirect:/cars";
    }
    @GetMapping("/cars/delete/{id}")
    public String deleteCar(@PathVariable("id") Long id, Model model) {
        Car car = carService.getCarById(id);
        carService.deleteCar(car);

        return "redirect:/cars";
    }
    }
