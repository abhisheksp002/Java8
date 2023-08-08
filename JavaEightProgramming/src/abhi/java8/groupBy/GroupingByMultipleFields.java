package abhi.java8.groupBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import abhi.java8.groupBy.dto.Stock;

public class GroupingByMultipleFields {

	public static void main(String[] args) {

		List<Stock> stocks = new ArrayList<>();

		stocks.add(new Stock("JP Morgan", 10, 100));
		stocks.add(new Stock("ICICI", 20, 100));
		stocks.add(new Stock("HDFC", 30, 300));
		stocks.add(new Stock("ICICI", 20, 200));
		stocks.add(new Stock("JP Morgan", 10, 100));
		stocks.add(new Stock("JP Morgan", 10, 100));

		Map<String, Map<Integer, Long>> noOfStocksByName = stocks.stream().collect(
				Collectors.groupingBy(Stock::getName,
				Collectors.groupingBy(Stock::getQuantity, Collectors.counting())));

		System.out.println("Group by on multiple properties" + noOfStocksByName);
	}
}