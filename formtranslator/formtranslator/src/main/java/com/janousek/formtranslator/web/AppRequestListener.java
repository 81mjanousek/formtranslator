package com.janousek.formtranslator.web;

import java.util.Locale;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.janousek.formtranslator.common.EntityManagerContext;
import com.janousek.formtranslator.common.SessionContext;

public class AppRequestListener implements ServletRequestListener {

	static Log log = LogFactory.getLog(AppRequestListener.class);
	protected static final String ATT_CONTEXT_NAME = "context";

	public void requestInitialized(ServletRequestEvent event) {
		HttpServletRequest hreq = (HttpServletRequest) event
				.getServletRequest();

		// request encoding
		try {
			hreq.setCharacterEncoding("UTF-8");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// create SessionContext
		SessionContext ctx = (SessionContext) hreq.getSession().getAttribute(
				ATT_CONTEXT_NAME);
		if (ctx == null) {
			ctx = createSessionContext(event.getServletContext(), hreq);
			hreq.getSession().setAttribute(ATT_CONTEXT_NAME, ctx);
			log.info("create SessionContext " + ctx);
		}
		SessionContext._set(ctx);

	}

	protected SessionContext createSessionContext(ServletContext conf,
			HttpServletRequest hreq) {
		SessionContext ctx = new SessionContext();
		// set default properties
		// locale
		ctx.setLocale(new Locale(hreq.getLocale().getLanguage()));
		return ctx;
	}

	public void requestDestroyed(ServletRequestEvent event) {
		SessionContext._remove();
		// EntityManagerContext._close();
	}

}
