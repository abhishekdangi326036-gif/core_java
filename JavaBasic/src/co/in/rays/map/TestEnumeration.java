package co.in.rays.map;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;


public class TestEnumeration {

	public static void main(String[] args) {
		Vector v = new Vector();

		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");
		v.add("F");
		v.add("G");
		v.add("H");

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			if (e.nextElement().equals("D")) {
				System.out.println("yes");

			}
		}			System.out.println(v);

	}
	
}
