package com.stream;
import java.util.Arrays;
import java.util.List;

public class myMain {
	public static void main(final String[] args) {
	      List<String> list = Arrays.asList("Amit", "Ken","Yuvraj", "Gagan");
	      System.out.print("List = "+list);
	      System.out.print("\nUppercase strings = ");
	      list.stream().map(players -> players.toUpperCase()) .forEach(players -> System.out.print(players + " "));
	   }
}
