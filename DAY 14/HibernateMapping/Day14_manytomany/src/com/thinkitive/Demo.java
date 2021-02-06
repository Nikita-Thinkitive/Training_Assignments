package com.thinkitive;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Address a1 = new Address(999, "Mumbai");
		Address a2 = new Address(555, "Nasik");
		Address a3 = new Address(222, "New York");
		
		Set <Address> ad=new HashSet<Address>();
		ad.add(a1);
		ad.add(a2);
		ad.add(a3);
		
		
		Employee e=new Employee(50, "admin", 5555, ad);
		session.save(e);
		
		t.commit();
		session.close();
		factory.close();
		
	}

}
