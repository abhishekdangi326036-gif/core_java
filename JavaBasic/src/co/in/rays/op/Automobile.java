package co.in.rays.op;

public class Automobile {

	private String color;
	private Integer speed;
	private String make;
	
	public static final int NO_OF_GEARS = 6;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getMake() {
		return make;
	}
	
	public Integer getNO_OF_GEARS() {
		return NO_OF_GEARS;
	}

}
