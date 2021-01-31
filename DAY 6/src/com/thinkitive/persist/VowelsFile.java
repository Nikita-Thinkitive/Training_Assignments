package com.thinkitive.persist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class VowelsFile {
	public static void main(String[] args) {
		
		try
		{
		FileWriter fw=new FileWriter("file.txt");
		FileReader fr=new FileReader("file.txt");
		
		fw.write("This is files abc");
		//String str=
		int ch=0;
		while ((ch=(char) fr.read()) != -1) 
		{
		//	System.out.print((char) i);
			if(ch=='a'|| ch=='e'|| ch=='o'|| ch=='u'||ch=='i')
			{				
				fw.write(ch);
				 System.out.println();
			}
			
		}
		}
		catch (IOException e) {
			System.out.println("File Exception: "+ e);
		}
		
	}
	
	
	

}
