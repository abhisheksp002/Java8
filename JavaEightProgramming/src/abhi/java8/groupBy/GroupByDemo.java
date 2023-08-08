package abhi.java8.groupBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {

	public static void main(String[] args) {

		List<Employee> empList = getEmpList();

		Map<Integer, List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(Employee::getAge));
		System.out.println("Employees grouped by age in Java 8: " + empMap);

	}

	public static List<Employee> getEmpList() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Dipak", "Delhi", 21));
		empList.add(new Employee("Sumit", "Delhi", 21));
		empList.add(new Employee("Karan", "Delhi", 23));
		empList.add(new Employee("Mona", "Udaipur", 23));
		empList.add(new Employee("Rajesh", "Banglore", 23));
		empList.add(new Employee("Niraj", "Banglore", 52));
		return empList;
	}

}
