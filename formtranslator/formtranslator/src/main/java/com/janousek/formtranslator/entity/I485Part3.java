package com.janousek.formtranslator.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.janousek.formtranslator.annotation.PdfField;
import com.janousek.formtranslator.web.util.DateToStringFormatter;

public class I485Part3 implements Serializable {

	public I485Part3() {
		super();
		relatives = new ArrayList<Relative>();
		for (int i = 0; i < 5; i++) {
			relatives.add(new Relative());
		}
		memberships = new ArrayList<Membership>();
		for (int i = 0; i < 6; i++) {
			memberships.add(new Membership());
		}
	}

	private static final long serialVersionUID = 1L;

	@PdfField
	private String cityOfBirth;

	@PdfField
	private String currentOccupation;

	@PdfField
	private String mothersFirstName;

	@PdfField
	private String fathersFirstName;

	@PdfField
	private String nameOnI94ArrivalDepartureRecord;

	@PdfField
	private String placeOfLastEntryIntoUS;

	@PdfField
	private String statusOfLastEnter;

	@PdfField
	private Boolean inspectedByImmigrationYes;

	@PdfField
	private Boolean inspectedByImmigrationNo;

	@PdfField
	private String nonImmigrantVisaNumber;

	@PdfField
	private String consulateWhereVisaWasIssued;

	@PdfField
	private Date dateVisaIssued;

	@PdfField
	private Boolean genderMale;

	@PdfField
	private Boolean genderFemale;

	@PdfField
	private Boolean maritalStatusMarried;

	@PdfField
	private Boolean maritalStatusSingle;

	@PdfField
	private Boolean maritalStatusDivorced;

	@PdfField
	private Boolean maritalStatusWidowed;

	@PdfField
	private Boolean appliedForPermanentResidentStatusBeforeYes;

	@PdfField
	private Boolean appliedForPermanentResidentStatusBeforeNo;

	private Date dateOfFiling;

	private String placeOfFiling;

	@PdfField
	private String dateAndPlaceOfFiling;

	private List<Relative> relatives;

	private List<Membership> memberships;

	@PdfField
	private Boolean question1aYes;

	@PdfField
	private Boolean question1aNo;

	@PdfField
	private Boolean question1bYes;

	@PdfField
	private Boolean question1bNo;

	@PdfField
	private Boolean question1cYes;

	@PdfField
	private Boolean question1cNo;

	@PdfField
	private Boolean question1dYes;

	@PdfField
	private Boolean question1dNo;

	@PdfField
	private Boolean question2Yes;

	@PdfField
	private Boolean question2No;

	@PdfField
	private Boolean question3aYes;

	@PdfField
	private Boolean question3aNo;

	@PdfField
	private Boolean question3bYes;

	@PdfField
	private Boolean question3bNo;

	@PdfField
	private Boolean question3cYes;

	@PdfField
	private Boolean question3cNo;

	@PdfField
	private Boolean question3dYes;

	@PdfField
	private Boolean question3dNo;

	@PdfField
	private Boolean question4Yes;

	@PdfField
	private Boolean question4No;

	@PdfField
	private Boolean question5aYes;

	@PdfField
	private Boolean question5aNo;

	@PdfField
	private Boolean question5bYes;

	@PdfField
	private Boolean question5bNo;

	@PdfField
	private Boolean question5cYes;

	@PdfField
	private Boolean question5cNo;

	@PdfField
	private Boolean question6Yes;

	@PdfField
	private Boolean question6No;

	@PdfField
	private Boolean question7Yes;

	@PdfField
	private Boolean question7No;

	@PdfField
	private Boolean question8Yes;

	@PdfField
	private Boolean question8No;

	@PdfField
	private Boolean question9Yes;

	@PdfField
	private Boolean question9No;

	@PdfField
	private Boolean question10Yes;

	@PdfField
	private Boolean question10No;

	@PdfField
	private Boolean question11Yes;

	@PdfField
	private Boolean question11No;

	@PdfField
	private Boolean question12Yes;

	@PdfField
	private Boolean question12No;

	@PdfField
	private Boolean question13Yes;

	@PdfField
	private Boolean question13No;

	@PdfField
	private Boolean question14aYes;

	@PdfField
	private Boolean question14aNo;

	@PdfField
	private Boolean question14bYes;

	@PdfField
	private Boolean question14bNo;

	@PdfField
	private Boolean question14cYes;

	@PdfField
	private Boolean question14cNo;

	@PdfField
	private Boolean question14dYes;

