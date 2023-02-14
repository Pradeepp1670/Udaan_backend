package com.udaan.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Booking {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	
	private String pnr;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private Customer user;
	
	@OneToMany(mappedBy = "booking",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Passenger> passenger;
	
	
	
}
