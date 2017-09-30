package com.janousek.formtranslator.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sourceforge.stripes.config.Configuration;
import net.sourceforge.stripes.exception.ExceptionHandler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.janousek.formtranslator.common.exceptions.AppFormTranslatorException;

public class AppExceptionHandler implements ExceptionHandler {
	private static final Log log = LogFactory.getLog(AppExceptionHandler.class);

	public void handle(Throwable throwable, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		AppFormTranslatorException alex = getAppFormTranslatorException(throwable);
		if (alex == null) {
			Throwable root = findRoot(throwable);
			if (root != null) {
				alex = new AppFormTranslatorException(root);
			} else {
				alex = new AppFormTranslatorException(throwable);
			}
		}

		log.error("", alex);

		request.getSession().setAttribute("exception", alex);
		request.getRequestDispatcher("/500Redirector.jsp").forward(request,
				response);
	}

	public void init(Configuration configuration) throws Exception {

	}

	private AppFormTranslatorException getAppFormTranslatorException(
			Throwable throwable) {
		for (Throwable t = throwable; t != null; t = t.getCause()) {
			if (t instanceof AppFormTranslatorException) {
				return (AppFormTranslatorException) t;
			}
		}
		return null;
	}

	private Throwable findRoot(Throwable ex) {
		return findRoot(ex, 0);
	}

	private Throwable findRoot(Throwable ex, int depth) {
		if (ex == null)
			return null;
		// max depth
		if (depth > 7)
			return ex;
		if (ex instanceof ServletException) {
			Throwable rootCause = ((ServletException) ex).getRootCause();
			if (rootCause == null)
				return ex;
			else
				return findRoot(rootCause, depth + 1);
		}
		return ex;
	}
}