package com.thinkitive.persist;

import java.io.*;
public class alpha {
public static void main(String[] args)throws IOException
{

try
{
    FileInputStream fstream = new FileInputStream("file.txt");
    DataInputStream in = new DataInputStream(fstream);
    BufferedReader br = new BufferedReader(new InputStreamReader(in));

    FileWriter ostream = new FileWriter("vowels.txt");
      BufferedWriter out = new BufferedWriter(ostream);
      FileWriter opstream = new FileWriter("consonants.txt");
      BufferedWriter outt = new BufferedWriter(opstream); 

     String str=br.readLine();
     char ch;        
     for (int i=0;i<str.length();i++)
     {
         ch = str.charAt(i); 


      if(( ch == 'a') ||( ch == 'e') ||( ch == 'i') ||( ch == 'o') ||( ch == 'u')) 

    {
        out.write(ch);
    }
          else
          {
              outt.write(ch); 
          }

      }

     out.close();
      outt.close();
      br.close(); 
}
catch (Exception e) {
    System.err.println(e);
  }

    }

}