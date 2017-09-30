package com.janousek.formtranslator.web.action;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

@UrlBinding(value = "/index.html")
public class IndexAction extends BasicAction{
	
	@DefaultHandler
	public Resolution load() {
		return new ForwardResolution("/index.jsp");
	}

}
