package com.thinkitive.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class MyClass {
	public List getEmployee()
	{
		List l=null;
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Address.class);
		//cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory=cfg.configure().buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Criteria c=session.createCriteria(Employee.class);
		Criteria c1=session.createCriteria(Address.class);
		/*c.add(Restrictions.gt("salary", 44));
		
		l=c.list();
		System.out.println(l);
		*/
		
		c.add(Restrictions.eq("ename", "nik"));
		
		l=c.list();
		System.out.println(l);
		
		l=session.createQuery("From Address").list();
		System.out.println(l);
		
		tx.commit();
		session.close();
		factory.close();
		return l;
		
	}

}
