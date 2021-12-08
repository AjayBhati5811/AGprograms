package com.stream;

import java.util.*;
import java.util.stream.Collectors;

public class streamCollector {
	
		public static void main(String[] args)
		{
			List<Integer>m=Arrays.asList(1,2,4,76,45,36,55,60);
			System.out.println(m.stream().limit(2).collect(Collectors.toList()));
			IntSummaryStatistics s=m.stream().mapToInt((x)->x).summaryStatistics();
			System.out.println("Highest number:"+s.getMax());
			System.out.println("Minimum number:"+s.getMin());
			System.out.println("Sum number:"+s.getSum());
			System.out.println("Average number:"+s.getAverage());
		}
	
}
