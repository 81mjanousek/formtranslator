package com.janousek.formtranslator.entity;

import java.io.Serializable;

import com.janousek.formtranslator.annotation.PdfField;

public class I485Part2 implements Serializable {

	/**
   * 
   */
	private static final long serialVersionUID = 1L;

	@PdfField(alternateFieldName = "part2.a")
	private Boolean a;

	@PdfField(alternateFieldName = "part2.b")
	private Boolean b;

	@PdfField(alternateFieldName = "part2.c")
	private Boolean c;

	@PdfField(alternateFieldName = "part2.d")
	private Boolean d;

	@PdfField(alternateFieldName = "part2.e")
	private Boolean e;

	@PdfField(alternateFieldName = "part2.f")
	private Boolean f;

	@PdfField(alternateFieldName = "part2.g")
	private Boolean g;

	@PdfField(alternateFieldName = "part2.h")
	private Boolean h;

	@PdfField(alternateFieldName = "part2.hother")
	private String hother;

	@PdfField(alternateFieldName = "part2.i")
	private Boolean i;

	@PdfField(alternateFieldName = "part2.j")
	private Boolean j;

	public Boolean getA() {
		return a;
	}

	public void setA(Boolean a) {
		this.a = a;
	}

	public Boolean getB() {
		return b;
	}

	public void setB(Boolean b) {
		this.b = b;
	}

	public Boolean getC() {
		return c;
	}

	public void setC(Boolean c) {
		this.c = c;
	}

	public Boolean getD() {
		return d;
	}

	public void setD(Boolean d) {
		this.d = d;
	}

	public Boolean getE() {
		return e;
	}

	public void setE(Boolean e) {
		this.e = e;
	}

	public Boolean getF() {
		return f;
	}

	public void setF(Boolean f) {
		this.f = f;
	}

	public Boolean getG() {
		return g;
	}

	public void setG(Boolean g) {
		this.g = g;
	}

	public Boolean getH() {
		return h;
	}

	public void setH(Boolean h) {
		this.h = h;
	}

	public String getHother() {
		return hother;
	}

	public void setHother(String hother) {
		this.hother = hother;
	}

	public Boolean getI() {
		return i;
	}

	public void setI(Boolean i) {
		this.i = i;
	}

	public Boolean getJ() {
		return j;
	}

	public void setJ(Boolean j) {
		this.j = j;
	}

}
