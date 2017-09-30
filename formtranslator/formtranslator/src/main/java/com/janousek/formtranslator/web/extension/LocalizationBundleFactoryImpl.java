package com.janousek.formtranslator.web.extension;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import net.sourceforge.stripes.config.Configuration;
import net.sourceforge.stripes.localization.LocalizationBundleFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.janousek.formtranslator.common.util.LocalizationUtil;

public class LocalizationBundleFactoryImpl implements LocalizationBundleFactory {

	private static final Log log = LogFactory
			.getLog(LocalizationBundleFactoryImpl.class);

	public ResourceBundle getErrorMessageBundle(Locale locale)
			throws MissingResourceException {
		return LocalizationUtil.getDefaultResourceBundle(locale);
	}

	public ResourceBundle getFormFieldBundle(Locale locale)
			throws MissingResourceException {
		return LocalizationUtil.getDefaultResourceBundle(locale);
	}

	public void init(Configuration arg0) throws Exception {
		log.info("init");
	}

}
