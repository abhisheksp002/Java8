package abhi.java8.stream.groupBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByAgeAndCountTheOccurance {

	public static void main(String[] args) {

		List<Employee> empList = GroupByDemo.getEmpList();

		Map<Integer, Long> mapList = empList.stream()
				.collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()));
		
		mapList.entrySet().stream().forEach(e ->{
			System.out.println(e.getValue());
		});

	}

}
