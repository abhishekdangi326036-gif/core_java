package co.in.rays.polymorphismarrays;

public class TestShape {

    public static void main(String[] args) {

        Shape[] s = new Shape[2];

        s[0] = new Circle(5);
        s[1] = new Triangle(10, 6);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].area());
        }
    }
}