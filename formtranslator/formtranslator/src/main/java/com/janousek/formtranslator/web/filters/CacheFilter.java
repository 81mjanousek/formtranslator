package com.janousek.formtranslator.web.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CacheFilter implements Filter {
	static Log log = LogFactory.getLog(CacheFilter.class);
	protected FilterConfig fc;

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) res;

		//response.setHeader("Cache-Control", "must-revalidate");
		response.setHeader("Cache-Control","max-age=3600, must-revalidate");
		response.setHeader("Expires", "");
		//HTTP 1.0
		response.setHeader("Pragma", "");

		// pass the request/response on
		chain.doFilter(req, response);
	}

	public void init(FilterConfig filterConfig) {
		this.fc = filterConfig;
		log.info("init");
	}

	public void destroy() {
		log.info("destroy");
	}

}
