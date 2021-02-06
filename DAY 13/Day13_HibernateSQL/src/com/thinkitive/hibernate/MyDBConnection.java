package com.thinkitive.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyDBConnection {
	
	
	 Configuration cfg=new Configuration();
	 SessionFactory factory=cfg.configure().buildSessionFactory();
	 Session session= factory.openSession();
	 Transaction tx= session.beginTransaction();
	
	
	
	
	
	public void insert(Employee e) {
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e);
		tx.commit();
		System.out.println("Employee Created");
		session.close();
	}
	
	public void display() {
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query q = session.createQuery("From Employee");
		List l = q.list();
		System.out.println(l);
		tx.commit();
		session.close();
	}
	
	public void update(String n1, String n2) {

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("update demoemployee set ename = :name2" + " where ename = :name");
		query.setParameter("name", n1);
		query.setParameter("name2", n2);
		query.executeUpdate();
		tx.commit();
		session.close();
	}
	
	public void delete(Employee e) {
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.delete(e);
		tx.commit();
		session.close();
	}
}


