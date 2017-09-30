package com.janousek.formtranslator.web;

import java.util.Date;
import java.util.Locale;

import net.sourceforge.stripes.validation.DefaultTypeConverterFactory;
import net.sourceforge.stripes.validation.TypeConverter;

import com.janousek.formtranslator.web.util.DateConverter;
import com.janousek.formtranslator.web.util.StringConverter;

public class AppConverterFactory extends DefaultTypeConverterFactory {

	@Override
	@SuppressWarnings("unchecked")
	public TypeConverter getTypeConverter(Class forType, Locale locale)
			throws Exception {
		// TODO: add thread local caching 
		if (Date.class.isAssignableFrom(forType)) {
			return super.getInstance(DateConverter.class, locale);
		}
		if (String.class.isAssignableFrom(forType)){
			return super.getInstance(StringConverter.class, locale);
		}
		return super.getTypeConverter(forType, locale);
	}
}
