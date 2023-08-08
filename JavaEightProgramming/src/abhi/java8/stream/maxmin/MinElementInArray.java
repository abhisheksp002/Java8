package abhi.java8.stream.maxmin;

import java.util.Arrays;
import java.util.List;

public class MinElementInArray {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		int min = myList.stream().min(Integer::compare).get().intValue();

		System.out.println("Min element in array is= " + min);
	}

}
