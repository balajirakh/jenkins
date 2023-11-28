package com.example.IRCTC.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.IRCTC.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
