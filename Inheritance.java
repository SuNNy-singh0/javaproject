package p2;


 class Parent3 {
public  Parent3(int x) {
	System.out.println("parent constructor");
	System.out.println("the value of x: "+x);
}
public static void m1(int a) {
	System.out.println("static method of parent");
	System.out.println("the value of is"+a);
} 
public void m2(int p) {
	System.out.println("instance method of parent");
	System.out.println("the value of is"+p);
}
}
class Child3 extends Parent3 {
public Child3(int x) {
	super(x);
}
public static void m1(int a) {
	System.out.println("static method of child");
	System.out.println("the value of is"+a);
}
public void m2(int p) {
	System.out.println("instance method of child");
	System.out.println("the value of is"+p);
}
}
public class Inheritance {

	public static void main(String[] args) {
		Child3 ch = new Child3(34);
		ch.m2(56);
		Child3.m1(67);

		}

	}


