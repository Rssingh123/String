package string;

import java.util.Scanner;

public class demo7 {
	public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String result=arrangeString(s);
		System.out.println(result);
		
    }
	public static String arrangeString(String s)
	{
		String res="";
		int sum=0;
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z'))
			{
	         res=res+ch;
			
	     	}
			else if(ch>=48 && ch<=57)
			{
				 sum=sum+ch;
			}
			
		}
		return res+sum;
	}
}

/* Output
Ab*2C3d9
AbCd158
 */










