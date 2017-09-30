<%@ page contentType="text/html; charset=utf-8" language="java" pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/includes/taglibs.jsp"%>

<stripes:layout-render name="/WEB-INF/layout/defaultLayout.jsp">
	<stripes:layout-component name="contents">

<!-- BEGIN PAGE CONTENT -->

<div id="content" ng-controller="FormController as formController">
<h1><fmt:message key="i-485.title"/></h1>
<stripes:form id="I485Form" beanclass="com.janousek.formtranslator.web.action.I485FormAction">
<stripes:errors/>
<div id="errorsDiv"></div>
<div id="accordion">
<h3><fmt:message key="i-485.part1.title"/></h3>
<div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partOne.familyName" name="BasicForm.familyName"/>
<stripes:text ng-model="formController.form.partOne.familyName" class="required" name="form.partOne.familyName" id="form.partOne.familyName"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partOne.givenName" name="BasicForm.givenName"/>
<stripes:text ng-model="formController.form.partOne.givenName" class="required" name="form.partOne.givenName" id="form.partOne.givenName"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partOne.middleName" name="BasicForm.middleName"/>
<stripes:text ng-model="formController.form.partOne.middleName" class="required" name="form.partOne.middleName" id="form.partOne.middleName"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partOne.address" name="BasicForm.address"/>
<stripes:text ng-model="formController.form.partOne.address" class="required" name="form.partOne.address" id="form.partOne.address"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partOne.aptNo" name="BasicForm.aptNo"/>
<stripes:text ng-model="formController.form.partOne.aptNo" class="required" name="form.partOne.aptNo" id="form.partOne.aptNo"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partOne.inCareOf" name="BasicForm.inCareOf"/>
<stripes:text ng-model="formController.form.partOne.inCareOf" class="required" name="form.partOne.inCareOf" id="form.partOne.inCareOf"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partOne.city" name="BasicForm.city"/>
<stripes:text ng-model="formController.form.partOne.city" class="required" name="form.partOne.city" id="form.partOne.city"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partOne.state" name="BasicForm.state"/>
<stripes:text ng-model="formController.form.partOne.state" class="required" name="form.partOne.state" id="form.partOne.state"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partOne.zipCode" name="BasicForm.zipCode"/>
<stripes:text ng-model="formController.form.partOne.zipCode" class="required" name="form.partOne.zipCode" id="form.partOne.zipCode"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partOne.dateOfBirth" name="BasicForm.dateOfBirth"/>
<stripes:text ng-model="formController.form.partOne.dateOfBirth" class="required dateUSA" name="form.partOne.dateOfBirth" id="form.partOne.dateOfBirth"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partOne.countryOfBirth" name="BasicForm.countryOfBirth"/>
<stripes:text ng-model="formController.form.partOne.countryOfBirth" class="required" name="form.partOne.countryOfBirth" id="form.partOne.countryOfBirth"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partOne.countryOfCitizenship" name="BasicForm.countryOfCitizenship"/>
<stripes:text ng-model="formController.form.partOne.countryOfCitizenship" class="required" name="form.partOne.countryOfCitizenship" id="form.partOne.countryOfCitizenship"/>
</div>

<div class="textFieldDiv">
<stripes:label for="form.partOne.usSocialSecurityNumber" name="BasicForm.usSocialSecurityNumber"/>
<stripes:text ng-model="formController.form.partOne.usSocialSecurityNumber" name="form.partOne.usSocialSecurityNumber" id="form.partOne.usSocialSecurityNumber"/>
</div>

<div class="textFieldDiv">
<stripes:label for="form.partOne.anumber" name="BasicForm.aNumber"/>
<stripes:text ng-model="formController.form.partOne.anumber" name="form.partOne.anumber" id="form.partOne.anumber"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partOne.dateOfLastArrival" name="BasicForm.dateOfLastArrival"/>
<stripes:text ng-model="formController.form.partOne.dateOfLastArrival" class="required dateUSA" name="form.partOne.dateOfLastArrival" id="form.partOne.dateOfLastArrival"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partOne.i94Number" name="BasicForm.i94Number"/>
<stripes:text ng-model="formController.form.partOne.i94Number" class="required" name="form.partOne.i94Number" id="form.partOne.i94Number"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partOne.currentUSCISStatus" name="BasicForm.currentUSCISStatus"/>
<stripes:text ng-model="formController.form.partOne.currentUSCISStatus" class="required" name="form.partOne.currentUSCISStatus" id="form.partOne.currentUSCISStatus"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partOne.expiresOn" name="BasicForm.expiresOn"/>
<stripes:text ng-model="formController.form.partOne.expiresOn" class="required dateUSA" name="form.partOne.expiresOn" id="form.partOne.expiresOn"/>
</div>
</div>

