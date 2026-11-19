
package co.in.rays.comparable;

public class Marksheet implements Comparable<Marksheet> {

    private int rollNo;
    private String name;
    private int phy;
    private int che;
    private int maths;

    public Marksheet(int rollNo, String name, int phy, int che, int maths) {
        this.rollNo = rollNo;
        this.name = name;
        this.phy = phy;
        this.che = che;
        this.maths = maths;
    }

    @Override
    public int compareTo(Marksheet o) {
        return this.rollNo - o.rollNo;
    }

    @Override
    public String toString() {
        return 
                "RollNo: " + rollNo +", Name: " + name + ", phy: " + phy +", che: " + che +", maths: " + maths ;
    }
}

