package com.janousek.formtranslator.entity;

import java.io.Serializable;

public class I485Form implements Serializable {

	private static final long serialVersionUID = 1L;

	private BasicForm partOne = new BasicForm();

	private I485Part2 partTwo = new I485Part2();

	private I485Part3 partThree = new I485Part3();

	private I485Part4 partFour = new I485Part4();

	private I485Part5 partFive;

	private I485Part6 partSix;

	public BasicForm getPartOne() {
		return partOne;
	}

	public void setPartOne(BasicForm partOne) {
		this.partOne = partOne;
	}

	public I485Part2 getPartTwo() {
		return partTwo;
	}

	public void setPartTwo(I485Part2 partTwo) {
		this.partTwo = partTwo;
	}

	public I485Part3 getPartThree() {
		return partThree;
	}

	public void setPartThree(I485Part3 partThree) {
		this.partThree = partThree;
	}

	public I485Part4 getPartFour() {
		return partFour;
	}

	public void setPartFour(I485Part4 partFour) {
		this.partFour = partFour;
	}

	public I485Part5 getPartFive() {
		if (partFive == null)
			partFive = new I485Part5();
		return partFive;
	}

	public void setPartFive(I485Part5 partFive) {
		this.partFive = partFive;
	}

	public I485Part6 getPartSix() {
		if (partSix == null)
			partSix = new I485Part6();
		return partSix;
	}

	public void setPartSix(I485Part6 partSix) {
		this.partSix = partSix;
	}

}
