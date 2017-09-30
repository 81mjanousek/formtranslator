package com.janousek.formtranslator.common;

import java.util.Locale;

import com.janousek.formtranslator.common.util.BeanUtil;
import com.janousek.formtranslator.common.util.LocalizationUtil;

public class SessionContext {

	protected static ThreadLocal<SessionContext> threadLocal = new ThreadLocal<SessionContext>();

	protected Locale locale;

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public String getLocaleText(String name) {
		return LocalizationUtil.localize(name, locale);
	}

	public String getLocaleText(String name, String dictionaryPrefix) {
		return LocalizationUtil.localize(dictionaryPrefix != null ? "di."
				+ dictionaryPrefix + "." + name : name, locale);
	}

	public String getLocaleText(String name, String dictionaryPrefix,
			String[] params) {
		return LocalizationUtil.localize(dictionaryPrefix != null ? "di."
				+ dictionaryPrefix + "." + name : name, locale, params);
	}

	public static synchronized SessionContext _get() {
		return threadLocal.get();
	}

	public static synchronized void _set(SessionContext ctx) {
		threadLocal.set(ctx);
	}

	public static synchronized void _remove() {
		threadLocal.set(null);
	}

	public String toString() {
		return BeanUtil.getString(this);
	}

}
