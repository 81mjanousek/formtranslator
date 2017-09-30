package com.janousek.formtranslator.entity;

import java.io.Serializable;
import java.util.Date;

import com.janousek.formtranslator.annotation.PdfField;

public class Relative implements Serializable {

	private static final long serialVersionUID = 1L;

	@PdfField
	private String familyName;

	@PdfField
	private String givenName;

	@PdfField
	private String middleInitial;

	@PdfField
	private Date dateOfBirth;

	@PdfField
	private String countryOfBirth;

	@PdfField
	private String relationShip;

	@PdfField
	private String anumber;

	@PdfField
	private Boolean applyingWithYouYes;

	@PdfField
	private Boolean applyingWithYouNo;

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

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
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

	public String getRelationShip() {
		return relationShip;
	}

	public void setRelationShip(String relationShip) {
		this.relationShip = relationShip;
	}

	public String getAnumber() {
		return anumber;
	}

	public void setAnumber(String anumber) {
		this.anumber = anumber;
	}

	public Boolean getApplyingWithYouYes() {
		return applyingWithYouYes;
	}

	public void setApplyingWithYouYes(Boolean applyingWithYouYes) {
		this.applyingWithYouYes = applyingWithYouYes;
	}

	public Boolean getApplyingWithYouNo() {
		return applyingWithYouNo;
	}

	public void setApplyingWithYouNo(Boolean applyingWithYouNo) {
		this.applyingWithYouNo = applyingWithYouNo;
	}

}
