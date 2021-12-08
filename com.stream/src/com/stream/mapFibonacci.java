package com.stream;


import java.util.stream.Stream;

public class mapFibonacci {
	
	 public static void main(String ar[])   
	    {
	
	
	Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]}).limit(10) .map(n -> n[0]).forEach(x -> System.out.println(x));


}
}