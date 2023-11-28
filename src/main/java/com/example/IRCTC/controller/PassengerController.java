package com.example.IRCTC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.IRCTC.model.Passenger;
import com.example.IRCTC.model.Ticket;
import com.example.IRCTC.service.PassengerServiceI;

@RestController
public class PassengerController {
	
	@Autowired
	private PassengerServiceI passengerServiceI;
	
	@PostMapping(value="/bookticket",consumes = "application/json" , produces = "application/json")
	public ResponseEntity<Ticket> bookticket(@RequestBody Passenger ps ){
	
		Ticket bookticket = passengerServiceI.bookticket(ps);
		
		
		return new ResponseEntity<Ticket>(bookticket,HttpStatus.CREATED) ;
		
		
		
	}

}
