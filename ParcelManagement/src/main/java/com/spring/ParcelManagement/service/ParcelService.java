package com.spring.ParcelManagement.service;

import com.spring.ParcelManagement.model.Booking;
import com.spring.ParcelManagement.repo.ParcelRepo;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ParcelService {

	ParcelRepo repo;
    @Autowired
     public ParcelService(ParcelRepo repo) {
         this.repo = repo;
     }
    
    public int addBooking(Booking booking) {
        //log.info("booking: {}", booking);
        int booked = repo.addBooking(booking);
        return booked;
    }
    
    public List<Booking> viewBookings(String status){
        List<Booking> prevBook = repo.viewBookings(status);
        return prevBook;
}
    public String displayTrackStatus(String booking_id){
        String status = repo.displayTrackStatus(booking_id);
        return status;
    }
}


