package com.janousek.formtranslator.web.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToStringFormatter {

	private static DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

	public static String getString(Date date) {
		String retVal = "";
		if (date != null) {
			retVal = formatter.format(date);

		}
		return retVal;
	}

}
