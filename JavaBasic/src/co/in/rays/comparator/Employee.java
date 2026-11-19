
package co.in.rays.comparator;

public class Employee {

    public int id;
    public String name;
    public int salary;
    public String company;

    public Employee(int id, String name, int salary, String company) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name
                + ", Salary: " + salary + ", Company: " + company;
    }
}
