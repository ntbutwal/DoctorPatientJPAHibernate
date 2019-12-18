package com.hibernateJpa.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernateJpa.entities.DoctorEntity;

@Repository
public class DoctorRepository {

	private EntityManager entityManager;

	@Transactional
	public void save(DoctorEntity doctor) {
		entityManager.persist(doctor);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
