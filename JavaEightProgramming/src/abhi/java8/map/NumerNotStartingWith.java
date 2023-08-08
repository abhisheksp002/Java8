package abhi.java8.map;

import java.util.Arrays;
import java.util.List;

public class NumerNotStartingWith {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(12, 21, 32, 122, 21, 14, 15, 137, 11);

		myList.stream().map(s -> String.valueOf(s)).filter(s -> ! s.startsWith("1")).forEach(System.out::println);

	}

}
