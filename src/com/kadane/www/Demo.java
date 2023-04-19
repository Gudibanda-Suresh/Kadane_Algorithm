package com.kadane.www;


public class Demo {
	public static void main(String[] args) {
		int[] arr= {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(kadane(arr));
	}

	static int kadane(int[] arr) {
		int max = 0;
		int curr = 0;

		for (int i = 0; i < arr.length; i++) {
		    curr += arr[i];
		    if (curr < 0) {
		        curr = 0;
		    }
		    if (max < curr) {
		       max = curr;
		    }
		}
		return max;
		
	}
}
