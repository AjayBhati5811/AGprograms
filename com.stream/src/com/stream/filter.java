package com.stream;

import java.util.stream.Stream;

public class filter {
	
	public static void main(String[] args)
    {
  
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Cakes","are","very", "delicious");
  
        
        stream.filter(str -> str.endsWith("s")).forEach(System.out::println);
    }

}
