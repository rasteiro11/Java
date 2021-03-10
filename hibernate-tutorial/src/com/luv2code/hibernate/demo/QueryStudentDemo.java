package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			// start a transaction
			session.beginTransaction();
			
			// query students
			List<Student> theStudents0 = session.createQuery("from Student").getResultList();
			
			// display the students
			displayStudents(theStudents0);
			
			// query students: lastName='Doe'
			List<Student> theStudents1 = session.createQuery("from Student s where s.lastName='Doe'").getResultList();
			
			// display the students
			System.out.println("\n\nStudents who have last name of Doe");
			displayStudents(theStudents1);
			
			// query students: lastName='Doe' OR firstName='Daffy'
			List<Student>theStudents2 =
					session.createQuery("from Student s where"
							+ " s.lastName='Doe' OR s.firstName='John'").getResultList();
			
			System.out.println("\n\nStudents who have last name of Doe OR first name Daffy");
			displayStudents(theStudents2);
			
			// query students where email LIKE '%gmail.com'
			List<Student> theStudents3 = session.createQuery("from Student s where"
					+ " s.email LIKE '%gmail.com'").getResultList();

			System.out.println("\n\nStudents whose email ends with gmail.com");			
			displayStudents(theStudents3);
			
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}





