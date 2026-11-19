package co.in.rays.java.stream.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSalaryStream {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(1000);
		list.add(2000);
		list.add(3000);
		list.add(4000);
		list.add(5000);
		list.add(5000);
		list.add(10000);
		list.add(100);
		list.add(10);

		list.forEach(System.out::println);

		System.out.println("------------------------");

		list.stream().sorted().forEach(System.out::println);

		System.out.println("------------------------");

		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		System.out.println("------------------------");

		list.stream().distinct().forEach(System.out::println);
		
		System.out.println("------------------------");

		

	}

}