	@PdfField
	private Boolean question14dNo;

	@PdfField
	private Boolean question14eYes;

	@PdfField
	private Boolean question14eNo;

	@PdfField
	private Boolean question15aYes;

	@PdfField
	private Boolean question15aNo;

	@PdfField
	private Boolean question15bYes;

	@PdfField
	private Boolean question15bNo;

	@PdfField
	private Boolean question16Yes;

	@PdfField
	private Boolean question16No;

	@PdfField
	private Boolean question17Yes;

	@PdfField
	private Boolean question17No;

	@PdfField
	private Boolean question18Yes;

	@PdfField
	private Boolean question18No;

	public String getCityOfBirth() {
		return cityOfBirth;
	}

	public void setCityOfBirth(String cityOfBirth) {
		this.cityOfBirth = cityOfBirth;
	}

	public String getCurrentOccupation() {
		return currentOccupation;
	}

	public void setCurrentOccupation(String currentOccupation) {
		this.currentOccupation = currentOccupation;
	}

	public String getMothersFirstName() {
		return mothersFirstName;
	}

	public void setMothersFirstName(String mothersFirstName) {
		this.mothersFirstName = mothersFirstName;
	}

	public String getFathersFirstName() {
		return fathersFirstName;
	}

	public void setFathersFirstName(String fathersFirstName) {
		this.fathersFirstName = fathersFirstName;
	}

	public String getNameOnI94ArrivalDepartureRecord() {
		return nameOnI94ArrivalDepartureRecord;
	}

	public void setNameOnI94ArrivalDepartureRecord(
			String nameOnI94ArrivalDepartureRecord) {
		this.nameOnI94ArrivalDepartureRecord = nameOnI94ArrivalDepartureRecord;
	}

	public String getPlaceOfLastEntryIntoUS() {
		return placeOfLastEntryIntoUS;
	}

	public void setPlaceOfLastEntryIntoUS(String placeOfLastEntryIntoUS) {
		this.placeOfLastEntryIntoUS = placeOfLastEntryIntoUS;
	}

	public String getStatusOfLastEnter() {
		return statusOfLastEnter;
	}

	public void setStatusOfLastEnter(String statusOfLastEnter) {
		this.statusOfLastEnter = statusOfLastEnter;
	}

	public Boolean getInspectedByImmigrationYes() {
		return inspectedByImmigrationYes;
	}

	public void setInspectedByImmigrationYes(Boolean inspectedByImmigrationYes) {
		this.inspectedByImmigrationYes = inspectedByImmigrationYes;
	}

	public Boolean getInspectedByImmigrationNo() {
		return inspectedByImmigrationNo;
	}

	public void setInspectedByImmigrationNo(Boolean inspectedByImmigrationNo) {
		this.inspectedByImmigrationNo = inspectedByImmigrationNo;
	}

	public String getNonImmigrantVisaNumber() {
		return nonImmigrantVisaNumber;
	}

	public void setNonImmigrantVisaNumber(String nonImmigrantVisaNumber) {
		this.nonImmigrantVisaNumber = nonImmigrantVisaNumber;
	}

	public String getConsulateWhereVisaWasIssued() {
		return consulateWhereVisaWasIssued;
	}

	public void setConsulateWhereVisaWasIssued(
			String consulateWhereVisaWasIssued) {
		this.consulateWhereVisaWasIssued = consulateWhereVisaWasIssued;
	}

	public Date getDateVisaIssued() {
		return dateVisaIssued;
	}

	public void setDateVisaIssued(Date dateVisaIssued) {
		this.dateVisaIssued = dateVisaIssued;
	}

	public Boolean getGenderMale() {
		return genderMale;
	}

	public void setGenderMale(Boolean genderMale) {
		this.genderMale = genderMale;
	}

	public Boolean getGenderFemale() {
		return genderFemale;
	}

	public void setGenderFemale(Boolean genderFemale) {
		this.genderFemale = genderFemale;
	}

	public Boolean getMaritalStatusMarried() {
		return maritalStatusMarried;
	}

	public void setMaritalStatusMarried(Boolean maritalStatusMarried) {
		this.maritalStatusMarried = maritalStatusMarried;
	}

	public Boolean getMaritalStatusSingle() {
		return maritalStatusSingle;
	}

	public void setMaritalStatusSingle(Boolean maritalStatusSingle) {
		this.maritalStatusSingle = maritalStatusSingle;
	}

	public Boolean getMaritalStatusDivorced() {
		return maritalStatusDivorced;
	}

