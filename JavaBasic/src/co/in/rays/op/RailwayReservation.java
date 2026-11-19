package co.in.rays.op;

public class RailwayReservation {
	
	Integer reservationId;
	String passengerName;
	Integer trainNumber;
	String seatNumber;
	double ticketPrice;
	
	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}

	public Integer getReservationId() {
		return reservationId;

	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerName() {
		return passengerName;
	}
	

	public void setTrainNumber(Integer trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Integer getTrainNumber() {
		return trainNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getSeatNumber() {
		return seatNumber;
	}


	
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}


}
