package string;

import java.util.Scanner;

public class demo5 {
	public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String result=removeSpecialCharacters(s);
		System.out.println(result);
		
    }
	public static String removeSpecialCharacters(String s)
	{
		String res="";
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z')||(ch>='0' && ch<='9'))
			{
	         res=res+ch;
			
	     	}
			
		}
		return res;
	}
}

/* output 
res456SDFV
res456SDFV
 */
	
	

