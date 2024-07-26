package string;

import java.util.Scanner;

public class demo4 {
	public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		countCharacters(s);
		
    }
	static void countCharacters(String s)
	{
		int vc=0,cc=0,nc=0,sc=0;
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
						ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U' )
			
			{
				vc++;
			}
			else
			{
				cc++;
			}
		}
			
			else if(ch>='0' && ch<='9')
			{
			  nc++;
			}
			else 
			{
			 sc++;
			}
		}
		System.out.println("vc="+vc);
		System.out.println("cc="+cc);
		System.out.println("nc="+nc);
		System.out.println("sc="+sc);
	}
}

/*
Output

tap@123
vc=1
cc=2
nc=3
sc=1

Raju@123
vc=2
cc=2
nc=3
sc=1


 */
	
	

