package com.hibernateJpa.main;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernateJpa.entities.DoctorEntity;
import com.hibernateJpa.repositories.DoctorRepository;

public class CreateDoctorMainApp {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("application-context.xml");
		DoctorRepository doc= (DoctorRepository) context.getBean("doctorRepository");
		DoctorEntity doctor= new DoctorEntity();
		doctor.setDepartment("Surgery");
		doctor.setName("Dr. Kishor");
		doctor.setPhone("7032203541");
		doctor.setSpeciality("Neuron");
		doc.save(doctor);
	}

}
