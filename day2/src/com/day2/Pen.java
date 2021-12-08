package com.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pen implements Comparable<Pen>
	
	    {
	    	private int inr;
	    	private String brand;
		
	    	public Pen (int inr, String brand) 
	    	{
	    		this.inr = inr;
	    		this.brand = brand;	
		    } 
		
	    	public String toString()
	    	{
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
	    	}
	    }
	    		
	    	
	    		 class objsorting
	    		{
	    		
	    			public static void main(String args[]) 
	    			{	
	    			Pen p1 = new Pen (10, "Reynolds");
				    Pen p2 = new Pen (20, "Cello");
				    Pen p3 = new Pen (30, "Flair");
				    Pen p4 = new Pen (40, "Classmate");
				    Pen p5 = new Pen (50, "Parker");
				
				List<Pen> penList = new ArrayList<Pen>();
				
				penList.add(p1);
				penList.add(p2);
				penList.add(p3);
				penList.add(p4);
				penList.add(p5);
				
				
				ArrayList<Pen> ls = new ArrayList<Pen>();
				Collections.sort(penList,Collections.reverseOrder());
				
				System.out.println(penList);
				
				
				
				
			}
		}
	    	  	
	    	




