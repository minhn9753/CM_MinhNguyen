package HomeWork;

public class LongestPrefix {
	public static void main(String[] args) {
		String[] strs1 = {"flower", "flow", "flight"};
		String[] strs2 = {"dog", "racecar", "car"};
		
		System.out.println(longestPrefix(strs1));
		System.out.println(longestPrefix(strs2));
	}
	
	public static String longestPrefix(String[] strs) {
		if(strs.length == 0) return "";
		String prefix = strs[0];
		for ( int i = 1; i < strs.length; i++) {
			while(strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		
		return prefix;
	}
}
//TIME COMPLEXITY O(n)