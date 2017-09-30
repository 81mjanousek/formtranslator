package com.janousek.formtranslator.web.util;

import java.util.Collection;

import java.util.Locale;

import net.sourceforge.stripes.validation.TypeConverter;
import net.sourceforge.stripes.validation.ValidationError;

public class StringConverter implements TypeConverter<String> {

	@SuppressWarnings("unused")
	private Locale locale;

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public String convert(String text, Class<? extends String> arg1,
			Collection<ValidationError> arg2) {
		String retText = text.trim();
		if (retText.equals("")) {
			retText = null;
		}
		return retText;

	}
}
