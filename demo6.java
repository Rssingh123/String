package string;

import java.util.Scanner;

public class demo6 {
	public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String result=arrangeSpecial(s);
		System.out.println(result);
		
    }
	public static String arrangeSpecial(String s)
	{
		String res1="";
		String res2="";
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z')||(ch>='0' && ch<='9'))
			{
	         res1=res1+ch;
			
	     	}
			else 
			{
				 res2=res2+ch;
			}
			
		}
		return res1+res2;
	}
}



/*
Output
a+b-(2/3)*p
ab23p+-(/)*
*/















