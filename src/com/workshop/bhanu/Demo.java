package com.workshop.bhanu;

public class Demo {

	public static void main(String[] args)
	{
		System.out.println("Om Ganapathyae Namaha");
		
		for(int i=1;i<6;i++)
		{
			for(int s=5;s>=i;s--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
