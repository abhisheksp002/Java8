package designPattern.factory;

public class FactoryPatternMainClass {

	public static void main(String[] args) {

		ProfesstionFactory factory = new ProfesstionFactory();
		Profession doc = factory.getProfession("doctor");
		doc.print();
	}

}
