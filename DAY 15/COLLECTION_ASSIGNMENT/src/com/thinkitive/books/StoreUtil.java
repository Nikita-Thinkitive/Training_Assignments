package com.thinkitive.books;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.thinkitive.Book;

public class StoreUtil<T> {
	List<T> al=new ArrayList<T>();
	
	public StoreUtil() {
		// TODO Auto-generated constructor stub
	}

	
	
	public List addRecord(T b) {
		
		
		
		al.add(b);
		
		System.out.println(al);
		
		return al;
		
	}
	
	public List<T> getRecords() {
	
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			itr.next();
		}
		return al;
	}
	
	public void getNumOfRecords(List<Book> b) 
	{
		int total;
		System.out.println(b.size());
	}
}
