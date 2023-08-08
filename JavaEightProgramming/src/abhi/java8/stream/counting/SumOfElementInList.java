package abhi.java8.stream.counting;

import java.util.Arrays;
import java.util.List;

/**
 * Find the sum of elements in the list.
 * @author abhishek.kumar2
 *
 */
public class SumOfElementInList {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int count = myList.stream().reduce((a,b) -> a+b).get();
		
		System.out.println("Sum of element in list = "+count);
	}

}