	public void setMaritalStatusDivorced(Boolean maritalStatusDivorced) {
		this.maritalStatusDivorced = maritalStatusDivorced;
	}

	public Boolean getMaritalStatusWidowed() {
		return maritalStatusWidowed;
	}

	public void setMaritalStatusWidowed(Boolean maritalStatusWidowed) {
		this.maritalStatusWidowed = maritalStatusWidowed;
	}

	public Boolean getAppliedForPermanentResidentStatusBeforeYes() {
		return appliedForPermanentResidentStatusBeforeYes;
	}

	public void setAppliedForPermanentResidentStatusBeforeYes(
			Boolean appliedForPermanentResidentStatusBeforeYes) {
		this.appliedForPermanentResidentStatusBeforeYes = appliedForPermanentResidentStatusBeforeYes;
	}

	public Boolean getAppliedForPermanentResidentStatusBeforeNo() {
		return appliedForPermanentResidentStatusBeforeNo;
	}

	public void setAppliedForPermanentResidentStatusBeforeNo(
			Boolean appliedForPermanentResidentStatusBeforeNo) {
		this.appliedForPermanentResidentStatusBeforeNo = appliedForPermanentResidentStatusBeforeNo;
	}

	public Date getDateOfFiling() {
		return dateOfFiling;
	}

	public void setDateOfFiling(Date dateOfFiling) {
		this.dateOfFiling = dateOfFiling;
	}

	public String getPlaceOfFiling() {
		return placeOfFiling;
	}

	public void setPlaceOfFiling(String placeOfFiling) {
		this.placeOfFiling = placeOfFiling;
	}

	public String getDateAndPlaceOfFiling() {
		if (dateOfFiling != null) {
			this.dateAndPlaceOfFiling = DateToStringFormatter
					.getString(dateOfFiling) + " ";
		}
		if (placeOfFiling != null) {
			this.dateAndPlaceOfFiling += placeOfFiling;
		}
		return dateAndPlaceOfFiling;
	}

	public List<Relative> getRelatives() {
		return relatives;
	}

	public void setRelatives(List<Relative> relatives) {
		this.relatives = relatives;
	}

	public List<Membership> getMemberships() {
		return memberships;
	}

	public void setMemberships(List<Membership> memberships) {
		this.memberships = memberships;
	}

	public Boolean getQuestion1aYes() {
		return question1aYes;
	}

	public void setQuestion1aYes(Boolean question1aYes) {
		this.question1aYes = question1aYes;
	}

	public Boolean getQuestion1aNo() {
		return question1aNo;
	}

	public void setQuestion1aNo(Boolean question1aNo) {
		this.question1aNo = question1aNo;
	}

	public Boolean getQuestion1bYes() {
		return question1bYes;
	}

	public void setQuestion1bYes(Boolean question1bYes) {
		this.question1bYes = question1bYes;
	}

	public Boolean getQuestion1bNo() {
		return question1bNo;
	}

	public void setQuestion1bNo(Boolean question1bNo) {
		this.question1bNo = question1bNo;
	}

	public Boolean getQuestion1cYes() {
		return question1cYes;
	}

	public void setQuestion1cYes(Boolean question1cYes) {
		this.question1cYes = question1cYes;
	}

	public Boolean getQuestion1cNo() {
		return question1cNo;
	}

	public void setQuestion1cNo(Boolean question1cNo) {
		this.question1cNo = question1cNo;
	}

	public Boolean getQuestion1dYes() {
		return question1dYes;
	}

	public void setQuestion1dYes(Boolean question1dYes) {
		this.question1dYes = question1dYes;
	}

	public Boolean getQuestion1dNo() {
		return question1dNo;
	}

	public void setQuestion1dNo(Boolean question1dNo) {
		this.question1dNo = question1dNo;
	}

	public Boolean getQuestion2Yes() {
		return question2Yes;
	}

	public void setQuestion2Yes(Boolean question2Yes) {
		this.question2Yes = question2Yes;
	}

	public Boolean getQuestion2No() {
		return question2No;
	}

	public void setQuestion2No(Boolean question2No) {
		this.question2No = question2No;
	}

	public Boolean getQuestion3aYes() {
		return question3aYes;
	}

	public void setQuestion3aYes(Boolean question3aYes) {
		this.question3aYes = question3aYes;
	}

	public Boolean getQuestion3aNo() {
		return question3aNo;
	}

	public void setQuestion3aNo(Boolean question3aNo) {
		this.question3aNo = question3aNo;
	}

