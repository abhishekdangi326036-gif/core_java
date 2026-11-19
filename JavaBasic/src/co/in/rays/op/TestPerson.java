package co.in.rays.op;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	
	public static void main (String [] args ) throws ParseException {
		
		Person ps = new Person();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		ps.setName("Abhi");
		ps.setaddress("Jaipur");
		ps.setDob(sdf.parse("2002-10-10"));
		
		
		
		System.out.println(ps.getName());
		System.out.println(ps.getAddress());
		System.out.println(sdf.format(ps.getDob()));
		System.out.println(ps.getAGE());
		
	}

}
