import java.util.Scanner;
class Totalmarks{
	int add(int a,int b,int c,int d,int e,int f){
		int sum = a+b+c+d+e+f;
		return sum;
	}
}
class Percentage
{
	float calculate( float totalmarks)
	{
		float percent = totalmarks/6;
		return percent;
	}
}
class StudentResult
{
	String generate(float u ){
		
		if(u>=70&&u<=100){
			return "congratulation you get distinction";
		}
		 else if(u>=60&&u<70){
			 return " first class division";
		}
		 else if(u>=50&&u<60){
		 return "Second class divison";
		}
		else{
			return "better next time you get failed";
		}
	}

}

class Method4
{
	public static void main(String[] args)
{
System.out.println("===========enter the subject marks============");
Scanner s = new Scanner(System.in);
System.out.println("enter the math marks :");
int s1 = s.nextInt();
System.out.println("enter the english marks :");
int s2 = s.nextInt();
System.out.println("enter the Hindi marks :");
int s3 = s.nextInt();
System.out.println("enter the Science marks :");
int s4 = s.nextInt();
System.out.println("enter the Socialscience marks :");
int s5 = s.nextInt();
System.out.println("enter the Computer marks :");
int s6 = s.nextInt();
if(s1<=100 && s2<=100 && s3<=100 && s4<=100 && s5<=100 && s6<=100)
{
	Totalmarks G = new Totalmarks();
	int total = G.add(s1,s2,s3,s4,s5,s6);
	System.out.println("The Total mars is"+total);
	Percentage H = new Percentage();
	float percent = H.calculate(total);
	System.out.println(percent+"%");
	StudentResult k = new StudentResult();
	String grade = k.generate(percent);
	System.out.println(grade);
	

}
else{
	System.out.println("invalid marks:");
}
	}
}