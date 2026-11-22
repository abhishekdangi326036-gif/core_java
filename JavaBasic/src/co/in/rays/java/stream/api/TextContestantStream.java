package co.in.rays.java.stream.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TextContestantStream {

	public static void main(String[] args) {

		ArrayList<Contestant> list = new ArrayList<Contestant>();

		list.add(new Contestant("Ram", "9999999999"));
		list.add(new Contestant("Kumar", "9199999999"));
		list.add(new Contestant("karan", "9299999999"));
		list.add(new Contestant("Shyam", "9399999999"));
		list.add(new Contestant("Ram", "9994999999"));
		list.add(new Contestant("Suman", "9399999999"));
		list.add(new Contestant("Panjak", "6999999999"));

		list.stream().map(e -> e.phone);

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10);

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct();

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				}));

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3);

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> System.out.println(e));

	}
}
