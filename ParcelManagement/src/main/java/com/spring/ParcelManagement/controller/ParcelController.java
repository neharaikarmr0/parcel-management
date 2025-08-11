package com.spring.ParcelManagement.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ParcelManagement.model.Booking;
import com.spring.ParcelManagement.service.ParcelService;

@RestController
@RequestMapping("/parcel")
public class ParcelController {

	private final ParcelService service;
    @Autowired
    public ParcelController(ParcelService service) {
        this.service = service;
    }

    @PostMapping("/bookParcel")
    @ResponseBody
    public Map<String, String> bookParcel(@RequestBody Booking booking) {
    	Map<String, String> response = new HashMap<>();
            int booked = service.addBooking(booking);
            if(booked==1) {
                response.put("message", "Booking successful for "+booking.getFullname());
                return response;
            }
            response.put("message", "Booking Unsuccessful");
            return response;
    }
    
    @GetMapping("/previousBooking/{status}")
    @ResponseBody
    public List<Booking> previousBooking(@PathVariable String status) {
        List<Booking> previousBookings = service.viewBookings(status);
        
        return previousBookings;
    }
    
    @GetMapping("/displayTrackingStatus")
    @ResponseBody
    public String trackStatus(@RequestParam String booking_id) {
//        log.info("booking_id: " + booking_id);
//        log.info("trackStatus");
    	System.out.println("booking id - "+booking_id);
            String status = service.displayTrackStatus(booking_id);
        //log.info(status);
            return status;
    }
}
