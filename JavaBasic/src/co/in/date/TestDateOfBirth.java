package co.in.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateOfBirth {
	
	public static void main (String [] args ) throws ParseException {
		
		String dob = "2005-01-28";
		
		System.out.println("dob:" + dob);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d = sdf.parse(dob);
		
		System.out.println("dob in date:" + d);
		
		sdf = new SimpleDateFormat("EEE, MMM d, YYYY");
		
		String s = sdf.format(d);
		
		System.out.println(s);
		
		
	}

}
