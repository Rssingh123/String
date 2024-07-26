package string;

import java.util.Scanner;

public class demo8 {
	public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		
		
		String res="";
		
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch=='A'|| ch>='a')
			{
	         res=res+"*"+ch;
			
	     	}
			else
			{
				res=res+ch;
			}
			
		}
		System.out.println(res);
	}
	
}

/*
Output
 banana
*b*a*n*a*n*a

 */