<h3><fmt:message key="i-485.part2.title"/></h3>
<div id="formPart2" class="answer">
<div id="formPart2Error" style="display: none;"><fmt:message key="validation.i-485.part2.required"/></div>
<h4><fmt:message key="i-485.part2.subtitle1"/></h4>
<table>
<tr><td class="checkboxText"><stripes:checkbox ng-model="formController.form.partTwo.a" name="form.partTwo.a" id="form.partTwo.a"/></td>
<td><stripes:label for="form.partTwo.a" name="I485Part2.a"/></td></tr>
<tr><td class="checkboxText"><stripes:checkbox ng-model="formController.form.partTwo.b" name="form.partTwo.b" id="form.partTwo.b"/><td><stripes:label for="form.partTwo.b" name="I485Part2.b"/></td></tr>
<tr><td class="checkboxText"><stripes:checkbox ng-model="formController.form.partTwo.c" name="form.partTwo.c" id="form.partTwo.c"/><td><stripes:label for="form.partTwo.c" name="I485Part2.c"/></td></tr>
<tr><td class="checkboxText"><stripes:checkbox ng-model="formController.form.partTwo.d" name="form.partTwo.d" id="form.partTwo.d"/><td><stripes:label for="form.partTwo.d" name="I485Part2.d"/></td></tr>
<tr><td class="checkboxText"><stripes:checkbox ng-model="formController.form.partTwo.e" name="form.partTwo.e" id="form.partTwo.e"/><td><stripes:label for="form.partTwo.e" name="I485Part2.e"/></td></tr>
<tr><td class="checkboxText"><stripes:checkbox ng-model="formController.form.partTwo.f" name="form.partTwo.f" id="form.partTwo.f"/><td><stripes:label for="form.partTwo.f" name="I485Part2.f"/></td></tr>
<tr><td class="checkboxText"><stripes:checkbox ng-model="formController.form.partTwo.g" name="form.partTwo.g" id="form.partTwo.g"/><td><stripes:label for="form.partTwo.g" name="I485Part2.g"/></td></tr>
<tr><td class="checkboxText"><stripes:checkbox ng-model="formController.form.partTwo.h" name="form.partTwo.h" id="form.partTwo.h"/><td><stripes:label for="form.partTwo.h" name="I485Part2.h"/><stripes:text ng-model="formController.form.partTwo.hother" name="form.partTwo.hother"/></td></tr>
</table>
<h4><fmt:message key="i-485.part2.subtitle2"/></h4>
<table>
<tr><td class="checkboxText"><stripes:checkbox ng-model="formController.form.partTwo.i" name="form.partTwo.i" id="form.partTwo.i"/><td><stripes:label for="form.partTwo.i" name="I485Part2.i"/></td></tr>
<tr><td class="checkboxText"><stripes:checkbox ng-model="formController.form.partTwo.j" name="form.partTwo.j" id="form.partTwo.j"/><td><stripes:label for="form.partTwo.j" name="I485Part2.j"/></td></tr>
</table>
</div>


<h3><fmt:message key="i-485.part3.title"/> - <fmt:message key="i-485.part3.title1"/></h3>
<div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partThree.cityOfBirth" name="I485Part3.cityOfBirth"/>
<stripes:text ng-model="formController.form.partThree.cityOfBirth" class="required" name="form.partThree.cityOfBirth" id="form.partThree.cityOfBirth"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partThree.currentOccupation" name="I485Part3.currentOccupation"/>
<stripes:text ng-model="formController.form.partThree.currentOccupation" class="required" name="form.partThree.currentOccupation" id="form.partThree.currentOccupation"/>
</div>
<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partThree.mothersFirstName" name="I485Part3.mothersFirstName"/>
<stripes:text ng-model="formController.form.partThree.mothersFirstName" class="required" name="form.partThree.mothersFirstName" id="form.partThree.mothersFirstName"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partThree.fathersFirstName" name="I485Part3.fathersFirstName"/>
<stripes:text ng-model="formController.form.partThree.fathersFirstName" class="required" name="form.partThree.fathersFirstName" id="form.partThree.fathersFirstName"/>
</div>

<div class="textFieldDiv" style="width:100%">
<stripes:label class="requiredLabel" for="form.partThree.nameOnI94ArrivalDepartureRecord" name="I485Part3.nameOnI94ArrivalDepartureRecord"/>
<stripes:text ng-model="formController.form.partThree.nameOnI94ArrivalDepartureRecord" class="required" name="form.partThree.nameOnI94ArrivalDepartureRecord" id="form.partThree.nameOnI94ArrivalDepartureRecord" style="width:100%"/>
</div>

<div class="textFieldDiv" style="width:50%">
<stripes:label class="requiredLabel" for="form.partThree.placeOfLastEntryIntoUS" name="I485Part3.placeOfLastEntryIntoUS"/>
<stripes:text ng-model="formController.form.partThree.placeOfLastEntryIntoUS" class="required" name="form.partThree.placeOfLastEntryIntoUS" id="form.partThree.placeOfLastEntryIntoUS" style="width:80%"/>
</div>

<div class="textFieldDiv" style="width:50%">
<stripes:label class="requiredLabel" for="form.partThree.statusOfLastEnter" name="I485Part3.statusOfLastEnter"/>
<stripes:text ng-model="formController.form.partThree.statusOfLastEnter" class="required" name="form.partThree.statusOfLastEnter" id="form.partThree.statusOfLastEnter" style="width:80%"/>
</div>

