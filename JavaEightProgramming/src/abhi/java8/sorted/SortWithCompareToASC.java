package abhi.java8.sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortWithCompareToASC {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(20, 15, 34, 32, 35, 67, 21, 64);
		
		Stream<Integer> result = myList.stream().sorted((s1,s2) -> s1.compareTo(s2));
		
		result.forEach(System.out::println);

	}

}
