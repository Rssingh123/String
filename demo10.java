package string;

import java.util.Scanner;

public class demo10 {
	public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		System.out.println(countWords(s));
		
    }
	    static int countWords(String s)
	    {
	    	int count=0;
		for(int i=0; i<s.length(); i++)
		{
			
			if(s.charAt(i)==' ')
			{
	         count++;
			
	     	}
		}
		return count+1;
	}
    
	
}

/*
Output
how are you
3
 */









