package com.thinkitive.hibernate;

public class Demo {
	public static void main(String[] args) {
		MyDBConnection db=new MyDBConnection();
		
		db.insert(new Employee(31, "Harmoine", 4333));
		db.display();
		
		db.delete(new Employee(6, "nik", 45000));
		db.display();
		
		db.update("nik", "Ron");
		db.display();
		
	}

}
