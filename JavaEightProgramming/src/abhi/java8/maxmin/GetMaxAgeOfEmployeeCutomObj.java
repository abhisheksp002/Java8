package abhi.java8.maxmin;

import java.util.Comparator;
import java.util.List;

import abhi.java8.groupBy.Employee;
import abhi.java8.groupBy.GroupByDemo;

public class GetMaxAgeOfEmployeeCutomObj {

	public static void main(String[] args) {
		List<Employee> empList = GroupByDemo.getEmpList();

		int maxAge = empList.stream().max(Comparator.comparing(Employee::getAge)).get().getAge();

		System.out.println("Max age of employee present = " + maxAge);

	}

}
