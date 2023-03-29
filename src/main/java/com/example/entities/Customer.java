package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "customer_fname")
	private String customerFirstName;

	@Column(name = "customer_lname")
	private String customerLastName;

	@Column(name = "gender")
	private String gender;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "addharNo")
	private String addharNo;

	@Column(name = "landmark")
	private String landmark;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "pincode")
	private String pincode;

	public Customer(int customerId, String customerFirstName, String customerLastName, String gender, String email,
			String phoneNumber, String password, String addharNo, String landmark, String city, String state,
			String pincode) {
		super();
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.addharNo = addharNo;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public Customer() {
		super();
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddharNo() {
		return addharNo;
	}

	public void setAddharNo(String addharNo) {
		this.addharNo = addharNo;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", gender=" + gender + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", addharNo=" + addharNo + ", landmark=" + landmark + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + ",+ ]";
	}

}
