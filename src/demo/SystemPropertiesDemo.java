package demo;

public class SystemPropertiesDemo {

	public static void main(String[] args) {
		String timezone = System.getProperty("user.timezone");
		System.out.println("##############>" + timezone);
	}
}
