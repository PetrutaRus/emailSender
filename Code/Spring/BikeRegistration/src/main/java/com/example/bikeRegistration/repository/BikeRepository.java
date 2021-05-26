package com.example.bikeRegistration.repository;

import com.example.bikeRegistration.entities.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long > {
    Bike findById(long id);

}
