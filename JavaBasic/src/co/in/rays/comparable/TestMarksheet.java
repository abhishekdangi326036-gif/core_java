
package co.in.rays.comparable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet {

    public static void main(String[] args) {
    	
    	
    	Marksheet m1 = new Marksheet(3, "Amit", 70, 80, 90);
    	Marksheet m2 = new Marksheet(1, "Rahul", 60, 75, 85);
    	Marksheet m3 = new Marksheet(2, "Vijay", 80, 85, 90);

        List<Marksheet> list = new ArrayList<Marksheet>();

        list.add(new Marksheet(3, "Amit", 70, 80, 90));
        list.add(new Marksheet(1, "Rahul", 60, 75, 85));
        list.add(new Marksheet(2, "Vijay", 80, 85, 90));

       

       // for (Marksheet m : list) {
         //   System.out.println(m);
        
       // list.forEach(System.out::println);
        
        
        Iterator<Marksheet> it = list.iterator();
        while(it.hasNext()) {
			Marksheet m = it.next();
			System.out.println(m);
            
            
        }
    }
}
