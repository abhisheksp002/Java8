package abhi.leetcode;

import java.util.Arrays;
import java.util.List;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(10));
	}

	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		int rev = 0;
		int digit = x;
		while (digit > 0) {
			int rem = digit % 10;
			rev = rev * 10 + rem;
			digit = digit / 10;
		}
		return rev == x;
	}

}
