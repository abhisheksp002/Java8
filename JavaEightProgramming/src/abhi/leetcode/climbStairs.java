package abhi.leetcode;

public class climbStairs {

	/**
	 * Problem https://leetcode.com/problems/climbing-stairs/
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		System.out.println(climbStairs(3));

	}

	public static int climbStairs(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;

		int[] stepsToTake = new int[n + 1];
		stepsToTake[0] = 0;
		stepsToTake[1] = 1;
		stepsToTake[2] = 2;
		for (int i = 3; i < stepsToTake.length; i++) {
			stepsToTake[i] = stepsToTake[i - 1] + stepsToTake[i - 2];
		}
		return stepsToTake[n];
	}
}
