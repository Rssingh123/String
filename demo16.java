package string;

import java.util.Scanner;

public class demo16 {
	public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
	    int k=scan.nextInt();
	    palindromicSubstring(s,k);
	    
    }
	
static  void palindromicSubstring(String s,int k)
{
	    for(int i=0; i<=s.length()-k; i++)
	    {
	    String t=" ";
		for(int j=i; j<i+k; j++)
		{
			t=t+s.charAt(j);
		
		}
		
		
		System.out.println(t);
	    }
		
	    
	}

    
	
}