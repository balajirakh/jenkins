package com.example.IRCTC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IRCTC.Repository.PassengerRepository;
import com.example.IRCTC.model.Passenger;
import com.example.IRCTC.model.Ticket;

@Service
public class PassengerServiceImpl implements PassengerServiceI {
	
@Autowired
	private PassengerRepository passengerRepository;

@Override
public Ticket bookticket(Passenger ps) {
	
	Passenger save = passengerRepository.save(ps);
	
	if(save !=null) {
		Ticket t=new Ticket();
		t.setTid(1);
		t.setTpnr("12345");
		t.setTicketStatus("Booked");
		t.setTprice(1000.00);
		
		return t;
		
		
	}else
	return null;
	
}
}
