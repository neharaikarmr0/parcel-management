package com.spring.ParcelManagement.repo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.spring.ParcelManagement.rowmapper.BookingRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.spring.ParcelManagement.model.Booking;

@Repository
public class ParcelRepo {

	private final JdbcTemplate jdbcTemplate;

    public ParcelRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int addBooking(Booking booking){
        String sql = "insert into booking(fullname,username,sender_addr,sender_mobile,rec_name,rec_addr," +
                "rec_contact,par_wt,content_desc,del_speed,pack_pref,book_date,pickup_datetime," +
                "amt_paid,pay_mode, booking_id, status) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, booking.getFullname(),booking.getUsername(),booking.getSender_addr(),
                booking.getSender_mobile(), booking.getRec_name(),booking.getRec_addr(),booking.getRec_contact(),
                booking.getPar_wt(), booking.getContent_desc(),booking.getDel_speed(),booking.getPack_pref(),
                booking.getBook_date(), booking.getPickup_datetime(), booking.getAmt_paid(),booking.getPay_mode(),
                booking.getBooking_id(), booking.getStatus());
    }
    
    public List<Booking> viewBookings(String status) {
        String sql = "SELECT * FROM booking WHERE status = ?";
        
        return jdbcTemplate.query(sql, 
            new PreparedStatementSetter() {
                @Override
                public void setValues(PreparedStatement ps) throws SQLException {
                    ps.setString(1, status);
                }
            },
            new BookingRowMapper() 
        );
    }
    
    @SuppressWarnings("deprecation")
	public String displayTrackStatus(String booking_id){
        String sql = "select status from booking where booking_id=?";
        return jdbcTemplate.queryForObject(
                sql, new Object[]{booking_id}, String.class);
    }
}
