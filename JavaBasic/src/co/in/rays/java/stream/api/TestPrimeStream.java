package co.in.rays.java.stream.api;

import java.util.ArrayList;
import java.util.List;

public class TestPrimeStream {
	
	public static void main (String [] agrs ) {
		
		List<Integer>list = new ArrayList<Integer>();
		
for(int i=1; i <= 20; i++) {
			
			list.add(i);
		}
		list.forEach(System.out::println);
		
		
		System.out.println("--------------------------");
		
		list.stream().filter(i -> i > 1 &&java.util.stream.IntStream.range(2, i).noneMatch(j -> i % j == 0)).forEach(System.out::println);
		
	}

}
