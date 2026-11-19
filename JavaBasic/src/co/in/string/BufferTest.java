package co.in.string;

public class BufferTest {
	
public static void main(String [] args) {
		
		java.lang.StringBuffer sb = new StringBuffer("Vijay");
		sb.append(" Dinanath chauhan");
		
		System.out.println("Length: " + sb.length());
		System.out.println("Capacity:" + sb.capacity());
		System.out.println("CharAt:" + sb.charAt(1));
		System.out.println("IndexOf:" + sb.indexOf("Dinanath"));
		System.out.println("replace:" + sb.replace(0, 5, "Jay "));
		System.out.println("Reverse:" + sb.reverse());
		
		
		
	}

}
