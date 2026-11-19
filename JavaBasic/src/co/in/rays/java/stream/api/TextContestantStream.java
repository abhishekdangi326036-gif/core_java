package co.in.rays.java.stream.api;

import java.util.ArrayList;

public class TextContestantStream {
	
	

	public String phone = null;
	public String name = null;

	public TextContestantStream(String n, String p) {

		name = n;
		phone = p;

	}

	ArrayList<TextContestantStream> list = new ArrayList<TextContestantStream>();
	
	list.add(new Contestant("Ram", "9999999999"));
	list.add(new Contestant("Kumar", "9199999999"));
	list.add(new Contestant("karan", "9299999999"));
	list.add(new Contestant("Shyam", "9399999999"));
	list.add(new Contestant("Ram", "9994999999"));
	list.add(new Contestant("Suman", "9399999999"));
	list.add(new Contestant("Panjak", "6999999999"));
	
	list.Stream().map(e -> e.phone);

}}

