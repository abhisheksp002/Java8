package abhi.java8.counting;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringFrequency {

	public static void main(String[] args) {
		String[] strArr = { "java", "java", "java", "java", "python", "python", "python", "ruby", "ruby", "C++" };

		List<String> myList = Arrays.stream(strArr).collect(Collectors.toList());

		Map<String, Long> frequencyMap = myList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("String frequency map = " + frequencyMap);

	}

}
