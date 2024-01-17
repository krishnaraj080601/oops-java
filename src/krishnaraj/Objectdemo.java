package krishnaraj;

public class Objectdemo {
 int num ;
 float gpa;
	public Objectdemo(int num,float gpa) {
		// TODO Auto-generated constructor stub
		 this.num = num;
	        this.gpa = gpa;
	}
	 public int hashCode() {
	        return super.hashCode();
	    }
	  @Override
	    public boolean equals(Object obj) {
	        return this.num == ((Objectdemo)obj).num;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Objectdemo d1=new Objectdemo(32,56.2f);
    Objectdemo obj2 = new Objectdemo(32, 78.9f);
    
 

    if (d1 == obj2) {
        System.out.println("obj1 is equal to obj2");
    }

    
    System.out.println(d1.hashCode());
	}

}
