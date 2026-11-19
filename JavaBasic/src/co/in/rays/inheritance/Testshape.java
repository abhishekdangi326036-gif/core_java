package co.in.rays.inheritance;

public class Testshape {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();

		r.setLength(10);
		r.setWidth(20);
		r.setBoderWidth(45);
		r.setColor("red");

		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.getBoderWidth());
		System.out.println(r.getColor());
		System.out.println("=======================================================================");

		
		Circle c = new Circle();

		
		c.setRadius(20);
		c.setBoderWidth(45);
		c.setColor("black");

		
		System.out.println(c.getRadius());
		System.out.println(c.getBoderWidth());
		System.out.println(c.getColor());
		System.out.println(c.area());
		System.out.println("===============================================================================");
		
		
		Triangle t = new Triangle();

		t.setBase(10);
		t.setHight(20);
		t.setBoderWidth(45);
		t.setColor("red");

		System.out.println(t.getBase());
		System.out.println(t.getHight());
		System.out.println(t.getBoderWidth());
		System.out.println(t.getColor());
		
		

		
		
	}

}
