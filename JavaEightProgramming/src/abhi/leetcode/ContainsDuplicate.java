package abhi.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 2, 3, 1 };
		System.out.println(containsDuplicate(nums));
	}

	public static boolean containsDuplicate(int[] nums) {

		List<Integer> intList = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());

		int sizeDistince = intList.stream().distinct().collect(Collectors.toList()).size();
		int sizeAll = intList.stream().collect(Collectors.toList()).size();

		return sizeAll - sizeDistince > 0;
	}

}
