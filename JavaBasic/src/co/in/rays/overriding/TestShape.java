package co.in.rays.overriding;

public class TestShape extends Shape {

	public static void main(String[] args) {
		
		Shape s;
		
		s = new Circle();
		((Circle) s).setRadius(5);
		s.area();
		
		s = new Triangle();
		((Triangle) s).setBase(10);
		((Triangle) s).setHeight(5);
		s.area();
		
	}

}
