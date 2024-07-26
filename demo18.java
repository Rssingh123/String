package string;

import java.util.Scanner;

public class demo18 {
	public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
	  //  int k=scan.nextInt();
		longestpalindromicsubstring(s);
		
    }
	
static  void longestpalindromicsubstring(String s)
{
	for(int size=s.length(); size>=1; size--)
	    for(int i=0; i<=s.length()-size; i++)
	    {
	    String t=" ";
		for(int j=i; j<i+size; j++)
		{
			t=t+s.charAt(j);
		
		}
		
		System.out.println(t);
	    }
	    
		
	}
    
	
}

/*
Output
hello
 hello
 hell
 ello
 hel
 ell
 llo
 he
 el
 ll
 lo
 h
 e
 l
 l
 o

 */



