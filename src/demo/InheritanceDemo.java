package demo;

public class InheritanceDemo {

	public static void main(String[] args) {
		Parent.method();
		Child.method();
		Parent parent = new Child();
		parent.func();
		
		Inter a = new A();
		Inter b = new B();
		int ago = a.go();
		int bgo = b.go();
		
		System.out.printf("%d...%d", ago, bgo);
	}
}

class Parent {
	public static void method() {
		System.out.println("Parent.method()");
	}
	
	public void func() {
		System.out.println("Parent.func()");
	}
}

class Child extends Parent {
	public static void method() {
		System.out.println("Child.method()");
	}
	
	@Override
	public void func() {
		System.out.println("Child.func()");
	}
}

interface Inter {
	void method();
	
	default void func() {
		System.out.println("Inter.func()");
	}
	
	default int go() {
		System.out.println("Inter.go()");
		
		return 1;
	}
}

class A implements Inter {

	@Override
	public void method() {
		
	}
	
}

class B implements Inter {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int go() {
		return 2;
	}
}
