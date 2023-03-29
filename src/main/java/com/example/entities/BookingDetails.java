package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking_details")
public class BookingDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_id")
	private int bookingId;

	@Column(name = "location_id")
	private String locationId;

	@Column(name = "description")
	private String description;

	@Column(name = "drone_shot_id")
	private String droneShotId;

	@Column(name = "booking_time")
	private String bookingTime;

	@Column(name = "customerId")
	private int customerId;

	public BookingDetails() {
		super();

	}

	public BookingDetails(int bookingId, String locationId, String description, String droneShotId, String bookingTime,
			int customerId) {
		super();
		this.bookingId = bookingId;
		this.locationId = locationId;
		this.description = description;
		this.droneShotId = droneShotId;
		this.bookingTime = bookingTime;
		this.customerId = customerId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDroneShotId() {
		return droneShotId;
	}

	public void setDroneShotId(String droneShotId) {
		this.droneShotId = droneShotId;
	}

	public String getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

}
