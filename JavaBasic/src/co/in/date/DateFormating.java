package co.in.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormating {
	
	public static void main (String [] args) {
		
		Date d = new Date();
		
		System.out.println("before format :" + d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("H:mm:ss");
		
		String formateDate = sdf.format(d);
		
		System.out.println("after format :" + formateDate);
		
		
	}

}
