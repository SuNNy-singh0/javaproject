package p2;

 class Display1 {
public int k =90;
public void m(int a, int b) {
	this.m(a);
	System.out.println("the m(a,b)======");
	System.out.println("the value of b"+b);
}
public void m(int a) {
	System.out.println("the m(a)======");
	System.out.println("the value of a"+a);
}
}
 class Child4 extends Display1{
int k  =300;
public void m(int a,int b,int c ,int d) {
	this.m(a, b, c);
	System.out.println("the m(a,b,c,d)===");
	System.out.println("the value of d :"+d);
}
public void m(int a,int b,int c) {
	super.m(a, b);
	System.out.println("the m(a,b,c)===");
	System.out.println("the value of c :"+c);
}
public void display() {
	System.out.println("====Display====");
	System.out.println("parent class k value:"+super.k);
	System.out.println("child class k value:"+this.k);
}
}


public class This {

	public static void main(String[] args) {
		Child4 cr = new Child4();
		 cr.m(12,34,56,78);
		 cr.display();

	}

}
