package com.example.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.daos.BookingDetailsDao;
import com.example.daos.CustomerDao;
import com.example.entities.BookingDetails;
import com.example.entities.Customer;

@Service
public class OperatorServicesImpl implements OperatorServices {
	@Autowired
	private CustomerDao CustomerRepository;

	@Autowired
	private BookingDetailsDao BookingDetailsRepository;

	@Override
	public List<BookingDetails> getAllBooking() {
		return BookingDetailsRepository.findAll();
	}

	@Override
	public String addBooking(BookingDetails b) {

		boolean c = CustomerRepository.existsById(b.getCustomerId());
		/*
		 * here we check that the entered customer is currect or not if currect we add
		 * booking successfully or else send msg to add customer id currectly
		 */
		if (c) {
			BookingDetailsRepository.save(b);
			return "booking done successfully for customer id :" + b.getCustomerId();
		} else
			return "booking failed please enter currect customer id";

	}

	@Override
	public BookingDetails editBooking(BookingDetails b) {
		return BookingDetailsRepository.save(b);
	}

	@Override
	public String deleteBooking(int id) {
		BookingDetailsRepository.deleteById(id);
		return "booking deleted haveing id" + id;

	}

	@Override
	public Customer addCustomer(Customer c) {
		return CustomerRepository.save(c);
	}

	@Override
	public Customer editCustomer(Customer customer) {
		return CustomerRepository.save(customer);
	}

}