<div class="answer" style="width: 100%;float:left" id="immigrationOfficer"> 
<fmt:message key="I485Part3.inspectedByImmigration"/>
<stripes:label for="form.partThree.inspectedByImmigrationYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.inspectedByImmigrationYes" name="form.partThree.inspectedByImmigrationYes" id="form.partThree.inspectedByImmigrationYes"/>
<stripes:label for="form.partThree.inspectedByImmigrationNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.inspectedByImmigrationNo" name="form.partThree.inspectedByImmigrationNo" id="form.partThree.inspectedByImmigrationNo"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partThree.nonImmigrantVisaNumber" name="I485Part3.nonImmigrantVisaNumber"/>
<stripes:text ng-model="formController.form.partThree.nonImmigrantVisaNumber" class="required" name="form.partThree.nonImmigrantVisaNumber" id="form.partThree.nonImmigrantVisaNumber"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partThree.consulateWhereVisaWasIssued" name="I485Part3.consulateWhereVisaWasIssued"/>
<stripes:text ng-model="formController.form.partThree.consulateWhereVisaWasIssued" class="required" name="form.partThree.consulateWhereVisaWasIssued" id="form.partThree.consulateWhereVisaWasIssued"/>
</div>

<div class="textFieldDiv">
<stripes:label class="requiredLabel" for="form.partThree.dateVisaIssued" name="I485Part3.dateVisaIssued"/>
<stripes:text ng-model="formController.form.partThree.dateVisaIssued" class="required dateUSA" name="form.partThree.dateVisaIssued" id="form.partThree.dateVisaIssued"/>
</div>

<div class="textFieldDiv answer" id="gender">
<stripes:label for="form.partThree.gender" name="I485Part3.gender"/>
<stripes:checkbox ng-model="formController.form.partThree.genderMale" style="display:inline" name="form.partThree.genderMale" id="form.partThree.genderMale"/>
<stripes:label style="display:inline" for="form.partThree.genderMale" name="I485Part3.genderMale"/>
<stripes:checkbox ng-model="formController.form.partThree.genderFemale" style="display:inline" name="form.partThree.genderFemale" id="form.partThree.genderFemale"/>
<stripes:label style="display:inline" for="form.partThree.genderFemale" name="I485Part3.genderFemale"/>
</div>

<div class="textFieldDiv answer" id="maritalStatus" style="width:50%">
<stripes:label for="form.partThree.maritalStatus" name="I485Part3.maritalStatus"/>
<stripes:checkbox ng-model="formController.form.partThree.maritalStatusMarried" style="display:inline" name="form.partThree.maritalStatusMarried" id="form.partThree.maritalStatusMarried"/>
<stripes:label style="display:inline" for="form.partThree.maritalStatusMarried" name="I485Part3.maritalStatusMarried"/>
<stripes:checkbox ng-model="formController.form.partThree.maritalStatusSingle" style="display:inline" name="form.partThree.maritalStatusSingle" id="form.partThree.maritalStatusSingle"/>
<stripes:label style="display:inline" for="form.partThree.maritalStatusSingle" name="I485Part3.maritalStatusSingle"/>
<stripes:checkbox ng-model="formController.form.partThree.maritalStatusDivorced" style="display:inline" name="form.partThree.maritalStatusDivorced" id="form.partThree.maritalStatusDivorced"/>
<stripes:label style="display:inline" for="form.partThree.maritalStatusDivorced" name="I485Part3.maritalStatusDivorced"/>
<stripes:checkbox ng-model="formController.form.partThree.maritalStatusWidowed" style="display:inline" name="form.partThree.maritalStatusWidowed" id="form.partThree.maritalStatusWidowed"/>
<stripes:label style="display:inline" for="form.partThree.maritalStatusWidowed" name="I485Part3.maritalStatusWidowed"/>
</div>

<div style="width: 100%;float:left" id="immigrationOfficer"> 
<fmt:message key="I485Part3.appliedForPermanentResidentStatusBefore"/>
</div>
<div class="answer" style="width:100%;float:left" id="appliedForPermanentResidentStatusBefore">
<stripes:checkbox ng-model="formController.form.partThree.appliedForPermanentResidentStatusBeforeYes" name="form.partThree.appliedForPermanentResidentStatusBeforeYes" id="form.partThree.appliedForPermanentResidentStatusBeforeYes"/>
<stripes:label for="form.partThree.appliedForPermanentResidentStatusBeforeYes" name="I485Part3.appliedForPermanentResidentStatusBeforeYes"/>
<stripes:checkbox ng-model="formController.form.partThree.appliedForPermanentResidentStatusBeforeNo" name="form.partThree.appliedForPermanentResidentStatusBeforeNo" id="form.partThree.appliedForPermanentResidentStatusBeforeNo"/>
<stripes:label for="form.partThree.appliedForPermanentResidentStatusBeforeNo" name="I485Part3.appliedForPermanentResidentStatusBeforeNo"/>
</div>

<div class="textFieldDiv">
<stripes:label for="form.partThree.dateOfFiling" name="I485Part3.dateOfFiling"/>
<stripes:text ng-model="formController.form.partThree.dateOfFiling" class="dateUSA" name="form.partThree.dateOfFiling" id="form.partThree.dateOfFiling"/>
</div>

