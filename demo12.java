package string;

import java.util.Scanner;

public class demo12 {
	public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		System.out.println(trim(s));
		
    }
	    static String trim(String s)
	    {
	    	int ei=0,si=0;
		for(int i=0; i<s.length(); i++)
		{
			if( s.charAt(i) !=' ')
			{
	         si=i;
	         break;
			
	     	}
		}
		
		for(int i=s.length()-1; i>=0; i--)
		{
			if( s.charAt(i) !=' ')
			{
	         ei=i;
	         break;
			}
		}
		
		String res=" ";
		for(int i=si; i<=ei; i++)
		{
			res=res+s.charAt(i);

		}
		
		return res;
	}
    
	
}



/*
Output
     how    are   you
 how    are   you

*/













