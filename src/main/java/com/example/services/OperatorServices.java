package com.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.BookingDetails;
import com.example.entities.Customer;

@Service
public interface OperatorServices {

	List<BookingDetails> getAllBooking();

	String addBooking(BookingDetails b);

	BookingDetails editBooking(BookingDetails b);

	String deleteBooking(int id);

	Customer addCustomer(Customer c);

	Customer editCustomer(Customer customer);

	

}
