package co.in.rays.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Testiteretor {
	
	public static void main(String[] args) {
		List li = new ArrayList();
		
		li.add("A");
		li.add("B");
		li.add("C");
		li.add("D");
		li.add("E");
		li.add("F");
		li.add("G");
		li.add("H");
		
		
		Iterator it = li.iterator();
		while(it.hasNext()) {
		if(it.next().equals("D")) {
			it.remove();
		}
			
			
		}
		System.out.println(li);
		
	}

}
