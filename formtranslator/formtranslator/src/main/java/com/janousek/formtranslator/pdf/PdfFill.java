package com.janousek.formtranslator.pdf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Date;

import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDCheckbox;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

import com.janousek.formtranslator.annotation.PdfField;
import com.janousek.formtranslator.entity.BasicForm;
import com.janousek.formtranslator.entity.I485Form;
import com.janousek.formtranslator.entity.I485Part2;
import com.janousek.formtranslator.entity.I485Part3;
import com.janousek.formtranslator.entity.I485Part4;
import com.janousek.formtranslator.web.util.DateToStringFormatter;

public class PdfFill {

	public static void main(String... args) throws IOException,
			COSVisitorException {
		Calendar calOfBirth = Calendar.getInstance();
		calOfBirth.set(1981, 9, 25);

		I485Form form = new I485Form();
		BasicForm part1 = new BasicForm();
		part1.setFamilyName("Janousek");
		part1.setGivenName("Martin");
		part1.setAddress("Uhrineveska 18");
		part1.setAptNo("22");
		part1.setCity("Prague");
		part1.setState("Czech Republic");
		part1.setZipCode("100 00");
		part1.setDateOfBirth(calOfBirth.getTime());
		part1.setCountryOfCitizenship("Czech Republic");
		//part1.setAnumber("885566");
		//part1.setDateOfLastArrival(calOfBirth.getTime());
		part1.setI94Number("I945552365");
		part1.setExpiresOn(calOfBirth.getTime());

		I485Part2 part2 = new I485Part2();
//		part2.setA(true);
//		part2.setB(true);
//		part2.setC(true);
//		part2.setD(true);
//		part2.setE(true);
//		part2.setF(true);
//		part2.setG(true);
//		part2.setH(true);
//		part2.setI(true);
//		part2.setJ(true);
		
		form.setPartOne(part1);
		form.setPartTwo(part2);
		I485Part3 part3 = new I485Part3();
		form.setPartThree(part3);
		I485Part4 part4 = new I485Part4();
		form.setPartFour(part4);
		fillI485Form(form);

	}

	public static void fillI485Form(I485Form form) throws IOException,
			COSVisitorException {
		InputStream is = PdfFill.class
				.getResourceAsStream("/i-485.unlocked.pdf");
		PDDocument pdf = PDDocument.load(is);
		is.close();
		pdf.setAllSecurityToBeRemoved(true);
		PDDocumentCatalog docCatalog = pdf.getDocumentCatalog();
		PDAcroForm acroForm = docCatalog.getAcroForm();

		fillObjectToPdf(form.getPartOne(), acroForm);
		fillObjectToPdf(form.getPartTwo(), acroForm);
		fillObjectToPdf(form.getPartThree(), acroForm);

		for (int i = 0; i < form.getPartThree().getRelatives().size(); i++) {
			fillObjectToPdf(form.getPartThree().getRelatives().get(i),
					acroForm, i);
		}
		for (int i = 0; i < form.getPartThree().getMemberships().size(); i++) {
			fillObjectToPdf(form.getPartThree().getMemberships().get(i),
					acroForm, i);
		}
		fillObjectToPdf(form.getPartFour(), acroForm);
		//fillObjectToPdf(form.getPartFive(), acroForm);
		// fillObjectToPdf(form.getPartSix(), acroForm);

		// pdf.save("C:\\Users\\DeeJay\\test.pdf");
		pdf.save("D:\\test.pdf");
		pdf.close();

	}

	public static void fillObjectToPdf(Object objectToPdf, PDAcroForm acroForm) {
			fillObjectToPdf(objectToPdf, acroForm, null);		
	}

	public static void fillObjectToPdf(Object objectToPdf, PDAcroForm acroForm,
			Integer fieldIndex) {
		for (Field field : objectToPdf.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(PdfField.class)) {
				Annotation annotation = field.getAnnotation(PdfField.class);
				PdfField pdfFieldAnnotation = (PdfField) annotation;
				String fieldName = field.getName();
				String pdfFieldName = field.getName();
				if (pdfFieldAnnotation.alternateFieldName() != null
						&& !pdfFieldAnnotation.alternateFieldName().isEmpty()) {
					pdfFieldName = pdfFieldAnnotation.alternateFieldName();
				}
				if (fieldIndex != null) {
					pdfFieldName = pdfFieldName + fieldIndex;
				}
				try {
					fillFieldValue(objectToPdf, fieldName, pdfFieldName, acroForm);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void fillFieldValue(Object reflectedClass, String fieldName,
			String pdfFieldName, PDAcroForm acroForm)
			throws NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, IOException {		
		String getMethod = null;
		char first = Character.toUpperCase(fieldName.charAt(0));
		getMethod = "get" + first + fieldName.substring(1);
		Object methodRetVal = reflectedClass.getClass().getMethod(getMethod)
				.invoke(reflectedClass, null);

		System.out.println(pdfFieldName);
		if (methodRetVal == null) {
		} else if (methodRetVal instanceof Boolean) {
			if ((Boolean) methodRetVal == true) {
				PDField field = acroForm.getField(pdfFieldName);
				((PDCheckbox) field).check();
			}
		} else if (methodRetVal instanceof String) {
			acroForm.getField(pdfFieldName).setValue((String) methodRetVal);
		} else if (methodRetVal instanceof Date) {
			String formattedDate = DateToStringFormatter
					.getString((Date) methodRetVal);
			acroForm.getField(pdfFieldName).setValue(formattedDate);
		}
	}

}
