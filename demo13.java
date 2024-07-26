package string;

import java.util.Scanner;

public class demo13 {
	public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String t=scan.nextLine();
		System.out.println(findString(s,t));
		
    }
	    static boolean findString(String s,String t)
	    {
	    int i=0,j=0;
		while(i<s.length() && j<t.length())
		{
			if(s.charAt(i)==t.charAt(j))
			{
				i++;
				j++;
			}
			else 
			{
				i++;
			}
		}
		if(j==t.length())
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
    
	
}


/*
Output

heariamstackerrank
hackerrank
true

heariamstackerrank
hackerrankkkk
false

 */













