package com.thinkitive.books;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.thinkitive.Book;

public class Test {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("ABC");
		Set<String> set1=new HashSet<String>();
		set1.add("J.K rollings");
		
		//List <Book> al=new ArrayList<Book>();
		
		Book b=new Book(1,"ikigai",set,200);
		Book b1=new Book(2,"HarryPotter",set1,1000);
		Book b2=new Book(3,"Secret",set,90);
		
		//al.add(b1);
		//al.add(b2);
		System.out.println("Insert New Records: ");
		StoreUtil<Book> store=new StoreUtil<Book>();
		store.addRecord(b);
		store.addRecord(b1);
		store.addRecord(b2);
		
		SortUtil so=new SortUtil();
		
		
		
		List<Book> list=store.getRecords();
		
		
		System.out.println("Total No of Books:");
		store.getNumOfRecords(list);
		System.out.println("\nAll Books:\n" +list);
		//store.getRecords(al);
		
		System.out.println("\nSorted Order Of Books By Name:");
		
		
		so.sortByName(list);
		System.out.println("\n");
		System.out.println("Sorted Order Of Books By price:");
		so.sortByPrice(list);
		
	
	
	}

}
