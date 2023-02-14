package com.udaan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udaan.entity.Passenger;
import com.udaan.repo.PassengerRepository;

@Service
public class PassengerService {

	@Autowired
	PassengerRepository prepo;
	
	public Passenger addPassenger(Passenger p1) {
		Passenger pas = new Passenger();
		pas.setPname(p1.getPname());
		pas.setGender(p1.getGender());
		pas.setPAge(p1.getPAge());
		pas.setPcountry(p1.getPcountry());
		pas.setPemail(p1.getPemail());
		pas.setPmobile(p1.getPmobile());
		
		return prepo.save(pas);
	}
	
	
}
