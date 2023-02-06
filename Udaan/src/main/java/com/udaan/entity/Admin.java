package com.udaan.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Admin {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aId;
	private String aname;
	private String aemail;
	private String apassword;

}	

