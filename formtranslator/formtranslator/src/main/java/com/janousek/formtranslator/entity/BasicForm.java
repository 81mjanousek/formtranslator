package com.janousek.formtranslator.entity;

import java.io.Serializable;
import java.util.Date;

import com.janousek.formtranslator.annotation.PdfField;

public class BasicForm implements Serializable {

	/**
   * 
   */
	private static final long serialVersionUID = 1L;

	@PdfField
	private String familyName;

	@PdfField
	private String givenName;

	@PdfField
	private String middleName;

	@PdfField
	private String address;

	@PdfField
	private String aptNo;

	@PdfField
	private String inCareOf;

	@PdfField
	private String city;

	@PdfField
	private String state;

	@PdfField
	private String zipCode;

	@PdfField
	private Date dateOfBirth;

	@PdfField
	private String countryOfBirth;

	@PdfField
	private String countryOfCitizenship;

	@PdfField
	private String usSocialSecurityNumber;

	@PdfField
	private String anumber;

	@PdfField
	private Date dateOfLastArrival;

	@PdfField
	private String i94Number;

	@PdfField
	private String currentUSCISStatus;

	@PdfField
	private Date expiresOn;

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAptNo() {
		return aptNo;
	}

	public void setAptNo(String aptNo) {
		this.aptNo = aptNo;
	}

	public String getInCareOf() {
		return inCareOf;
	}

	public void setInCareOf(String inCareOf) {
		this.inCareOf = inCareOf;
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCountryOfBirth() {
		return countryOfBirth;
	}

	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}

	public String getCountryOfCitizenship() {
		return countryOfCitizenship;
	}

	public void setCountryOfCitizenship(String countryOfCitizenship) {
		this.countryOfCitizenship = countryOfCitizenship;
	}

	public String getUsSocialSecurityNumber() {
		return usSocialSecurityNumber;
	}

	public void setUsSocialSecurityNumber(String usSocialSecurityNumber) {
		this.usSocialSecurityNumber = usSocialSecurityNumber;
	}

	public Date getDateOfLastArrival() {
		return dateOfLastArrival;
	}

	public void setDateOfLastArrival(Date dateOfLastArrival) {
		this.dateOfLastArrival = dateOfLastArrival;
	}

	public String getI94Number() {
		return i94Number;
	}

	public void setI94Number(String i94Number) {
		this.i94Number = i94Number;
	}

	public String getCurrentUSCISStatus() {
		return currentUSCISStatus;
	}

	public void setCurrentUSCISStatus(String currentUSCISStatus) {
		this.currentUSCISStatus = currentUSCISStatus;
	}

	public Date getExpiresOn() {
		return expiresOn;
	}

	public void setExpiresOn(Date expiresOn) {
		this.expiresOn = expiresOn;
	}

	public String getAnumber() {
		return anumber;
	}

	public void setAnumber(String anumber) {
		this.anumber = anumber;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
