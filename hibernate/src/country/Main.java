package country;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Capital.class)
								.addAnnotatedClass(Continet.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		
		try {			
			// create a student object
			System.out.println("Creating new  object...");
			Continet Cont = new Continet("India");
			Capital cap=new Capital(Cont.getCname(), "New Delhi");
			Map<Continet,Capital>countries=Cont.getCountries();
			countries.put(Cont, cap);
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the details...");
			System.out.println(cap);
			session.persist(Cont);
			
			// commit transaction
			session.getTransaction().commit();
			
			/*// MY NEW CODE
			
			// find out the student's id: primary key
			System.out.println("Saved student. Generated id: " + tempStudent.getId());
			
			// now get a new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on the id: primary key
			System.out.println("\nGetting student with id: " + tempStudent.getId());
			
			Student myStudent = session.get(Student.class, tempStudent.getId());
			
			System.out.println("Get complete: " + myStudent);
			
			// commit the transaction
			session.getTransaction().commit();*/
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}



	}

}
