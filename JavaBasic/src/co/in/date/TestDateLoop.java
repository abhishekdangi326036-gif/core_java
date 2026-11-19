package co.in.date;

import java.util.Date;

public class TestDateLoop {
	
	public static void main (String [] args) throws InterruptedException {
		
		while (true) {
			Thread.sleep(1000);
			Date d = new Date();
			System.out.println(d);
		}
	}

}
