package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateInstructorDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
													.addAnnotatedClass(Instructor.class)
													.addAnnotatedClass(InstructorDetail.class)
													.addAnnotatedClass(Course.class)
													.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			Instructor tempInstructor = new Instructor("Suzan", "Public", "suzan.public0306@gmail.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail("https://youtube.com", "games");
			
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
			//add clean up code
			session.close();
			factory.close();
		}
	}

}
