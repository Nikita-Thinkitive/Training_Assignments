package com.thinkitive.books;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.thinkitive.Book;

public class SortUtil {
	
	public static void sortByName(List<Book> b)
	{
		
		List al = new ArrayList();
		al.add(b);
		Collections.sort(b, new CompareBooksByName());
		System.out.println(b);
		
	}
	
	public static void sortByPrice(List<Book> b)
	{
		List al = new ArrayList();
		al.add(b);
		Collections.sort(b, new CompareBooksByPrice());
		System.out.println(b);
	}

	
	
	

}
