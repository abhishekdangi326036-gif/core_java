package Array;

public class MaxNumber {
	
	public static void main (String [] args) {
				
		int[] a = {12, 43, 54, 23, 67, 14 };
				
				int max = a[0];
				
				for(int i =0; i < a.length; i++) {
					
					if(a[i]>max) {
						
						max = a[i];
					}
				}
				System.out.println("Maximum number = " + max);
				
			}
	}


