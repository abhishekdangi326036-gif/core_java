package Array;

import java.util.Arrays;

public class AscendingOrder {
	
	 public static void main(String[] args) {
	        int[] arr = {50, 20, 40, 10, 30};

	        Arrays.sort(arr);

	        System.out.println("Array in ascending order:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }

}
