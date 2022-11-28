package p1;
import java.util.*;

public class Array1 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("enter the number of Integer object");
		int  n = s.nextInt();
		Integer a[] = new Integer[n];
		System.out.println("enter "+n+" Integer object");
		for(int i = 0;i<n;i++) {
			a[i]= new Integer(s.nextInt());
			
		}
		System.out.println("Display using old for loop");
		for(int i=0;i<=n-1;i++) {
			System.out.println(a[i].toString());
		}
		System.out.println("display using extended for loop");
		for(Integer k:a) {
			System.out.println(k.toString());
		}
		s.close();

	}

}
