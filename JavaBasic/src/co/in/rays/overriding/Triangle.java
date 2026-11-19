package co.in.rays.overriding;

public class Triangle extends Shape {

	private int height;
	private int base;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(0.5 * base * height);
	}
}
