package p1;
import java.util.Scanner;
public class StringBuffer2 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = new StringBuffer();
		StringBuffer sb4 = new StringBuffer();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String str = s.nextLine();
		int len = str.length();
		for(int i=0;i<len-1;i++) {
			char ch = str.charAt(i);
			int k = (int)ch;
			if((k>=65&&k<=90)||(k>=97&&k<=122)) {
				switch(ch) {
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case  'o':
				case  'O':
				case  'u':
				case   'U':
				sb1.append(ch+" ");
				break;
				default:
				sb2.append(ch+" ");
				}
			}
			else if(k>=48 && k<=57){
				sb3.append(ch + " ");
			}
			else {
				sb4.append(ch +" ");
			}
			
		}
		System.out.println("==========Details=========");
		System.out.println("vowel :"+sb1);
		System.out.println("consonants "+sb2);
		System.out.println("Numbers "+sb3.toString());
		System.out.println("other"+sb4.toString());
		s.close();
	}

}
