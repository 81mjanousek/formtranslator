package com.janousek.formtranslator.web.helper;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionHelper {

	protected Throwable ex;

	public ExceptionHelper(Throwable ex) {
		this.ex = ex;
	}

	public String toString() {
		if(ex==null) return "";
		StringWriter sw = new StringWriter();
		ex.printStackTrace(new PrintWriter(sw));
		String ret = sw.toString();
		return ret;
	}

}
