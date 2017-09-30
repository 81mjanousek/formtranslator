package com.janousek.formtranslator.web.security;

import java.lang.reflect.Method;

import com.janousek.formtranslator.common.exceptions.AppFormTranslatorException;

public class Normalizer {

	private static Class<?> normalizeClass;
	private static Method normalize;
	private static Object en;
	private static boolean sun;//verze < 1.6

	public static String normalize(String input) {
		if (normalizeClass == null) {
			init();
		}
		Object[] objects = null;
		if (sun) {
			objects = getSunObjects(input);
		} else {
			objects = getJavaObjects(input);
		}
		String result = "";
		try {
			result = (String) normalize.invoke(normalizeClass, objects);
		} catch (Exception e) {
			throw new AppFormTranslatorException(e);
		}
		return result;
	}

	private static void init() {
		sun = false;
		Class<?> mode = null;
		try { 
			normalizeClass = Class.forName("java.text.Normalizer");
			mode = Class.forName("java.text.Normalizer$Form");
		} catch (ClassNotFoundException e) {
			try {
				normalizeClass = Class.forName("sun.text.Normalizer");
				sun = true;
			} catch (ClassNotFoundException ee) {
				throw new AppFormTranslatorException(ee);
			}
		}
		try {
			Method[] metody = normalizeClass.getMethods();
			for (Method met : metody) {
				if (met.getName().equals("normalize")) {
					normalize = met;
					break;
				}
			}
		} catch (Exception e) {
			throw new AppFormTranslatorException(e);
		}
		if (sun) {
			try {
				en = normalizeClass.getField("NO_OP").get(null);
			} catch (Exception e) {
				throw new AppFormTranslatorException(e);
			}
		} else {
			Object[] modes = mode.getEnumConstants();
			for (Object ob : modes) {
				if (ob.toString().equals("NFC")) {
					en = ob;
				}
			}
		}
	}

	private static Object[] getSunObjects(String input) {
		Object[] obj = { input, en, 0 };
		return obj;
	}

	private static Object[] getJavaObjects(String input) {
		Object[] obj = { input, en };
		return obj;
	}

}
