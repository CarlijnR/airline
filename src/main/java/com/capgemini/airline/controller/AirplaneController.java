package com.capgemini.airline.controller;

import com.capgemini.airline.model.Airplane;
import com.capgemini.airline.repository.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/airplane")
public class AirplaneController {

    private static ArrayList<Airplane> airplaneItems = new ArrayList<>();

    @Autowired
    private AirplaneRepository airplaneItemsRepository;

    @PostMapping("/add")
    public Airplane registerAirplane(@RequestBody Airplane airplane){
        System.out.println(airplane);
        airplaneItems.add(airplane);
        return airplaneItemsRepository.save(airplane);
    }

    @GetMapping("/remove/{id}")
    public void removeAirplane(@PathVariable int id){
        airplaneItemsRepository.deleteById(id);
    }




//    @GetMapping
//    public void allowedTakeOff(boolean enoughFuel) {
//        if (airplane.getCurrentFuel() <= 2) {
//            enoughFuel = true;
//            System.out.println("The plane as enough fuel and is allowed to take off");
//        } else {
//            enoughFuel = false;
//            System.out.println("The plane isn't allowed to take off because it doesn't have enough fuel");
//        }
//        //return
//    }



}
