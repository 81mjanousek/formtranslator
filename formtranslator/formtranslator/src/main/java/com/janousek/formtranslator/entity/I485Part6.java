package com.janousek.formtranslator.entity;

import java.io.Serializable;
import java.util.Date;

public class I485Part6 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String fullName;

	private Date date;

	private String phoneNumber;

	private String firmNameAndAddress;

	private String email;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirmNameAndAddress() {
		return firmNameAndAddress;
	}

	public void setFirmNameAndAddress(String firmNameAndAddress) {
		this.firmNameAndAddress = firmNameAndAddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
