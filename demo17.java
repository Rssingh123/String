package string;

import java.util.Scanner;

public class demo17 {
	public static void main(String[] args)
    {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
	  //  int k=scan.nextInt();
		PrintAllsubstring(s);
		
    }
	
static  void PrintAllsubstring(String s)
{
	for(int size=1; size<=s.length(); size++)
	    for(int i=0; i<=s.length()-size; i++)
	    {
	    String t=" ";
		for(int j=i; j<i+size; j++)
		{
			t=t+s.charAt(j);
		
		}
		System.out.println(t);
	    }
		
		
	}
    
	
}

/*
Output
hello
 h
 e
 l
 l
 o
 he
 el
 ll
 lo
 hel
 ell
 llo
 hell
 ello
 hello


mississippi
 m
 i
 s
 s
 i
 s
 s
 i
 p
 p
 i
 mi
 is
 ss
 si
 is
 ss
 si
 ip
 pp
 pi
 mis
 iss
 ssi
 sis
 iss
 ssi
 sip
 ipp
 ppi
 miss
 issi
 ssis
 siss
 issi
 ssip
 sipp
 ippi
 missi
 issis
 ssiss
 sissi
 issip
 ssipp
 sippi
 missis
 ississ
 ssissi
 sissip
 issipp
 ssippi
 mississ
 ississi
 ssissip
 sissipp
 issippi
 mississi
 ississip
 ssissipp
 sissippi
 mississip
 ississipp
 ssissippi
 mississipp
 ississippi
 mississippi

 */




