package abhi.java8.stream.sorted;

import java.util.Comparator;
import java.util.List;

import abhi.java8.stream.groupBy.Employee;
import abhi.java8.stream.groupBy.GroupByDemo;

public class CustomComparator {

	public static void main(String[] args) {
		List<Employee> empList = GroupByDemo.getEmpList();

		/**
		 * Below code will sort the emp list by city and if city name is same , then it
		 * will sort the emp list by age
		 */
		empList.stream().sorted(Comparator.comparing(Employee::getCity).thenComparing(Employee::getAge))
				.forEach(System.out::println);

	}

}
