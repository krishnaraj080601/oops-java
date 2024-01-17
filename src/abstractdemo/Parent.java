package abstractdemo;

public abstract class Parent {
	int age;
	public static final int value=32456789;;
	public Parent(int age) {
		// TODO Auto-generated constructor stub
		this.age=age;
		  
		}
	void hello() {
		System.out.println("hello");
	}
	void normal() {
		System.out.println("this is normal program");
	}

    abstract void career();
    abstract void partner();

	

}
