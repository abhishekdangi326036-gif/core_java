
package co.in.rays.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class TestProduct {

    public static void main(String[] args) {

        Product p1 = new Product(500, "Electronics", "Mouse");
        Product p2 = new Product(1000, "Electronics", "Keyboard");
        Product p3 = new Product(300, "Stationery", "Notebook");

        List<Product> list = new ArrayList<Product>();

        list.add(p1);
        list.add(p2);
        list.add(p3);

        Comparator<Product> c = new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {

                return o1.price - o2.price;
            }
        };

        Collections.sort(list, c);

        Iterator<Product> it = list.iterator();

        while (it.hasNext()) {

            Product p = it.next();
            System.out.println(p);
        }
    }
}

