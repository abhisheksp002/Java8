package abhi.java8.stream.maxmin;

import java.util.Arrays;
import java.util.List;

public class MaxWithCompareTo {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9);

		Integer max = myList.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		
		System.out.println("Maximum integer value is = "+max);
	}

}
