package com.example.bikeRegistration.services;

import com.example.bikeRegistration.entities.Bike;

import java.util.List;

public interface BikeService {
    List<Bike> findAllBikes();
    Bike saveBike (Bike bike);
    Bike findById (long id);

}
