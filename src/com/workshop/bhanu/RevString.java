package com.workshop.bhanu;

public class RevString {

	public static void main(String[] args) 
	{
		String s= "HELLO";
		String str="";
		String str1="";

		for(int i=s.length()-1;i>=0;i--)
		{
			str= str+ s.charAt(i);
			str1+=s.charAt(i);
			
		}
		System.out.println(str);
		System.out.println(str1);

		
		System.out.println("---- without using 2nd variable ----");
	
		for (int i = s.length() - 1; i >= 0; i--) 
		{ 
		System.out.print(s.charAt(i)); 
		} 
		

	}
}
