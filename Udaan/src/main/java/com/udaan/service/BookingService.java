package com.udaan.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udaan.entity.Booking;
import com.udaan.repo.BookingRepository;

@Service
public class BookingService {

	@Autowired
	BookingRepository brepo;

	public void addBooking() {
		String pnr = UUID.randomUUID().toString();
		Booking b1 = new Booking();
		b1.setPnr(pnr);
		brepo.save(b1);
	}
}