<div class="textFieldDiv">
<stripes:label for="form.partThree.placeOfFiling" name="I485Part3.placeOfFiling"/>
<stripes:text ng-model="formController.form.partThree.placeOfFiling" name="form.partThree.placeOfFiling" id="form.partThree.placeOfFiling"/>
</div>

</div>


<h3 style="clear: both;"><fmt:message key="i-485.part3.title"/> - <fmt:message key="i-485.part3.title2"/></h3>
<div>
<h4><fmt:message key="i-485.part3.subtitle2"/></h4>
<c:forEach items="${form.partThree.relatives}" var="relative" varStatus="index">
<fieldset>
<div class="textFieldDiv">
<stripes:label for="form.partThree.relatives[${index.index}].familyName" name="Relative.familyName"/>
<stripes:text ng-model="formController.form.partThree.relatives[${index.index}].familyName" name="form.partThree.relatives[${index.index}].familyName" id="form.partThree.relatives[${index.index}].familyName"/>
</div>

<div class="textFieldDiv">
<stripes:label for="form.partThree.relatives[${index.index}].givenName" name="Relative.givenName"/>
<stripes:text ng-model="formController.form.partThree.relatives[${index.index}].givenName" name="form.partThree.relatives[${index.index}].givenName" id="form.partThree.relatives[${index.index}].givenName"/>
</div>

<div class="textFieldDiv">
<stripes:label for="form.partThree.relatives[${index.index}].middleInitial" name="Relative.middleInitial"/>
<stripes:text ng-model="formController.form.partThree.relatives[${index.index}].middleInitial" name="form.partThree.relatives[${index.index}].middleInitial" id="form.partThree.relatives[${index.index}].middleInitial"/>
</div>

<div class="textFieldDiv">
<stripes:label for="form.partThree.relatives[${index.index}].dateOfBirth" name="Relative.dateOfBirth"/>
<stripes:text ng-model="formController.form.partThree.relatives[${index.index}].dateOfBirth" class="dateUSA" name="form.partThree.relatives[${index.index}].dateOfBirth" id="form.partThree.relatives[${index.index}].dateOfBirth"/>
</div>

<div class="textFieldDiv">
<stripes:label for="form.partThree.relatives[${index.index}].countryOfBirth" name="Relative.countryOfBirth"/>
<stripes:text ng-model="formController.form.partThree.relatives[${index.index}].countryOfBirth" name="form.partThree.relatives[${index.index}].countryOfBirth" id="form.partThree.relatives[${index.index}].countryOfBirth"/>
</div>

<div class="textFieldDiv">
<stripes:label for="form.partThree.relatives[${index.index}].relationShip" name="Relative.relationShip"/>
<stripes:text ng-model="formController.form.partThree.relatives[${index.index}].relationShip" name="form.partThree.relatives[${index.index}].relationShip" id="form.partThree.relatives[${index.index}].relationShip"/>
</div>

<div class="textFieldDiv">
<stripes:label for="form.partThree.relatives[${index.index}].anumber" name="Relative.anumber"/>
<stripes:text ng-model="formController.form.partThree.relatives[${index.index}].anumber" name="form.partThree.relatives[${index.index}].anumber" id="form.partThree.relatives[${index.index}].anumber"/>
</div>

<div class="textFieldDiv answer" id="applyingWithYou${index.index}">
<stripes:label for="form.partThree.gender" name="Relative.applyingWithYou"/>
<stripes:label style="display:inline" for="form.partThree.relatives[${index.index}].applyingWithYouYes" name="yes"/>
<stripes:checkbox style="display:inline" ng-model="formController.form.partThree.relatives[${index.index}].applyingWithYouYes" name="form.partThree.relatives[${index.index}].applyingWithYouYes" id="form.partThree.relatives[${index.index}].applyingWithYouYes"/>
<stripes:label style="display:inline" for="form.partThree.relatives[${index.index}].applyingWithYouNo" name="no"/>
<stripes:checkbox style="display:inline" ng-model="formController.form.partThree.relatives[${index.index}].applyingWithYouNo" name="form.partThree.relatives[${index.index}].applyingWithYouNo" id="form.partThree.relatives[${index.index}].applyingWithYouNo"/>
</div>

</fieldset>
</c:forEach>
</div>

<!-- Memberships -->
<h3 style="clear: both;"><fmt:message key="i-485.part3.title"/> - <fmt:message key="i-485.part3.title3"/></h3>

<div>
<h4><fmt:message key="i-485.part3.subtitle3"/></h4>
<c:forEach items="${form.partThree.memberships}" var="membership" varStatus="index">
<fieldset>
<div class="textFieldDiv">
<stripes:label for="form.partThree.memberships[${index.index}].name" name="Membership.name"/>
<stripes:text ng-model="formController.form.partThree.memberships[${index.index}].name" name="form.partThree.memberships[${index.index}].name" id="form.partThree.memberships[${index.index}].name"/>
</div>

