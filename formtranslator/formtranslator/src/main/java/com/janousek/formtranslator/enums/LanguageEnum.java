package com.janousek.formtranslator.enums;

public enum LanguageEnum {
	en, es;

	public static LanguageEnum toEnum(String country) {
		return LanguageEnum.valueOf(LanguageEnum.class, country);
	}

	public String getCountry() {
		return this.toString();
	}

}
