package com.hibernateJpa.main;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernateJpa.entities.PatientEntity;
import com.hibernateJpa.repositories.PatientsRepository;

public class CreatePatientMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		PatientsRepository pr = (PatientsRepository) context.getBean("patientsRepository");

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1992);
		cal.set(Calendar.MONTH, 8);
		cal.set(Calendar.DAY_OF_MONTH, 8);
		Date date = cal.getTime();

		PatientEntity pe = new PatientEntity();
		pe.setName("Selena Gomez");
		pe.setPhone("70572893728");
		pe.setEmail("selenagomez@gmail.com");
		pe.setDob(date);
		pe.setLastFourSSN("6537");
		pr.save(pe);
	}

}
