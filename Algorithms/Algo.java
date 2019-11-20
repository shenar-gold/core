package Algorithms;

import java.util.Arrays;

public class Algo {
	
//	Given unsorted array of int and value X
//	Find a pair of elements in that array having sum less than or equal to X
	static int[] method(int[] arr) {
			
		int sum =0;
		int valueX = 8;
		int[] result = {}; 
		
		for(int i=0;i < arr.length;i++) {
			for(int k=0; k < arr.length; k++) {
				 
				sum = arr[i] + arr[k];
				
				if (sum <= valueX) {
					
					result = new int[] {arr[i], arr[k]}; 
				}			
			}
		
			
		}
		return result;
	  }	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8}; 
        System.out.print(Arrays.toString(method(arr))); 
        
        
        
		
	}

}
