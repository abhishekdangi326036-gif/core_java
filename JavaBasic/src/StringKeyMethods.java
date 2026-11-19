
public class StringKeyMethods {
	
	public static void main (String [] args) {
		
		String n = "Vijay Aloknath Chauhan";
		
		System.out.println("String Length:" + n.length());
		System.out.println("7th character of String:" + n.charAt(6));
		System.out.println("Index Of Alok:" + n.indexOf("Alok"));
		System.out.println("1# pos of i:" + n.indexOf("i"));
		System.out.println("Last pos of i:" + n.lastIndexOf("i"));
		System.out.println("a is replaced by b:" + n.replace("a","b"));
		System.out.println("Lower Name:" + n.toLowerCase());
		System.out.println("Upper Name:" + n.toUpperCase());
		System.out.println("Starts With Vijay:" + n.startsWith("Vijay"));
		System.out.println("Dad's name:" + n.substring(6));
		
		
	}

}
