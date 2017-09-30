package com.janousek.formtranslator.entity;

import java.io.Serializable;

import com.janousek.formtranslator.annotation.PdfField;

public class I485Part4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@PdfField
	private Boolean requestForAccomodationYes;

	@PdfField
	private Boolean requestForAccomodationNo;

	@PdfField
	private Boolean checkA;

	@PdfField
	private Boolean checkB;

	@PdfField
	private Boolean checkC;

	@PdfField(alternateFieldName = "part4.a")
	private String a;

	@PdfField(alternateFieldName = "part4.b")
	private String b;

	@PdfField(alternateFieldName = "part4.c")
	private String c;

	public Boolean getRequestForAccomodationYes() {
		return requestForAccomodationYes;
	}

	public void setRequestForAccomodationYes(Boolean requestForAccomodationYes) {
		this.requestForAccomodationYes = requestForAccomodationYes;
	}

	public Boolean getRequestForAccomodationNo() {
		return requestForAccomodationNo;
	}

	public void setRequestForAccomodationNo(Boolean requestForAccomodationNo) {
		this.requestForAccomodationNo = requestForAccomodationNo;
	}

	public Boolean getCheckA() {
		return checkA;
	}

	public void setCheckA(Boolean checkA) {
		this.checkA = checkA;
	}

	public Boolean getCheckB() {
		return checkB;
	}

	public void setCheckB(Boolean checkB) {
		this.checkB = checkB;
	}

	public Boolean getCheckC() {
		return checkC;
	}

	public void setCheckC(Boolean checkC) {
		this.checkC = checkC;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

}
