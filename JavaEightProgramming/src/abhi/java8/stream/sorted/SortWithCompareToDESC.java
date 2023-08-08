package abhi.java8.stream.sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortWithCompareToDESC {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(20, 15, 34, 32, 35, 67, 21, 64);

		Stream<Integer> result = myList.stream().sorted((s1, s2) -> s2.compareTo(s1));

		result.forEach(System.out::println);

	}

}