<div class="textFieldDiv">
<stripes:label for="form.partThree.memberships[${index.index}].locationAndNature" name="Membership.locationAndNature"/>
<stripes:text ng-model="formController.form.partThree.memberships[${index.index}].locationAndNature" name="form.partThree.memberships[${index.index}].locationAndNature" id="form.partThree.memberships[${index.index}].locationAndNature"/>
</div>

<div class="textFieldDiv">
<stripes:label for="form.partThree.memberships[${index.index}].membershipFrom" name="Membership.membershipFrom"/>
<stripes:text ng-model="formController.form.partThree.memberships[${index.index}].membershipFrom" class="dateUSA" name="form.partThree.memberships[${index.index}].membershipFrom" id="form.partThree.memberships[${index.index}].membershipFrom"/>
</div>

<div class="textFieldDiv">
<stripes:label for="form.partThree.memberships[${index.index}].membershipTo" name="Membership.membershipTo"/>
<stripes:text ng-model="formController.form.partThree.memberships[${index.index}].membershipTo" class="dateUSA" name="form.partThree.memberships[${index.index}].membershipTo" id="form.partThree.memberships[${index.index}].membershipTo"/>
</div>
</fieldset>
</c:forEach>
</div>

<!-- questionnaire part3 -->
<h3 style="clear: both;"><fmt:message key="i-485.part3.title"/> - <fmt:message key="i-485.part3.questionnaire"/></h3>

<div>
<h4><fmt:message key="i-485.part3.subtitle4"/></h4>
<div id="formPart3Error" style="display: none; color: red;"><fmt:message key="validation.i-485.part3.required"/></div>
<ol id="questionnaire_part3">

<!-- Question 1 -->
<li>
<fmt:message key="i-485.part3.question1"/>
<ol type="a">

<li>
<div class="question">
<stripes:label name="i-485.part3.question1a"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question1aYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question1aYes" style="display:inline" name="form.partThree.question1aYes" id="form.partThree.question1aYes"/>
<stripes:label for="form.partThree.question1aNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question1aNo" style="display:inline" name="form.partThree.question1aNo" id="form.partThree.question1aNo"/>
</div>
</li>

<li>
<div class="question">
<stripes:label name="i-485.part3.question1b"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question1bYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question1bYes" style="display:inline" name="form.partThree.question1bYes" id="form.partThree.question1bYes"/>
<stripes:label for="form.partThree.question1bNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question1bNo" style="display:inline" name="form.partThree.question1bNo" id="form.partThree.question1bNo"/>
</div>
</li>

<li>
<div class="question">
<stripes:label name="i-485.part3.question1c"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question1cYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question1cYes" style="display:inline" name="form.partThree.question1cYes" id="form.partThree.question1cYes"/>
<stripes:label for="form.partThree.question1cNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question1cNo" style="display:inline" name="form.partThree.question1cNo" id="form.partThree.question1cNo"/>
</div>
</li>

<li>
<div class="question">
<stripes:label name="i-485.part3.question1d"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question1dYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question1dYes" style="display:inline" name="form.partThree.question1dYes" id="form.partThree.question1dYes"/>
<stripes:label for="form.partThree.question1dNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question1dNo" style="display:inline" name="form.partThree.question1dNo" id="form.partThree.question1dNo"/>
</div>
</li>

</ol>
</li>

<!-- Question 2 -->
<li>
<div class="question">
<fmt:message key="i-485.part3.question2"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question2Yes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question2Yes" style="display:inline" name="form.partThree.question2Yes" id="form.partThree.question2Yes"/>
<stripes:label for="form.partThree.question2No" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question2No" style="display:inline" name="form.partThree.question2No" id="form.partThree.question2No"/>
</div>
</li>


<!-- Question 3 -->
<li>
<fmt:message key="i-485.part3.question3"/>
<ol type="a">

<li>
<div class="question">
<stripes:label name="i-485.part3.question3a"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question3aYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question3aYes" style="display:inline" name="form.partThree.question3aYes" id="form.partThree.question3aYes"/>
<stripes:label for="form.partThree.question3aNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question3aNo" style="display:inline" name="form.partThree.question3aNo" id="form.partThree.question3aNo"/>
</div>
</li>

<li>
<div class="question">
<stripes:label name="i-485.part3.question3b"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question3bYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question3bYes" style="display:inline" name="form.partThree.question3bYes" id="form.partThree.question3bYes"/>
<stripes:label for="form.partThree.question3bNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question3bNo" style="display:inline" name="form.partThree.question3bNo" id="form.partThree.question3bNo"/>
</div>
</li>

<li>
<div class="question">
<stripes:label name="i-485.part3.question3c"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question3cYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question3cYes" style="display:inline" name="form.partThree.question3cYes" id="form.partThree.question3cYes"/>
<stripes:label for="form.partThree.question3cNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question3cNo" style="display:inline" name="form.partThree.question3cNo" id="form.partThree.question3cNo"/>
</div>
</li>

