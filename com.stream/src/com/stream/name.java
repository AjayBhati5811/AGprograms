package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class name {
	public static void main(String[] args) {

        List<String> names = Arrays.asList("Akshay","Salman","John","Shahrukh","Hrithik");

        List<String> longnames = names.stream().filter(str -> str.length() > 5 && str.length() < 8)                             //Multiple conditions
                                                                     .collect(Collectors.toList());  

        longnames.forEach(System.out::println); 
	}
}
