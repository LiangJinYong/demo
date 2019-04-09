package demo;

public class ConstructorDemo {

	private int age;
	private String name;
	
	public ConstructorDemo() {
		this(0, "Tom");
		System.out.println("ConstructorDemo.ConstructorDemo()");
	}
	
	public ConstructorDemo(int age) {
		this.age = age;
	}
	
	public ConstructorDemo(String name) {
		this.name = name;
	}
	
	public ConstructorDemo(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
