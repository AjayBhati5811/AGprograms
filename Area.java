package com;

public class Area 
{
	public static void main(String[] args)
	{
		rectangle c1 = new rectangle();
		rectangle c2 = new rectangle();
		c1.insert(11,5);
		c2.insert(3,15);
		c1.calculateArea();
		c2.calculateArea();
	}
}
