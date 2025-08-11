package com.spring.ParcelManagement.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.ParcelManagement.model.Booking;

public class BookingRowMapper implements RowMapper<Booking> {
    @Override
    public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
        Booking booking = new Booking();
        booking.setFullname(rs.getString("fullname"));
        booking.setUsername(rs.getString("username"));
        booking.setSender_addr(rs.getString("sender_addr"));
        booking.setSender_mobile(rs.getString("sender_mobile"));
        booking.setRec_name(rs.getString("rec_name"));
        booking.setRec_addr(rs.getString("rec_addr"));
        booking.setRec_contact(rs.getString("rec_contact"));
        booking.setPar_wt(rs.getString("par_wt"));
        booking.setContent_desc(rs.getString("content_desc"));
        booking.setDel_speed(rs.getString("del_speed"));
        booking.setPack_pref(rs.getString("pack_pref"));
        booking.setBook_date(rs.getString("book_date"));
        booking.setPickup_datetime(rs.getString("pickup_datetime"));
        booking.setAmt_paid(rs.getString("amt_paid"));
        booking.setPay_mode(rs.getString("pay_mode"));
        booking.setBooking_id(rs.getString("booking_id"));
        booking.setStatus(rs.getString("status"));
        return booking;
    }
}
