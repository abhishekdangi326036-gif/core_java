package co.in.rays.op;

public class VehicleRental {
	
	Integer rentalId;
	String vehicleName;
	String vehicleNumber;
	double rentPerDay;
	Integer rentleDays;
	
	public void setRentalId(Integer rentalId) {
		this.rentalId = rentalId;
	}

	public Integer getRentalId() {
		return rentalId;
	}
	
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleName() {
		return vehicleName;
	}
	
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}

	public double getRentPerDay() {
		return rentPerDay;
	}
	
	public void setRentleDays(Integer rentleDays) {
		this.rentleDays = rentleDays;
	}

	public Integer getRentleDays() {
		return rentleDays;
	}

}
