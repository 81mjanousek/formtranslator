package com.janousek.formtranslator.entity;

import java.io.Serializable;
import java.util.Date;

import com.janousek.formtranslator.annotation.PdfField;

public class Membership implements Serializable {

	private static final long serialVersionUID = 1L;

	@PdfField
	private String name;

	@PdfField
	private String locationAndNature;

	@PdfField
	private Date membershipFrom;

	@PdfField
	private Date membershipTo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocationAndNature() {
		return locationAndNature;
	}

	public void setLocationAndNature(String locationAndNature) {
		this.locationAndNature = locationAndNature;
	}

	public Date getMembershipFrom() {
		return membershipFrom;
	}

	public void setMembershipFrom(Date membershipFrom) {
		this.membershipFrom = membershipFrom;
	}

	public Date getMembershipTo() {
		return membershipTo;
	}

	public void setMembershipTo(Date membershipTo) {
		this.membershipTo = membershipTo;
	}

}
