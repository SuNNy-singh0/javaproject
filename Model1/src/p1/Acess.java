package p1;

public class Acess {
	public static Itest getReference() {
		Itest ob = (int x)->{
			System.out.println("the value of  x is"+x);
		};
		
		return ob;
	}
}
