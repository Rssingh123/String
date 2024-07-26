package string;

import java.util.Scanner;

public class demo14 {
	public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
	    char ch=scan.next().charAt(0);
		System.out.println(indexOf(s,ch));
		
    }
	    static int indexOf(String s,char ch)
	    {
	    int i=0,j=0;
		for(i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==ch)
			{
				return i;
			}
			
		}
		return -1;
		
	}
    
	
}


/*
Output
monday
a
4

monday
n
2
 */





