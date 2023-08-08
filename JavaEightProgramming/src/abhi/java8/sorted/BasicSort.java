package abhi.java8.sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicSort {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(20, 15, 34, 32, 35, 67, 21, 64);

		List<Integer> resList = myList.stream().sorted().collect(Collectors.toList());
		System.out.println(resList);
	}

}
