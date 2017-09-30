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

public class DefaultResponseFilter implements Filter {
	static Log log = LogFactory.getLog(DefaultResponseFilter.class);
	protected FilterConfig fc;

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) res;

		//HTTP 1.1
		response.setHeader("Cache-Control", "no-store");
		//HTTP 1.0
		response.setHeader("Pragma", "no-cache");
		//prevents caching at the proxy server
		response.setDateHeader("Expires", 0);

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
