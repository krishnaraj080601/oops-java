package abstractdemo;

public class son extends Parent{

	public son(int age) {
		// TODO Auto-generated constructor stub
		super(age);
	}
	void normal() {
		super.normal();
	}
	void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Pepper Potts");
    }

}
