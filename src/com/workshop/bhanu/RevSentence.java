package com.workshop.bhanu;

public class RevSentence
{

	public static void main(String[] args) 
	{
		String s= "This Is Automation Class";
		String s1 = "";
		String[] v = s.split(" ");
		for(int i=v.length-1;i>=0;i--)
		{
					
			s1+=v[i]+" ";
		}
		System.out.println(s1.trim()); 
	}

}
