package co.in.rays.java.stream.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStringStream {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Aman");
		list.add("kamlesh");
		list.add("suresh");
		list.add("karan");
		list.add("mahesh");
		list.add("satesh");
		list.add("satesh");
		list.add("yash");
		list.add("manish");

		list.forEach(System.out::println);

		System.out.println("------------------------");

		list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

		System.out.println("------------------------");

		list.stream().map(s -> s.toLowerCase()).forEach(System.out::println);

		System.out.println("------------------------");

		list.stream().distinct().forEach(System.out::println);
		
		System.out.println("------------------------");
		
		list.stream().map(s -> s.toLowerCase()).filter(s -> s.endsWith("esh")).forEach(System.out::println);
		
		System.out.println("------------------------");
		
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("------------------------");
		
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		

	}

}
