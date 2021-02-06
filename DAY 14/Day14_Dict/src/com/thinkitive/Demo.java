package com.thinkitive;

public class Demo {
public static void main(String[] args) {
	DbConnection db=new DbConnection();
	
	db.insert(new Dictionary("uhhh"));
	//db.getword();
	db.display();
}
}
