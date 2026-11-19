package co.in.rays.polymorphism;

public class TestShape {
	
	 public static void main(String[] args) {

	        Shape[] s = new Shape[2];

	        s[0] = new Circle();
	        s[1] = new Triangle();

	        s[0].area();
	        s[1].area();
	    }

}
