package com.janousek.formtranslator.web;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.janousek.formtranslator.common.EntityManagerContext;

public class AppContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
		//init context params
		
	}

	public void contextDestroyed(ServletContextEvent event) {
		//close Entity Manager Factory
		//EntityManagerContext.closeEntityManagerFactory();
	}

}
