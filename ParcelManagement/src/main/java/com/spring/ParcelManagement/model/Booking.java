package com.spring.ParcelManagement.model;

import lombok.Data;

@Data
public class Booking {

    String fullname;
  String username;
    String sender_addr;
   String sender_mobile;
    String rec_name;
    String rec_addr;
    String rec_contact;
   String par_wt;
    String content_desc;
    String del_speed;
    String pack_pref;
    String book_date;
    String pickup_datetime;
    String amt_paid;
    String pay_mode;
    String booking_id;
    String status="booked";
}