<li>
<div class="question">
<stripes:label name="i-485.part3.question3d"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question3dYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question3dYes" style="display:inline" name="form.partThree.question3dYes" id="form.partThree.question3dYes"/>
<stripes:label for="form.partThree.question3dNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question3dNo" style="display:inline" name="form.partThree.question3dNo" id="form.partThree.question3dNo"/>
</div>
</li>

</ol>
</li>

<!-- Question 4 -->
<li>
<div class="question">
<fmt:message key="i-485.part3.question4"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question4Yes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question4Yes" style="display:inline" name="form.partThree.question4Yes" id="form.partThree.question4Yes"/>
<stripes:label for="form.partThree.question4No" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question4No" style="display:inline" name="form.partThree.question4No" id="form.partThree.question4No"/>
</div>
</li>

<!-- Question 5 -->
<li>
<fmt:message key="i-485.part3.question5"/>
<ol type="a">
<li>
<div class="question">
<stripes:label name="i-485.part3.question5a"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question5aYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question5aYes" style="display:inline" name="form.partThree.question5aYes" id="form.partThree.question5aYes"/>
<stripes:label for="form.partThree.question5aNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question5aNo" style="display:inline" name="form.partThree.question5aNo" id="form.partThree.question5aNo"/>
</div>
</li>

<li>
<div class="question">
<stripes:label name="i-485.part3.question5b"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question5bYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question5bYes" style="display:inline" name="form.partThree.question5bYes" id="form.partThree.question5bYes"/>
<stripes:label for="form.partThree.question5bNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question5bNo" style="display:inline" name="form.partThree.question5bNo" id="form.partThree.question5bNo"/>
</div>
</li>

<li>
<div class="question">
<stripes:label name="i-485.part3.question5c"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question5cYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question5cYes" style="display:inline" name="form.partThree.question5cYes" id="form.partThree.question5cYes"/>
<stripes:label for="form.partThree.question5cNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question5cNo" style="display:inline" name="form.partThree.question5cNo" id="form.partThree.question5cNo"/>
</div>
</li>
</ol>
</li>

<!-- Question 6 -->
<li>
<div class="question">
<fmt:message key="i-485.part3.question6"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question6Yes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question6Yes" style="display:inline" name="form.partThree.question6Yes" id="form.partThree.question6Yes"/>
<stripes:label for="form.partThree.question6No" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question6No" style="display:inline" name="form.partThree.question6No" id="form.partThree.question6No"/>
</div>
</li>

<!-- Question 7 -->
<li>
<div class="question">
<fmt:message key="i-485.part3.question7"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question7Yes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question7Yes" style="display:inline" name="form.partThree.question7Yes" id="form.partThree.question7Yes"/>
<stripes:label for="form.partThree.question7No" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question7No" style="display:inline" name="form.partThree.question7No" id="form.partThree.question7No"/>
</div>
</li>

<!-- Question 8 -->
<li>
<div class="question">
<fmt:message key="i-485.part3.question8"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question8Yes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question8Yes" style="display:inline" name="form.partThree.question8Yes" id="form.partThree.question8Yes"/>
<stripes:label for="form.partThree.question8No" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question8No" style="display:inline" name="form.partThree.question8No" id="form.partThree.question8No"/>
</div>
</li>

<!-- Question 9 -->
<li>
<div class="question">
<fmt:message key="i-485.part3.question9"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question9Yes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question9Yes" style="display:inline" name="form.partThree.question9Yes" id="form.partThree.question9Yes"/>
<stripes:label for="form.partThree.question9No" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question9No" style="display:inline" name="form.partThree.question9No" id="form.partThree.question9No"/>
</div>
</li>

<!-- Question 10 -->
<li>
<div class="question">
<fmt:message key="i-485.part3.question10"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question10Yes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question10Yes" style="display:inline" name="form.partThree.question10Yes" id="form.partThree.question10Yes"/>
<stripes:label for="form.partThree.question10No" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question10No" style="display:inline" name="form.partThree.question10No" id="form.partThree.question10No"/>
</div>
</li>

<!-- Question 11 -->
<li>
<div class="question">
<fmt:message key="i-485.part3.question11"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question11Yes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question11Yes" style="display:inline" name="form.partThree.question11Yes" id="form.partThree.question11Yes"/>
<stripes:label for="form.partThree.question11No" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question11No" style="display:inline" name="form.partThree.question11No" id="form.partThree.question11No"/>
</div>
</li>

<!-- Question 12 -->
<li>
<div class="question">
<fmt:message key="i-485.part3.question12"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question12Yes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question12Yes" style="display:inline" name="form.partThree.question12Yes" id="form.partThree.question12Yes"/>
<stripes:label for="form.partThree.question12No" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question12No" style="display:inline" name="form.partThree.question12No" id="form.partThree.question12No"/>
</div>
</li>

<!-- Question 13 -->
<li>
<div class="question">
<fmt:message key="i-485.part3.question13"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question13Yes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question13Yes" style="display:inline" name="form.partThree.question13Yes" id="form.partThree.question13Yes"/>
<stripes:label for="form.partThree.question13No" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question13No" style="display:inline" name="form.partThree.question13No" id="form.partThree.question13No"/>
</div>
</li>

<!-- Question 14 -->
<li>
<fmt:message key="i-485.part3.question14"/>
<ol type="a">

