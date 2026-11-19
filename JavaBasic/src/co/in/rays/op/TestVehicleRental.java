package co.in.rays.op;

public class TestVehicleRental {
	
	public static void main (String [] args) {
		
		VehicleRental vr = new VehicleRental();
			
			vr.setRentalId(123);
			vr.setVehicleName("Hero");
			vr.setVehicleNumber("1234");
			vr.setRentPerDay(Double.parseDouble("30"));
			vr.setRentleDays(500);
			
			 System.out.println(vr. getRentalId());
		        System.out.println(vr.getVehicleName());
		        System.out.println(vr.getVehicleNumber());
		        System.out.println(vr.getRentleDays());
		        System.out.println(vr.getRentPerDay());
		}

}
