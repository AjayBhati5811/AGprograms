package com.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamLimit {
	
	public static void main(String[] args) 
    {
        Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);
         
        List<Integer> newList = evenNumInfiniteStream.limit(10).collect(Collectors.toList());
        
        System.out.println(newList);
    }
}


