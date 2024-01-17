package krishnaraj;

import oops.A;

public class submethod extends A {
int weight;
	public submethod(int num, String name,int weight) {
		// TODO Auto-generated constructor stub
		super(num,name);
		this.weight= weight;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		submethod x=new submethod(32,"swetha",56);
		int y=x.num;
		System.out.println(y);

	}

}
