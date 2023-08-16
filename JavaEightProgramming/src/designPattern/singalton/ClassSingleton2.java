package designPattern.singalton;

public final class ClassSingleton2 {

	
	/**
	 * In this approach instance field needs to be volatile
	 * to prevent cache
	 * 
	 * Java memory model allows the publication of partially initialized objects and this may lead in turn to subtle bugs.
	 */
	private static volatile ClassSingleton2 INSTANCE;

	private String info = "Initial info class";

	private ClassSingleton2() {
	}

	public static ClassSingleton2 getInstance() {
		if (INSTANCE == null) {
			synchronized (ClassSingleton2.class) {
				if (INSTANCE == null) {
					INSTANCE = new ClassSingleton2();
				}
			}
		}

		return INSTANCE;
	}

}