	public Boolean getQuestion3bYes() {
		return question3bYes;
	}

	public void setQuestion3bYes(Boolean question3bYes) {
		this.question3bYes = question3bYes;
	}

	public Boolean getQuestion3bNo() {
		return question3bNo;
	}

	public void setQuestion3bNo(Boolean question3bNo) {
		this.question3bNo = question3bNo;
	}

	public Boolean getQuestion3cYes() {
		return question3cYes;
	}

	public void setQuestion3cYes(Boolean question3cYes) {
		this.question3cYes = question3cYes;
	}

	public Boolean getQuestion3cNo() {
		return question3cNo;
	}

	public void setQuestion3cNo(Boolean question3cNo) {
		this.question3cNo = question3cNo;
	}

	public Boolean getQuestion3dYes() {
		return question3dYes;
	}

	public void setQuestion3dYes(Boolean question3dYes) {
		this.question3dYes = question3dYes;
	}

	public Boolean getQuestion3dNo() {
		return question3dNo;
	}

	public void setQuestion3dNo(Boolean question3dNo) {
		this.question3dNo = question3dNo;
	}

	public Boolean getQuestion4Yes() {
		return question4Yes;
	}

	public void setQuestion4Yes(Boolean question4Yes) {
		this.question4Yes = question4Yes;
	}

	public Boolean getQuestion4No() {
		return question4No;
	}

	public void setQuestion4No(Boolean question4No) {
		this.question4No = question4No;
	}

	public Boolean getQuestion5aYes() {
		return question5aYes;
	}

	public void setQuestion5aYes(Boolean question5aYes) {
		this.question5aYes = question5aYes;
	}

	public Boolean getQuestion5aNo() {
		return question5aNo;
	}

	public void setQuestion5aNo(Boolean question5aNo) {
		this.question5aNo = question5aNo;
	}

	public Boolean getQuestion5bYes() {
		return question5bYes;
	}

	public void setQuestion5bYes(Boolean question5bYes) {
		this.question5bYes = question5bYes;
	}

	public Boolean getQuestion5bNo() {
		return question5bNo;
	}

	public void setQuestion5bNo(Boolean question5bNo) {
		this.question5bNo = question5bNo;
	}

	public Boolean getQuestion5cYes() {
		return question5cYes;
	}

	public void setQuestion5cYes(Boolean question5cYes) {
		this.question5cYes = question5cYes;
	}

	public Boolean getQuestion5cNo() {
		return question5cNo;
	}

	public void setQuestion5cNo(Boolean question5cNo) {
		this.question5cNo = question5cNo;
	}

	public Boolean getQuestion6Yes() {
		return question6Yes;
	}

	public void setQuestion6Yes(Boolean question6Yes) {
		this.question6Yes = question6Yes;
	}

	public Boolean getQuestion6No() {
		return question6No;
	}

	public void setQuestion6No(Boolean question6No) {
		this.question6No = question6No;
	}

	public Boolean getQuestion7Yes() {
		return question7Yes;
	}

	public void setQuestion7Yes(Boolean question7Yes) {
		this.question7Yes = question7Yes;
	}

	public Boolean getQuestion7No() {
		return question7No;
	}

	public void setQuestion7No(Boolean question7No) {
		this.question7No = question7No;
	}

	public Boolean getQuestion8Yes() {
		return question8Yes;
	}

	public void setQuestion8Yes(Boolean question8Yes) {
		this.question8Yes = question8Yes;
	}

	public Boolean getQuestion8No() {
		return question8No;
	}

	public void setQuestion8No(Boolean question8No) {
		this.question8No = question8No;
	}

	public Boolean getQuestion9Yes() {
		return question9Yes;
	}

	public void setQuestion9Yes(Boolean question9Yes) {
		this.question9Yes = question9Yes;
	}

	public Boolean getQuestion9No() {
		return question9No;
	}

	public void setQuestion9No(Boolean question9No) {
		this.question9No = question9No;
	}

	public Boolean getQuestion10Yes() {
		return question10Yes;
	}

	public void setQuestion10Yes(Boolean question10Yes) {
		this.question10Yes = question10Yes;
	}

	public Boolean getQuestion10No() {
		return question10No;
	}

	public void setQuestion10No(Boolean question10No) {
		this.question10No = question10No;
	}

	public Boolean getQuestion11Yes() {
		return question11Yes;
	}

	public void setQuestion11Yes(Boolean question11Yes) {
		this.question11Yes = question11Yes;
	}

