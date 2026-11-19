package co.in.rays.overriding;

public class Shape {
	
	private String colour;
	private int boadwidth;

	public void setboadwidth(int boadwidth) {
	    this.boadwidth = boadwidth;
	}

	public int getboadwidth() {
	    return boadwidth;
	}

	public void setcolour(String colour) {
	    this.colour = colour;
	}

	public String getcolour() {
	    return colour;
	}

	public void area() {
	    System.out.println("its the area");
	}


}
