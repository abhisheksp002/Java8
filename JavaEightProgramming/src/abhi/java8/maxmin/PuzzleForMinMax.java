package abhi.java8.maxmin;

import java.util.Arrays;
import java.util.List;

public class PuzzleForMinMax {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9);

		Integer result1 = myList.stream().max((i1,i2) -> i2.compareTo(i1)).get();
		Integer result2 = myList.stream().min((i1,i2) -> i2.compareTo(i1)).get();

		
		System.out.println("Value is = "+result1);
		System.out.println("Value is = "+result2);

	}

}
