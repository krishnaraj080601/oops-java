package oops;

public class A {
    public int num;
    String name;
    int[] arr;
    public int getNum() {
       return num;
    }

    public void setNum(int num) {
        this.num = num;
        System.out.println(this.num);
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
   }
}