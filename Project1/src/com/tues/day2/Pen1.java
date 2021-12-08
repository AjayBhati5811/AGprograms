package com.tues.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    class Pen implements Comparable<Pen>
    {
    	private int inr;
    	private String brand;
	
    	public Pen (int inr, String brand) 
    	{
    		this.inr = inr;
    		this.brand = brand;	
	    } 
	
    	public String toString() {
    		return ("Price =" + inr + "brand = " +brand);
    	}
    	public int compareTo(Pen o)
    	{
    		if (this.inr==o.inr)
    		{
			return 0;
    		}
    		else if (this.inr>o.inr)
    		{
    			return 1;
    		}
    		else
    		{
    			return -1;
    		}
    		
    	
	public class objectSorting{
		public static void main(String[] args) {
			Pen p1 = new Pen (10, "Reynolds");
			Pen p2 = new Pen (20, "Cello");
			Pen p3 = new Pen (30, "Flair");
			Pen p4 = new Pen (40, "Classmate");
			Pen p5 = new Pen (50, "Parker");
			
			List<Pen> penList = new ArrayList Pen<>();
			
			penList.add(p1);
			penList.add(p2);
			penList.add(p3);
			penList.add(p4);
			penList.add(p5);
			
			
			ArrayList<Integer> ls = new ArrayList<Integer>();
			Collections.sort(penList);
			
			System.out.println(penList);
			
			
			
			
		}
	}
    	}
    	

