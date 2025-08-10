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
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSender_addr() {
		return sender_addr;
	}
	public void setSender_addr(String sender_addr) {
		this.sender_addr = sender_addr;
	}
	public String getSender_mobile() {
		return sender_mobile;
	}
	public void setSender_mobile(String sender_mobile) {
		this.sender_mobile = sender_mobile;
	}
	public String getRec_name() {
		return rec_name;
	}
	public void setRec_name(String rec_name) {
		this.rec_name = rec_name;
	}
	public String getRec_addr() {
		return rec_addr;
	}
	public void setRec_addr(String rec_addr) {
		this.rec_addr = rec_addr;
	}
	public String getRec_contact() {
		return rec_contact;
	}
	public void setRec_contact(String rec_contact) {
		this.rec_contact = rec_contact;
	}
	public String getPar_wt() {
		return par_wt;
	}
	public void setPar_wt(String par_wt) {
		this.par_wt = par_wt;
	}
	public String getContent_desc() {
		return content_desc;
	}
	public void setContent_desc(String content_desc) {
		this.content_desc = content_desc;
	}
	public String getDel_speed() {
		return del_speed;
	}
	public void setDel_speed(String del_speed) {
		this.del_speed = del_speed;
	}
	public String getPack_pref() {
		return pack_pref;
	}
	public void setPack_pref(String pack_pref) {
		this.pack_pref = pack_pref;
	}
	public String getBook_date() {
		return book_date;
	}
	public void setBook_date(String book_date) {
		this.book_date = book_date;
	}
	public String getPickup_datetime() {
		return pickup_datetime;
	}
	public void setPickup_datetime(String pickup_datetime) {
		this.pickup_datetime = pickup_datetime;
	}
	public String getAmt_paid() {
		return amt_paid;
	}
	public void setAmt_paid(String amt_paid) {
		this.amt_paid = amt_paid;
	}
	public String getPay_mode() {
		return pay_mode;
	}
	public void setPay_mode(String pay_mode) {
		this.pay_mode = pay_mode;
	}
	public String getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(String booking_id) {
		this.booking_id = booking_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
