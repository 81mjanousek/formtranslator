package com.janousek.formtranslator.common.util;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LocalizationUtil {

	private static final String DEFAULT_BUNDLE_NAME = "FormTranslatorResources";

	private static Log log = LogFactory.getLog(LocalizationUtil.class);

	public static String localizeCatalogue(String catalogueClass, String key,
			Locale locale) {
		String skey = catalogueClass + "." + key;
		String ret = "???" + skey + "???";
		return ret;
	}

	/**
	 * Utility metoda, lokalizace stringu z katalogu podle classy katalogu a
	 * klice
	 * 
	 * @param catalogueClass
	 * @param key
	 * @param locale
	 * @return
	 */
	public static String localizeCatalogue(Class<?> catalogueClass, String key,
			Locale locale) {
		String skey = catalogueClass.getSimpleName() + "." + key;
		String fkey = catalogueClass.getName() + "." + key;
		String ret = "???" + skey + "???";
		String value = getValue(fkey, locale);
		if (value == null)
			return ret;
		return value;
	}

	public static String localize(String key, Locale locale) {
		String value = getValue(key, locale);
		if (value == null)
			return "???" + key + "???";
		return value;
	}

	public static String localize(String key, Locale locale, String... params) {
		String value = getValue(key, locale);
		if (value == null)
			return "???" + key + "???";
		// replace params
		for (int i = 0; i < params.length; i++) {
			value = value.replaceAll("\\{" + i + "\\}", params[i]);
		}
		return value;
	}

	private static String getValue(String key, Locale locale) {

		if (key == null) {
			log.warn("Resource key is null.");
			return null;
		}
		ResourceBundle bundle = null;
		try {
			bundle = getResourceBundle(DEFAULT_BUNDLE_NAME, locale);
		} catch (MissingResourceException ex) {
			log.warn("Can't find resourceBundle '" + DEFAULT_BUNDLE_NAME + "'",
					ex);
		}
		try {
			String value = bundle.getString(key);
			return value;
		} catch (MissingResourceException ex) {
			log.warn("Can't find resource [key=" + key + ",resourceBundle="
					+ DEFAULT_BUNDLE_NAME + ", locale=" + locale + "]");
			return null;
		}
	}

	public static ResourceBundle getDefaultResourceBundle(Locale locale) {
		return getResourceBundle(DEFAULT_BUNDLE_NAME, locale);
	}

	public static ResourceBundle getResourceBundle(String bundleName,
			Locale locale) {

		ResourceBundle bundle = ResourceBundle.getBundle(bundleName, locale,
				LocalizationUtil.class.getClassLoader());
		Locale avail = bundle.getLocale();
		if (locale.equals(avail)) {
			return bundle;
		}
		if ((locale.getLanguage().equals(avail.getLanguage()))
				&& ((("".equals(avail.getCountry())) || (locale.getCountry()
						.equals(avail.getCountry()))))) {
			return bundle;
		}
		return ResourceBundle.getBundle(bundleName, new Locale("", ""),
				LocalizationUtil.class.getClassLoader());
	}
}
