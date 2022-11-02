package HomeWork;

import java.util.Arrays;

public class Sort {
	
	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 0, 0, 1, 2, 2, 1 };
		intArraySorting(array);
		for (int arr : array) {
			System.out.println(arr);
		}
	}
	
	public static int[] intArraySorting(int[] array) {

		int zeroCount = 0;
		int oneCount = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0)
				zeroCount++;

			if (array[i] == 1)
				oneCount++;
		}
		
		for (int i = 0; i < array.length; i++) {
			if(i < zeroCount) {
				array[i] = 0;
			} else if (i < (zeroCount +oneCount)) {
				array[i] = 1;
			} else if(i < array.length) {
				array[i] = 2;
			}
		}

//		for (int i = 0; i < zeroCount; i++) {
//			array[i] = 0;
//		} 
//		for (int i = zeroCount; i < (zeroCount + oneCount); i++) {
//			array[i] = 1;
//		}
//		for (int i = (zeroCount + oneCount); i < array.length; i++) {
//			array[i] = 2;
//		}
		return array;
	}
}
//TIME COMPLEXITY O(n)