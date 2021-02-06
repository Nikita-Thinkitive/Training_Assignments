package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

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
		Address a1 = new Address(41876, "bangluru");

		Address a2 = new Address(7765, "Haidrabad");
		Address a3 = new Address(1234, "Delhi");
		Address a4 = new Address(9777, "punjab");
		List<Address> l=new ArrayList<Address>();
		l.add(a1);
		l.add(a2);
		l.add(a3);
		l.add(a4);
		
		Employee e=new Employee(7, "nik", 45000,l);
		
		session.save(e);
		t.commit();
		session.close();
		factory.close();
	}

}
