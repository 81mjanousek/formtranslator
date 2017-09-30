package com.janousek.formtranslator.web;

import java.util.Date;
import java.util.Locale;

import net.sourceforge.stripes.format.DefaultFormatterFactory;
import net.sourceforge.stripes.format.Formatter;

import com.janousek.formtranslator.web.util.DateFormatter;

public class AppFormatterFactory extends DefaultFormatterFactory {

	@Override
	@SuppressWarnings("unchecked")
	public Formatter getFormatter(Class clazz, Locale locale,
			String formatType, String formatPattern) {
		Formatter formatter = null;
		if (Date.class.isAssignableFrom(clazz)) {
			formatter = new DateFormatter();
			formatter.setFormatType(formatType);
			formatter.setFormatPattern(formatPattern);
			formatter.setLocale(locale);
			formatter.init();
			return formatter;
		}
		return super.getFormatter(clazz, locale, formatType, formatPattern);
	}

}
