package abhi.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		System.out.println(wordPattern("abba","dog dog dog dog"));
	}

	public static boolean wordPattern(String pattern, String s) {

		char[] chr = pattern.toCharArray();
		String[] strArr = s.split(" ");
		System.out.println(strArr.length);
		Map<Character, String> map = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (!(map.containsKey(chr[i]) &&  map.containsValue(strArr[i]))) {
				map.put(chr[i], strArr[i]);
			} else {
				if (!map.get(chr[i]).equalsIgnoreCase(strArr[i])) {
					return false;
				}
			}
		}

		return true;
	}

}
