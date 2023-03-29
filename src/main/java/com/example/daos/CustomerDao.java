package com.example.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Customer;
@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
