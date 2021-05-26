package com.example.bikeRegistration.controllers;

import com.example.bikeRegistration.entities.Bike;
import com.example.bikeRegistration.services.BikeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BikeController {

    private final BikeService bikeService;

    public BikeController(BikeService bikeService){
        this.bikeService = bikeService;
    }
    @GetMapping("/api/v1/bikes")
    public List<Bike> findAllBikes(){

        return bikeService.findAllBikes();
    }
    @GetMapping("/api/v1/bikes/{id}")
    public Bike findById(@PathVariable("id") long id){

        return bikeService.findById(id);
    }
    @PostMapping("/api/v1/bikes")
    public Bike save(@RequestBody  Bike bike ){
        return bikeService.saveBike(bike);
    }

}