<li>
<div class="question">
<stripes:label name="i-485.part3.question14a"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question14aYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question14aYes" style="display:inline" name="form.partThree.question14aYes" id="form.partThree.question14aYes"/>
<stripes:label for="form.partThree.question14aNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question14aNo" style="display:inline" name="form.partThree.question14aNo" id="form.partThree.question14aNo"/>
</div>
</li>

<li>
<div class="question">
<stripes:label name="i-485.part3.question14b"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question14bYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question14bYes" style="display:inline" name="form.partThree.question14bYes" id="form.partThree.question14bYes"/>
<stripes:label for="form.partThree.question14bNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question14bNo" style="display:inline" name="form.partThree.question14bNo" id="form.partThree.question14bNo"/>
</div>
</li>

<li>
<div class="question">
<stripes:label name="i-485.part3.question14c"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question14cYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question14cYes" style="display:inline" name="form.partThree.question14cYes" id="form.partThree.question14cYes"/>
<stripes:label for="form.partThree.question14cNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question14cNo" style="display:inline" name="form.partThree.question14cNo" id="form.partThree.question14cNo"/>
</div>
</li>

<li>
<div class="question">
<stripes:label name="i-485.part3.question14d"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question14dYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question14dYes" style="display:inline" name="form.partThree.question14dYes" id="form.partThree.question14dYes"/>
<stripes:label for="form.partThree.question14dNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question14dNo" style="display:inline" name="form.partThree.question14dNo" id="form.partThree.question14dNo"/>
</div>
</li>

<li>
<div class="question">
<stripes:label name="i-485.part3.question14e"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question14eYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question14eYes" style="display:inline" name="form.partThree.question14eYes" id="form.partThree.question14eYes"/>
<stripes:label for="form.partThree.question14eNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question14eNo" style="display:inline" name="form.partThree.question14eNo" id="form.partThree.question14eNo"/>
</div>
</li>
</ol>
</li>

<!-- Question 15 -->
<fmt:message key="i-485.part3.question15"/>
<li>
<ol type="a">
<li>
<div class="question">
<stripes:label name="i-485.part3.question15a"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question15aYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question15aYes" style="display:inline" name="form.partThree.question15aYes" id="form.partThree.question15aYes"/>
<stripes:label for="form.partThree.question15aNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question15aNo" style="display:inline" name="form.partThree.question15aNo" id="form.partThree.question15aNo"/>
</div>
</li>

<li>
<div class="question">
<stripes:label name="i-485.part3.question15b"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question15bYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question15bYes" style="display:inline" name="form.partThree.question15bYes" id="form.partThree.question15bYes"/>
<stripes:label for="form.partThree.question15bNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question15bNo" style="display:inline" name="form.partThree.question15bNo" id="form.partThree.question15bNo"/>
</div>
</li>
</ol>
</li>

<!-- Question 16 -->
<li>
<div class="question">
<fmt:message key="i-485.part3.question16"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question16Yes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question16Yes" style="display:inline" name="form.partThree.question16Yes" id="form.partThree.question16Yes"/>
<stripes:label for="form.partThree.question16No" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question16No" style="display:inline" name="form.partThree.question16No" id="form.partThree.question16No"/>
</div>
</li>

<!-- Question 17 -->
<li>
<div class="question">
<fmt:message key="i-485.part3.question17"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question17Yes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question17Yes" style="display:inline" name="form.partThree.question17Yes" id="form.partThree.question17Yes"/>
<stripes:label for="form.partThree.question17No" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question17No" style="display:inline" name="form.partThree.question17No" id="form.partThree.question17No"/>
</div>
</li>

<!-- Question 18 -->
<li>
<div class="question">
<fmt:message key="i-485.part3.question18"/>
</div>
<div class="answer">
<stripes:label for="form.partThree.question18Yes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partThree.question18Yes" style="display:inline" name="form.partThree.question18Yes" id="form.partThree.question18Yes"/>
<stripes:label for="form.partThree.question18No" name="no"/>
<stripes:checkbox ng-model="formController.form.partThree.question18No" style="display:inline" name="form.partThree.question18No" id="form.partThree.question18No"/>
</div>
</li>
</ol>

</div>



<h3><fmt:message key="i485.part4.title"/></h3>
<div>

<div class="question">
<fmt:message key="I485Part4.requestForAccomodation"/>
</div>
<div class="answer" id="requestForAccomodation">
<stripes:label for="form.partFour.requestForAccomodationYes" name="yes"/>
<stripes:checkbox ng-model="formController.form.partFour.requestForAccomodationYes" style="display:inline" name="form.partFour.requestForAccomodationYes" id="form.partFour.requestForAccomodationYes"/>
<stripes:label for="form.partFour.requestForAccomodationNo" name="no"/>
<stripes:checkbox ng-model="formController.form.partFour.requestForAccomodationNo" style="display:inline" name="form.partFour.requestForAccomodationNo" id="form.partFour.requestForAccomodationNo"/>
</div>

