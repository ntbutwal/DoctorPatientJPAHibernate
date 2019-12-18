package com.hibernateJpa.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernateJpa.entities.PatientEntity;

@Repository
public class PatientsRepository {

	private EntityManager entityManager;

	@Transactional
	public void save(PatientEntity patient) {
		entityManager.persist(patient);

	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
