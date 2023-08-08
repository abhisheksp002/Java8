package abhi.java8.threads.CompletableFuture;

import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class SupplyAsync {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		/**
		 * supplyAsync returns the data. What ever we are passing in completable future
		 * must not come from some other method. Should be static or class level
		 * Implements Future and CompletionStage
		 */

		System.out.println(new Date());
		CompletableFuture<String> data = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Data from supply Async!!";
		});
		System.out.println(data.get());//Waits if necessary for this future to complete, and then returns its result.
		System.out.println(new Date());
		System.out.println("Main thread.");
	}

}
