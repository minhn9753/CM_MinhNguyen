package HomeWork;

import java.util.HashMap;
import java.util.Map;

public class NumberOddTimes {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 7, 8};
		findOddTimeAppearNum(arr);
		
	}
	public static void findOddTimeAppearNum(int[] arr) {
		Map<Integer, Integer> numberCount = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(numberCount.containsKey(arr[i])) {
				numberCount.put(arr[i], numberCount.get(arr[i]) + 1);
			} else {
				numberCount.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> number : numberCount.entrySet()) {
			if(number.getValue() % 2 != 0) {
				System.out.println(number.getKey());
				break;
			}
		}
	}
}
//TIME COMPLEXITY: O(n)
