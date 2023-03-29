package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.BookingDetails;
import com.example.entities.Customer;
import com.example.services.OperatorServices;

@CrossOrigin
@RestController
@RequestMapping("/")
public class OperatorController {

	@Autowired
	private OperatorServices operatorServices;

	// below method is used for getting all bookings
	@GetMapping("/getallbookings")
	public List<BookingDetails> getAllBooking() {
		return operatorServices.getAllBooking();
	}

	// below method is for adding new booking
	@PostMapping("/addbooking")
	public String addbooking(@RequestBody BookingDetails b) {
		return operatorServices.addBooking(b);
	}

	// below method is for editing existing bookings
	@PutMapping("/editbooking")
	public BookingDetails editBooking(@RequestBody BookingDetails b) {
		return operatorServices.editBooking(b);
	}

	// below method is for deleting booking
	@DeleteMapping("/deletebooking/{id}")
	public String deleteBooking(@PathVariable int id) {
		return operatorServices.deleteBooking(id);

	}

	// below method is for adding new customer
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer c) {
		return operatorServices.addCustomer(c);
	}

	// below method is for editing new customer
	@PutMapping("/editcustomer")
	public Customer editCustomer(@RequestBody Customer customer) {
		return operatorServices.editCustomer(customer);
	}

}
