package oops;

public class subclass extends A {
	public subclass(int num ,String name) {
		super(num,name);
		
	}
	   public static void main(String[] args) {
	        subclass obj = new subclass(45, "Kunal Kushwaha");
	        int n = obj.num;
   System.out.println(n);
	        System.out.println(obj instanceof Object);
	    }

}
