package com;

public class rectangle {
	 
		int length;
		int breadth;
		
		void insert(int l, int b)
		{
			length = l;
			breadth = b;
		}
		
		void calculateArea()
		{
			System.out.println("Area of the rectangle :" + length*breadth);
		}
}