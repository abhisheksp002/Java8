package abhi.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(fizzBuzz(5));
	}

	public static List<String> fizzBuzz(int n) {

		List<String> result = new ArrayList<>();
//		result.add("1");
//		result.add("2");
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				result.add("FizzBuzz");
			}
			else if(i %3 == 0) {
				result.add("Fizz");
			}
			else if(i %5 == 0) {
				result.add("Buzz");
			}
			else {
				result.add(i+"");
			}
		}

		return result;

	}
}
