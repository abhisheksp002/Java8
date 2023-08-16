package designPattern.singalton;

public class ClassSingleton1 {

	private static ClassSingleton1 INSTANCE;
	private String info = "Initial info class";

	private ClassSingleton1() {
	}

	/**
	 * Synchronization might significantly affect the performance. Each time we want
	 * to get the instance of our singleton, we need to acquire a potentially
	 * unnecessary lock.
	 * 
	 * To fix that, we could instead start by verifying if we need to create the
	 * object in the first place and only in that case we would acquire the lock.
	 */
	public synchronized static ClassSingleton1 getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ClassSingleton1();
		}

		return INSTANCE;
	}

}