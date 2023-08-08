package abhi.java8.stream.maxmin;

import java.util.Arrays;
import java.util.List;

public class MaxElementInArray {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		int max = myList.stream().max(Integer::compare).get().intValue();
		
		System.out.println("Max element in array is= "+max);
	}

}
