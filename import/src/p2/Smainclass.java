package p2;
import java.util.Scanner;
import java.io.*;
import static p1.Calculate.*;
public class Smainclass {
	public static void main(String[] args) {
		 PrintStream stream = new PrintStream(System.out);
		String str = new String("welcome to java");
		stream.print(str);
		Scanner s = new Scanner(System.in);
		System.out.println("\nenter the value");
		double x = s.nextDouble();
		double r =  cal(x);
		System.out.println("Square of "+x+" is "+r);
		s.close();
		
	}
}
