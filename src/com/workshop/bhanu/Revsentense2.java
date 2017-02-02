package com.workshop.bhanu;

public class Revsentense2
{
	static void Reverse()
	{
	String s="I LIVE IN INDIA AT MANDYA ";

    String[] words = s.split(" ");
     String str="";
    
     
    for (int i = 0; i < words.length; i++) 
    {
        String word = words[i];
         
     
        StringBuffer sb = new StringBuffer(word);
        String x=sb.reverse().toString();
         str+=x+" ";
       
    }
    System.out.println(str);
	}
	public static void main(String[] args) 
	{
		Reverse();
		
	}

}
