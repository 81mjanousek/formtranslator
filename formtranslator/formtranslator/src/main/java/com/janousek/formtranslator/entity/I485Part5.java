package com.janousek.formtranslator.entity;

import java.io.Serializable;
import java.util.Date;

public class I485Part5 implements Serializable {

	private static final long serialVersionUID = 1L;

	private Boolean statementCheck1;

	private Boolean statementCheck2;

	private String statementCheck2Language;

	private String fullName;

	private Date date;

	private String phoneNumber;

	private String interpreterLanguage;

	private String interpreterFullName;

	private Date interpreterDate;

	private String interpreterPhoneNumber;

	private String otherPersonFullName;

	private Date otherPersonDate;

	private String otherPersonPhoneNumber;

	private String otherPersonFirmNameAndAddress;

	private String otherPersonEmail;

	public Boolean getStatementCheck1() {
		return statementCheck1;
	}

	public void setStatementCheck1(Boolean statementCheck1) {
		this.statementCheck1 = statementCheck1;
	}

	public Boolean getStatementCheck2() {
		return statementCheck2;
	}

	public void setStatementCheck2(Boolean statementCheck2) {
		this.statementCheck2 = statementCheck2;
	}

	public String getStatementCheck2Language() {
		return statementCheck2Language;
	}

	public void setStatementCheck2Language(String statementCheck2Language) {
		this.statementCheck2Language = statementCheck2Language;
	}

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

	public String getInterpreterLanguage() {
		return interpreterLanguage;
	}

	public void setInterpreterLanguage(String interpreterLanguage) {
		this.interpreterLanguage = interpreterLanguage;
	}

	public String getInterpreterFullName() {
		return interpreterFullName;
	}

	public void setInterpreterFullName(String interpreterFullName) {
		this.interpreterFullName = interpreterFullName;
	}

	public Date getInterpreterDate() {
		return interpreterDate;
	}

	public void setInterpreterDate(Date interpreterDate) {
		this.interpreterDate = interpreterDate;
	}

	public String getInterpreterPhoneNumber() {
		return interpreterPhoneNumber;
	}

	public void setInterpreterPhoneNumber(String interpreterPhoneNumber) {
		this.interpreterPhoneNumber = interpreterPhoneNumber;
	}

	public String getOtherPersonFullName() {
		return otherPersonFullName;
	}

	public void setOtherPersonFullName(String otherPersonFullName) {
		this.otherPersonFullName = otherPersonFullName;
	}

	public Date getOtherPersonDate() {
		return otherPersonDate;
	}

	public void setOtherPersonDate(Date otherPersonDate) {
		this.otherPersonDate = otherPersonDate;
	}

	public String getOtherPersonPhoneNumber() {
		return otherPersonPhoneNumber;
	}

	public void setOtherPersonPhoneNumber(String otherPersonPhoneNumber) {
		this.otherPersonPhoneNumber = otherPersonPhoneNumber;
	}

	public String getOtherPersonFirmNameAndAddress() {
		return otherPersonFirmNameAndAddress;
	}

	public void setOtherPersonFirmNameAndAddress(
			String otherPersonFirmNameAndAddress) {
		this.otherPersonFirmNameAndAddress = otherPersonFirmNameAndAddress;
	}

	public String getOtherPersonEmail() {
		return otherPersonEmail;
	}

	public void setOtherPersonEmail(String otherPersonEmail) {
		this.otherPersonEmail = otherPersonEmail;
	}

}
