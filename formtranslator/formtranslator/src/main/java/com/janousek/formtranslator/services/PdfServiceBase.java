package com.janousek.formtranslator.services;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDCheckbox;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

import com.janousek.formtranslator.annotation.PdfField;
import com.janousek.formtranslator.web.util.DateToStringFormatter;

public abstract class PdfServiceBase {

	protected void fillObjectToPdf(Object objectToPdf, PDAcroForm acroForm) {
		fillObjectToPdf(objectToPdf, acroForm, null);
	}

	protected void fillObjectToPdf(Object objectToPdf, PDAcroForm acroForm,
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
					fillFieldValue(objectToPdf, fieldName, pdfFieldName,
							acroForm);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	protected void fillFieldValue(Object reflectedClass, String fieldName,
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
