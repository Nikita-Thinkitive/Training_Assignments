package com.thinkitive;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;



public class DbConnection {
	Configuration cfg;
	SessionFactory factory;
	Session session;
	Transaction tx;
	Criteria c;
	Dictionary d=new Dictionary();
	
	public void connect()
	{
		 cfg=new Configuration();
		 cfg.addAnnotatedClass(Dictionary.class);
		
		//cfg.addAnnotatedClass(Employee.class);
		 factory=cfg.configure().buildSessionFactory();
		
		 session=factory.openSession();
		 tx=session.beginTransaction();
		
		 c=session.createCriteria(Dictionary.class);
		
	}
	public void close()
	{
		session.close();
		factory.close();
	}
	
	public List getword()
	{
		List l=null;
		connect();
		 session=factory.openSession();
		 tx=session.beginTransaction();
		/*c.add(Restrictions.gt("salary", 44));
		
		l=c.list();
		System.out.println(l);
		*/
		Criteria c=session.createCriteria(Dictionary.class);
		c.add(Restrictions.eq("word", "nik"));
		
		l=c.list();
		System.out.println(l);
		
		l=session.createQuery("From Dictionary").list();
		System.out.println(l);
		
		tx.commit();
		session.close();
		factory.close();
		return l;
		
	}
	public void insert(Dictionary d)
	{
		connect();
		Configuration config = new Configuration();
		SessionFactory factory = config.configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(d);

		tx.commit();
		session.close();
		factory.close();
		
	}
	 public List display()
	 {

			connect();
			List l = null;
			Configuration cfg = new Configuration();
			SessionFactory factory = cfg.configure().buildSessionFactory();

			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();

			l = session.createQuery("From Dictionary_Spring").list();
			

			tx.commit();
			session.close();
			factory.close();
			return l;
	 }
}
