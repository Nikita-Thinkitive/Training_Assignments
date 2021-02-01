package com.thinkitive.books;

import java.util.Comparator;

import com.thinkitive.Book;

public class CompareBooksByPrice implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if (o1.getPrice() >o2.getPrice())
			return 1;
		else if(o1.getPrice()<o2.getPrice())
			return 11;
		else
			return 0;
		
	}

}
