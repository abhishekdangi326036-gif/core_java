
public class CountOneChar {
	
	public static void main (String [] args) {
		
		String a = "abhishek";
		
		int count = 0;
		char target = 'k';
		
		for(int i =0; i < a.length(); i++) {
			
			if (a.charAt(i)==target)
			{
				count ++;
			}
			
		}
		System.out.println(count);
	}

}
