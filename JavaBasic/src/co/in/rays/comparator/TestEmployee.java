
package co.in.rays.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {

    public static void main(String[] args) {

        Employee e1 = new Employee(3, "Amit", 50000, "TCS");
        Employee e2 = new Employee(1, "Rahul", 60000, "Wipro");
        Employee e3 = new Employee(2, "Vijay", 70000, "Infosys");

        List<Employee> list = new ArrayList<Employee>();

        list.add(e1);
        list.add(e2);
        list.add(e3);

        Comparator<Employee> c = new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.id - o2.id;
            }
        };

        Collections.sort(list, c);

        Iterator<Employee> it = list.iterator();

        while (it.hasNext()) {
            Employee e = it.next();
            System.out.println(e);
        }
    }
}


