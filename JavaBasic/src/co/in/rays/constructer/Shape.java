package co.in.rays.constructer;

public class Shape {
	private int borderWidth;
	private String colour;
	
	public Shape() {
		System.out.println("Its a defoult constructer");
	}
	
	public Shape(int borderWidth) {
		this();
		this.borderWidth = borderWidth;
		System.out.println(borderWidth);
		
	}
	
	public Shape(int boderWidth , String colour) {
		this(boderWidth);
		this.colour = colour;
		System.out.println(colour);
	}
}