	public Boolean getQuestion11No() {
		return question11No;
	}

	public void setQuestion11No(Boolean question11No) {
		this.question11No = question11No;
	}

	public Boolean getQuestion12Yes() {
		return question12Yes;
	}

	public void setQuestion12Yes(Boolean question12Yes) {
		this.question12Yes = question12Yes;
	}

	public Boolean getQuestion12No() {
		return question12No;
	}

	public void setQuestion12No(Boolean question12No) {
		this.question12No = question12No;
	}

	public Boolean getQuestion13Yes() {
		return question13Yes;
	}

	public void setQuestion13Yes(Boolean question13Yes) {
		this.question13Yes = question13Yes;
	}

	public Boolean getQuestion13No() {
		return question13No;
	}

	public void setQuestion13No(Boolean question13No) {
		this.question13No = question13No;
	}

	public Boolean getQuestion14aYes() {
		return question14aYes;
	}

	public void setQuestion14aYes(Boolean question14aYes) {
		this.question14aYes = question14aYes;
	}

	public Boolean getQuestion14aNo() {
		return question14aNo;
	}

	public void setQuestion14aNo(Boolean question14aNo) {
		this.question14aNo = question14aNo;
	}

	public Boolean getQuestion14bYes() {
		return question14bYes;
	}

	public void setQuestion14bYes(Boolean question14bYes) {
		this.question14bYes = question14bYes;
	}

	public Boolean getQuestion14bNo() {
		return question14bNo;
	}

	public void setQuestion14bNo(Boolean question14bNo) {
		this.question14bNo = question14bNo;
	}

	public Boolean getQuestion14cYes() {
		return question14cYes;
	}

	public void setQuestion14cYes(Boolean question14cYes) {
		this.question14cYes = question14cYes;
	}

	public Boolean getQuestion14cNo() {
		return question14cNo;
	}

	public void setQuestion14cNo(Boolean question14cNo) {
		this.question14cNo = question14cNo;
	}

	public Boolean getQuestion14dYes() {
		return question14dYes;
	}

	public void setQuestion14dYes(Boolean question14dYes) {
		this.question14dYes = question14dYes;
	}

	public Boolean getQuestion14dNo() {
		return question14dNo;
	}

	public void setQuestion14dNo(Boolean question14dNo) {
		this.question14dNo = question14dNo;
	}

	public Boolean getQuestion14eYes() {
		return question14eYes;
	}

	public void setQuestion14eYes(Boolean question14eYes) {
		this.question14eYes = question14eYes;
	}

	public Boolean getQuestion14eNo() {
		return question14eNo;
	}

	public void setQuestion14eNo(Boolean question14eNo) {
		this.question14eNo = question14eNo;
	}

	public Boolean getQuestion15aYes() {
		return question15aYes;
	}

	public void setQuestion15aYes(Boolean question15aYes) {
		this.question15aYes = question15aYes;
	}

	public Boolean getQuestion15aNo() {
		return question15aNo;
	}

	public void setQuestion15aNo(Boolean question15aNo) {
		this.question15aNo = question15aNo;
	}

	public Boolean getQuestion15bYes() {
		return question15bYes;
	}

	public void setQuestion15bYes(Boolean question15bYes) {
		this.question15bYes = question15bYes;
	}

	public Boolean getQuestion15bNo() {
		return question15bNo;
	}

	public void setQuestion15bNo(Boolean question15bNo) {
		this.question15bNo = question15bNo;
	}

	public Boolean getQuestion16Yes() {
		return question16Yes;
	}

	public void setQuestion16Yes(Boolean question16Yes) {
		this.question16Yes = question16Yes;
	}

	public Boolean getQuestion16No() {
		return question16No;
	}

	public void setQuestion16No(Boolean question16No) {
		this.question16No = question16No;
	}

	public Boolean getQuestion17Yes() {
		return question17Yes;
	}

	public void setQuestion17Yes(Boolean question17Yes) {
		this.question17Yes = question17Yes;
	}

	public Boolean getQuestion17No() {
		return question17No;
	}

	public void setQuestion17No(Boolean question17No) {
		this.question17No = question17No;
	}

	public Boolean getQuestion18Yes() {
		return question18Yes;
	}

	public void setQuestion18Yes(Boolean question18Yes) {
		this.question18Yes = question18Yes;
	}

	public Boolean getQuestion18No() {
		return question18No;
	}

	public void setQuestion18No(Boolean question18No) {
		this.question18No = question18No;
	}

}