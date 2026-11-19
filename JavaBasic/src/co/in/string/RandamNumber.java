package co.in.string;

public class RandamNumber {
	
	public static void main(String [] args) {
		
		
		
		for(int i = 0; i < 10; i++) {
			
			int randomNum = (int)Math.floor(Math.random() * 100);
			System.out.println(randomNum);
		}
	}
}


