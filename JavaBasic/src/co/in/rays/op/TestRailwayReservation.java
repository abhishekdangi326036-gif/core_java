package co.in.rays.op;

public class TestRailwayReservation {
	
public static void main (String [] args) {
		
	RailwayReservation rr = new RailwayReservation();
		
		rr.setReservationId(123);
		rr.setPassengerName("Naman");
		rr.setTrainNumber(12345);
		rr.setSeatNumber("10");
		rr.setTicketPrice(Double.parseDouble("100"));
		
		
		 System.out.println(rr. getReservationId());
	        System.out.println(rr.getPassengerName());
	        System.out.println(rr.getTrainNumber());
	        System.out.println(rr.getSeatNumber());
	        System.out.println(rr.getTicketPrice());
		
	}

}
