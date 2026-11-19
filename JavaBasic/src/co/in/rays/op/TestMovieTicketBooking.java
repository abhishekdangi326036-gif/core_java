package co.in.rays.op;

public class TestMovieTicketBooking {
	
public static void main (String [] args) {
		
	MovieTicketBooking mtb = new MovieTicketBooking();
		
		mtb.setTicketId(123);
		mtb.setMovieName("Hero");
		mtb.setTheatreName("Kamal");
		mtb.setSeatNumber("60");
		mtb.setTicketPrice(Double.parseDouble("500"));
		
		 System.out.println(mtb. getTicketId());
	        System.out.println(mtb.getMovieName());
	        System.out.println(mtb.getTheatreName());
	        System.out.println(mtb.getSeatNumber());
	        System.out.println(mtb.getTicketPrice());
	}

}
