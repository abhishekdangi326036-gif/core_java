package co.in.rays.op;

public class TestAutomobile {

    public static void main(String[] args) {

        Automobile am = new Automobile();

        am.setColor("Black");
        am.setSpeed(360);
        am.setMake("Scorpio");

        System.out.println(am.getColor());
        System.out.println(am.getSpeed());
        System.out.println(am.getMake());
        System.out.println(am.getNO_OF_GEARS());
    }
}
