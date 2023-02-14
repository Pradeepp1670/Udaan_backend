package com.udaan.entity;

import lombok.Data;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Data
public class Customer {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	private String uname;
	private String uemail;
	private String upassword;
	private int uage;
	private String uphone;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Booking> booking;


}
