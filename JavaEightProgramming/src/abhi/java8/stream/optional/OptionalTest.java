package abhi.java8.stream.optional;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		String[] a = new String[10];
				
	   String result=  Optional.ofNullable(a[1]).orElseGet(()->"String value is not present");
	   System.out.println("Result form oprional is = "+result);
		
		

	}
}
