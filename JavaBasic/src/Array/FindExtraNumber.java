package Array;

public class FindExtraNumber {
	
	public static void main (String [] args) {
		
		int[] a = {12, 43, 54, 23, 67, 14 };
		int[] a1 = {12, 43, 54, 23, 67, 14, 2 };
		// For each element in a1 check if it exists in a.
		// If an element in a1 is not found in a, it is an extra number.
		for (int i = 0; i < a1.length; i++) {
			boolean isFound = false;
			for (int j = 0; j < a.length; j++) {
				if (a1[i] == a[j]) {
					isFound = true;
					break;
				}
			}
			if (!isFound) {
				System.out.println("Extra number is = " + a1[i]);
			}
		}
}
}