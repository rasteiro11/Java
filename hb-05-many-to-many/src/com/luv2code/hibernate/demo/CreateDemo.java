package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
													.addAnnotatedClass(Instructor.class)
													.addAnnotatedClass(InstructorDetail.class)
													.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			/*
			//crate the object
			Instructor tempInstructor = new Instructor("Chad", "Derby", "darby@luv2code.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail("https://google.com", "Luv 2 code");
			
			//associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			*/
			
			Instructor tempInstructor = new Instructor("Rafael", "Arnone", "titico0306@gmail.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail("https://titico03.com", "Luv two code");
			
			//associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			//start transacrion
			session.beginTransaction();
			
			//this will also save the detail object because of CASCADE.TYP.EALL
			//save the instructor
			System.out.println("Saving instructor: " + tempInstructor);
			session.save(tempInstructor);

			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
		}
		finally {
			factory.close();
		}
	}

}
