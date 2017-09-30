package com.janousek.formtranslator.web.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

import com.janousek.formtranslator.common.SessionContext;

import net.sourceforge.stripes.validation.ScopedLocalizableError;
import net.sourceforge.stripes.validation.TypeConverter;
import net.sourceforge.stripes.validation.ValidationError;

public class DateConverter implements TypeConverter<Date> {

	@SuppressWarnings("unused")
	private Locale locale;

	public Date convert(String input, Class<? extends Date> targetType,
			Collection<ValidationError> errors) {
		DateFormat formatter = new SimpleDateFormat(SessionContext._get()
				.getLocaleText("dateFormat"));
		formatter.setLenient(false);
		try {
			return formatter.parse(input.trim());
		} catch (ParseException ex) {
			/* Do nothing - obey normal program flow */
			ex.printStackTrace();
		}
		errors.add(new ScopedLocalizableError("converter.date", "invalidDate"));
		return null;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}
}
