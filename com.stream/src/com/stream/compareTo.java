package com.stream;

import java.util.Arrays;   
import java.util.Collection;  

public class compareTo {
	
    public static void main(String ar[])   
    {  
       Collection<Integer> elements = Arrays.asList(1,2,3,4,5);  
        Integer minimum = elements.stream().min(Integer::compareTo).get();  
        Integer maximum = elements.stream().max(Integer::compareTo).get();  
        System.out.println("Min is "+minimum);  
        System.out.println("Max is "+maximum);  
    }  
  
}  


