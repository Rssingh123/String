package string;

import java.util.Scanner;

public class demo9 {
	public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		System.out.println(countSpaces(s));
		
    }
	    static int countSpaces(String s)
	    {
	    	int count=0;
		for(int i=0; i<s.length(); i++)
		{
			
			if(s.charAt(i)==' ')
			{
	         count++;
			
	     	}
		}
		return count;
	}
    
	
}


//write a program to count the number of space in bewtween.

/*
Output
 how are you
2

 */






