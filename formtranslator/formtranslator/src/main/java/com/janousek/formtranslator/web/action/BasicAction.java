package com.janousek.formtranslator.web.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.controller.StripesFilter;

import com.janousek.formtranslator.enums.LanguageEnum;
import com.janousek.formtranslator.web.AppActionBeanContext;

public abstract class BasicAction implements ActionBean {

	private AppActionBeanContext context;

	private LanguageEnum language;

	/** Interface method from ActionBean. */
	public void setContext(ActionBeanContext context) {
		this.context = (AppActionBeanContext) context;
	}

	/** Interface method from ActionBean, using a co-variant return type! */
	public AppActionBeanContext getContext() {
		if (this.context != null) {
			this.context.getRequest().setAttribute("beanClass",
					this.getClass().getName());
		}
		return this.context;
	}

	/**
	 * get params which were set probably by ajax invoke() call
	 * 
	 * @return array of Params
	 */
	public String[] ajaxGetParams() {
		String params = (String) getContext().getRequest().getParameter(
				"params");
		List<String> arrayParams = new ArrayList<String>();
		if (params != null) {
			StringTokenizer st = new StringTokenizer(params, ",");
			while (st.hasMoreTokens()) {
				String element = st.nextToken();
				if (element != null && !element.equals(""))
					arrayParams.add(element);
			}
		}
		return arrayParams.toArray(new String[] {});
	}

	public String getLocale(String localize) {
		Locale locale = getContext().getRequest().getLocale();
		ResourceBundle bundle = StripesFilter.getConfiguration()
				.getLocalizationBundleFactory().getFormFieldBundle(locale);
		return bundle.getString(localize);
	}

	public Resolution changeLocale() {
		return getContext().getSourcePageResolution();
	}

	public LanguageEnum getLanguage() {
		return language;
	}

	public void setLanguage(LanguageEnum language) {
		this.language = language;
	}

}
