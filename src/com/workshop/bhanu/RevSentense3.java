package com.workshop.bhanu;

public class RevSentense3 {
	static String word="";
	static String revword="";
	
	public static void main(String[] args) 
	{
		String s = "HELLO MY FRIEND";
		String[] v = s.split(" ");
		for(int i=0;i<=v.length-1;i++)
		{
		  word=v[i];
		  for(int j=word.length()-1;j>=0;j--)
		  {
			  revword=revword+word.charAt(j);
			  
		  }
		  revword = revword+" ";
		}
		System.out.println(revword);
	}

}
