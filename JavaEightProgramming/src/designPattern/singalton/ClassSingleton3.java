package designPattern.singalton;

public class ClassSingleton3 {

	public static final ClassSingleton3 INSTANCE = new ClassSingleton3();
	
	private ClassSingleton3() {
		if(INSTANCE == null) {
			throw new RuntimeException(); // protection against reflection
		}
	}
}
