package com.example.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.BookingDetails;

@Repository
public interface BookingDetailsDao extends JpaRepository<BookingDetails, Integer> {

}
