package com.janousek.formtranslator.common;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class EntityManagerContext {

	static Log log = LogFactory.getLog(EntityManagerContext.class);
	public static final String PERSISTENCE_UNIT_NAME = "formstarter";
	protected static EntityManagerFactory emf;
	protected static ThreadLocal<EntityManager> threadLocal = new ThreadLocal<EntityManager>();

	protected final static EntityManagerFactory getEntityManagerFactory() {
		if (emf == null) {
			//create emf
			emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			log.info("Create EntityManagerFactory " + PERSISTENCE_UNIT_NAME);
		}
		return emf;
	}

	public final static void closeEntityManagerFactory() {
		if (emf != null) {
			emf.close();
			log.info("Close EntityManagerFactory " + PERSISTENCE_UNIT_NAME);
		}
		emf = null;
	}

	public final static synchronized EntityManager _get() {
		EntityManager em = threadLocal.get();
		if (em == null || !em.isOpen()) {
			em = getEntityManagerFactory().createEntityManager();
			threadLocal.set(em);
			log.info("Create EntityManager");
		}
		return em;
	}

	public final static synchronized EntityManager createUniqueEntityManager() {
		EntityManager em = getEntityManagerFactory().createEntityManager();
		log.info("Create EntityManager");
		return em;
	}

	public final static synchronized void _close() {
		EntityManager em = threadLocal.get();
		threadLocal.set(null);
		if (em != null) {
			if (em.getTransaction().isActive()) {
				log.warn("EntityManager has active transaction!!!");
				em.getTransaction().rollback();
				log.warn("EntityManager was rolledback automaticaly!!!");
			}
			em.close();
			log.info("Close EntityManager");
		}
	}
}
