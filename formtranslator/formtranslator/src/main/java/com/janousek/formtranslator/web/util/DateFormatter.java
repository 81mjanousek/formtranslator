package com.janousek.formtranslator.web.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.janousek.formtranslator.common.SessionContext;

import net.sourceforge.stripes.format.Formatter;


public class DateFormatter implements Formatter<Date> {
	
	@SuppressWarnings("unused")
	private String formatType;
    @SuppressWarnings("unused")
	private String formatPattern;
    @SuppressWarnings("unused")
	private Locale locale;
    private DateFormat format;
		
	public String format(Date input) {
		return this.format.format(input);
	}

	public void init() {
		format = new SimpleDateFormat(SessionContext._get().getLocaleText(
				"dateFormat")); // Called once
	}

	public void setFormatPattern(String formatPattern) {
		this.formatPattern = formatPattern;
	}

	public void setFormatType(String formatType) {
		this.formatType = formatType;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}
}
