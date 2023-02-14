package com.udaan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udaan.entity.Customer;
import com.udaan.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@PostMapping("/login")
	public boolean loginCustomer(@RequestBody Customer customer) {
		System.out.println("Customer = " + customer);
		service.login(customer);
		if(service.login(customer)==true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@PostMapping("/register")
	public boolean regitserUser(@RequestBody Customer customer) {
		System.out.println("Customer = " + customer);
		return service.register(customer);
	}

	@GetMapping("/user")
	public ResponseEntity<String> normalUser(){
		return ResponseEntity.ok("Yes, I am User");
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> admin(){
		return ResponseEntity.ok("Yes, I am Admin");
	}
	@GetMapping("/public")
	public ResponseEntity<String> publicUser(){
		return ResponseEntity.ok("Yes, I am Public user");
	}

}