<div><fmt:message key="i485.part4.subtitle"/></div>
<table>
<tr>
<td class="checkboxText"><stripes:checkbox name="form.partFour.checkA" id="form.partFour.checkA"/>
<td><stripes:label for="form.partFour.checkA" name="I485Part4.a"/></td>
</tr>
<tr>
<td/>
<td><stripes:text ng-model="formController.form.partFour.a" name="form.partFour.a" style="width: 100%"/></td>
</tr>

<tr>
<td class="checkboxText"><stripes:checkbox name="form.partFour.checkB" id="form.partFour.checkB"/>
<td><stripes:label for="form.partFour.checkB" name="I485Part4.b"/></td>
</tr>
<tr>
<td/>
<td><stripes:text ng-model="formController.form.partFour.b" name="form.partFour.b" style="width: 100%"/></td>
</tr>

<tr>
<td class="checkboxText"><stripes:checkbox name="form.partFour.checkC" id="form.partFour.checkC"/>
<td><stripes:label for="form.partFour.checkC" name="I485Part4.c"/></td>
</tr>
<tr>
<td/>
<td><stripes:text ng-model="formController.form.partFour.c" name="form.partFour.c" style="width: 100%"/></td>
</tr>

</table>

</div>


<%-- <h3><fmt:message key="i-485.part5.title"/></h3> --%>
<!-- <div> -->
<!-- text1 -->
<!-- </div> -->
<%-- <h3><fmt:message key="i-485.part6.title"/></h3> --%>
<!-- <div> -->
<!-- text1 -->
<!-- </div> -->


</div>

<button ng-click="formController.saveToCookies()" type="button">Save</button>
<stripes:submit name="submit"/>  
     
</stripes:form>


</div>

<script>
$( "#accordion" ).accordion({heightStyle: "content"});

$(".answer").each(function(index, value) {
	var currentDiv = this;
	$(currentDiv).find('input:checkbox').click(function(){
	    var group = $("input:checkbox", currentDiv);
	    var wasChecked = $(this).prop("checked");
	    $(group).prop("checked",false);
	    if(wasChecked)
	    	{
	    	$(this).prop("checked",true);
	    	}
	    else{
		    $(this).prop("checked",false);
	    }     
});});

$.extend($.validator.messages, {
	required: '<fmt:message key="validation.requiredField"/>',
	dateUSA: '<fmt:message key="validation.notDate"/>' 
});

$("#I485Form").validate({
	errorPlacement: function(error, element) {
		element.prop('title', error.html());
	},
	 invalidHandler: function(event, validator) {	
// 		form.submit(); 	
		var numOfErrors = validator.numberOfInvalids();	


// validate part 2 checkboxes		
		var part2 = $("#formPart2");
		var part2Checked = false;
		$(":checkbox", part2).each(function(index, value) {
			if($(this).prop("checked")){
				part2Checked = true;
				}
		});

		if(part2Checked == false){
			numOfErrors++;
			$("#formPart2Error").addClass('errorMessage');	
			$("#formPart2Error").show();
		}else{
			$("#formPart2Error").removeClass('errorMessage');	
			$("#formPart2Error").hide();
		}

// validate part 3 checkboxes 
		var part3 = $("#questionnaire_part3");
		var part3Checked = true;
		
		$(".answer", part3).each(function(index, value) {
			var answerChecked = false;
			$(":checkbox", this).each(function(index, value) {
				if($(this).prop("checked")){
					answerChecked = true;
				}});
			if(answerChecked == false){
				part3Checked = false;
				$(this).addClass("errorAnswer");
				numOfErrors++;
			}
			else{
				$(this).removeClass("errorAnswer");
			}
		});
		
		if(part3Checked == false){
			$("#formPart3Error").show();
		}else{
			$("#formPart3Error").hide();
		}

// global message if there were any errors			
		if (numOfErrors > 0) {			
		var message = '<fmt:message key="validation.globalMessage1"/> ' + numOfErrors + ' <fmt:message key="validation.globalMessage2"/>';		
		$("#errorsDiv").html(message);
		$("#errorsDiv").show();
		validator.showErrors();
	    var contents = $('.ui-accordion-content');
	    contents.each(function( index ) {	    	
	    	var length = $('.error', this).length;
	    	length = length + $('.errorMessage', this).length;
	    	length = length + $('.errorAnswer', this).length;
	    	var header = $(this).prev();
	    	if(length !== 0){	    		
	    		var strNewString = header.html().replace(/\(.*\)/g,'');
	    		header.html(strNewString);
	    		header.html(header.html() + '(<fmt:message key="validation.errors"/>: ' + length + ')');
	    		header.removeClass('validAccordion');	
	    		header.addClass('errorAccordion');	    		
		    	}
	    	else{
	    		var strNewString = header.html().replace(/\(.*\)/g,'');
	    		header.html(strNewString);
	    		header.removeClass('errorAccordion');
	    		header.addClass('validAccordion');		 
		    }
	    });			
		} else {
		$("#errorsDiv").hide();
		}
		},
        submitHandler: function (form) {
//             alert('valid form');
//             return false;
 			   form.submit();
        },
	ignore: []
});

</script>
	
	</stripes:layout-component>
</stripes:layout-render>