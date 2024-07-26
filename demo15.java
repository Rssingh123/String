package string;

import java.util.Scanner;

public class demo15 {
	public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
	    int k=scan.nextInt();
		substring(s,k);
		
    }
	
static  void substring(String s,int k)
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






//WAP to print all the substrings of length 4 from a given string
/*
Output
mississippi
8
 mississi
 ississip
 ssissipp
 sissippi
 
mississippi
4
 miss
 issi
 ssis
 siss
 issi
 ssip
 sipp
 ippi
 
 
 
 
 */









