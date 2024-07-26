package string;

import java.util.Scanner;

public class demo3{
	public static void main(String[] args)
    {   
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int count=countVowels(s);
		System.out.println(count);
    }
	static int countVowels(String s)
	{
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
					ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				count++;
			}
		}
		return count;
	}
	
}

/*   output
 hello
 2
 HELLO
2

 */




