package test;
import macces.*;
public class DemoInterface {

	public static void main(String[] args) {
		System.out.println("the value of k:"+ITest.k);
        Iclass ic = new Iclass();
        ic.m(234);
        ic.display();
        ic.show(67);
	}

}
