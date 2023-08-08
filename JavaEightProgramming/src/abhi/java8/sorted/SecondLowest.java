package abhi.java8.sorted;

import java.util.Arrays;
import java.util.List;

public class SecondLowest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(-1,3,10,20,30,-15,1,13,34,21,34,65);
		
		int secondLowest = list.stream().sorted().skip(1).distinct().findFirst().get();
		
		System.out.println("Second lowest in the given array list is = "+secondLowest);

	}

}
