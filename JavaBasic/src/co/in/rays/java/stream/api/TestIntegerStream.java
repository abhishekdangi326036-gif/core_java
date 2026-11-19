package co.in.rays.java.stream.api;

import java.util.ArrayList;
import java.util.List;

public class TestIntegerStream {
	
	public static void main (String [] args) {
		
		List<Integer>list = new ArrayList<Integer>();
		
		for(int i=1; i <= 10; i++) {
			
			list.add(i);
		}
		list.forEach(System.out::println);
		
		
		System.out.println("--------------------------");
		
		list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
		
	}

}
