package com.udaan.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
public class Schedule {

	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private Date arrTime;
	private Date depTime;
	private String boarding;
	private String destination;
	
	@OneToOne(mappedBy = "schedule",cascade = CascadeType.ALL,fetch = FetchType.LAZY )
	private Flight flight;
	
}
