package com.janousek.formtranslator.web;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import net.sourceforge.stripes.config.Configuration;
import net.sourceforge.stripes.localization.LocalePicker;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.janousek.formtranslator.common.SessionContext;

public class AppLocalePicker implements LocalePicker {

	static Log log = LogFactory.getLog(AppLocalePicker.class);	
	
	public static String ATT_SESSION_LOCALE_NAME = "locale";

	public String pickCharacterEncoding(HttpServletRequest arg0, Locale arg1) {
		return "utf-8";
	}

	public Locale pickLocale(HttpServletRequest request) {
		String language = request.getParameter("language");
		if(language != null){
			SessionContext._get().setLocale(new Locale(language));
		}
		return SessionContext._get().getLocale();		
	}

	public void init(Configuration arg0) throws Exception {
		log.info("init");
	}

}
