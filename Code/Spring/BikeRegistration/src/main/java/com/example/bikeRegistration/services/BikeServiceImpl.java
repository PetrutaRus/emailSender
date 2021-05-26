package com.example.bikeRegistration.services;

import com.example.bikeRegistration.entities.Bike;
import com.example.bikeRegistration.repository.BikeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BikeServiceImpl implements BikeService  {
    private final BikeRepository bikeRepository;

    public BikeServiceImpl(BikeRepository bikeRepository){
        this.bikeRepository = bikeRepository;
    }
    @Override
    public List<Bike> findAllBikes() {

        return bikeRepository.findAll();
    }

    @Override
    public Bike saveBike(Bike bike){

        return bikeRepository.save(bike);
    }

    @Override
    public Bike findById(long id){

        return bikeRepository.findById(id);
    }

}