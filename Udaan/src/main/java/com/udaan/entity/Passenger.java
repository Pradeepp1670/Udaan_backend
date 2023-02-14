package com.udaan.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Passenger {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String pname;
	private int pAge;
	private String gender;
	private String pmobile;
	private String pemail;
	private String pcountry;
	
	
	@ManyToOne
	@JoinColumn(name = "booking_id")
	private Booking booking;
	
	@ManyToOne
	@JoinColumn(name = "flight_id")
	private Flight flight;
	


	
}
