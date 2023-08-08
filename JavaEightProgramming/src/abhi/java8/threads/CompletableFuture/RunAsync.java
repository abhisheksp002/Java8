package abhi.java8.threads.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class RunAsync {

	private static int data = 5;
	public static void main(String[] args) throws InterruptedException {
		
		
		/**
		 * What ever we are passing in completable future must not come from some other method.
		 * Should be static or class level
		 * Implements Future and CompletionStage
		 */
		
		System.out.println("In main thread data val is = "+data);
		CompletableFuture.runAsync(() -> {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			data = 10;
		});
		System.out.println("Main thread.");
		Thread.sleep(2000);
		System.out.println("Data changed by completeable future after adding sleep 2000ms is "+data);
	}

}
