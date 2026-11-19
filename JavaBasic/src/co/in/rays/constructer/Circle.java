
package co.in.rays.constructer;

public class Circle extends Shape {

    private int radius;

    public Circle( int borderWidth , String colour ,int radius) {
        super(borderWidth,colour);
        this.radius = radius;
        System.out.println(radius);
    }
}
