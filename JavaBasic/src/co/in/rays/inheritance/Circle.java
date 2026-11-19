package co.in.rays.inheritance;

public class Circle extends Shape {

	private int radius;
	
	

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	
	public double area () {
		return 3.14* radius * radius;
	}
	
	

	
}
