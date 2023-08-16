package designPattern.factory;

public class ProfesstionFactory {

	public Profession getProfession(String type) {
		if (type == null)
			return null;

		if (type.equalsIgnoreCase("Doctor"))
			return new Doctor();
		else if (type.equalsIgnoreCase("Teacher"))
			return new Teacher();
		else if (type.equalsIgnoreCase("Engineer"))
			return new Engineer();
		else
			return null;

	}
}
