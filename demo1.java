package string;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args)
    {   
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String res= isPalindrome(s);
		System.out.println(res);
    }
	static String isPalindrome(String s)
	{
		int i=0, j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				return "not palindrome";
			}
		}
		return "palindrome";
	}
}

/* palindrome or not
  output 
 madam
 palindrome
 
 tenet
 palindrome

 ramesh
 not palindrome

 */







