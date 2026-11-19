package co.in.rays.polymorphismarrays;

public class Triangle extends Shape {

    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}