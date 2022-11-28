package p1;

public class Test {
private int k = 600;
private class Sub{
	public void m2(int x) {
	System.out.println("=======innerclass ==========");
	System.out.println("the value of x :"+x);
	}
}
public void m1() {
	System.out.println("private Variable");
	System.out.println("the value of k :"+k);
}
private Test() {}
private static Test ob = null;
public void acess() {
	Sub sb = new Sub();
	sb.m2(67);
}


public static Test getReference() {
	if(ob == null) {
		ob = new Test();
	}
	return ob;
}
}
