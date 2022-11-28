class Btest
{
	int a= 10;//instance variable
	static  int b = 11;//static variable
	{
		a++;
		b++;
		System.out.println("====instance block=====");
		System.out.println("The value of a is "+a);
		System.out.println("the value of b is "+b);
	}
}
class Block3
{
	public static void main(String[] args){
		System.out.println("-------------------object 1------");
		Btest b1 = new Btest();
System.out.println("-------------------object 2------");
		Btest b2 = new Btest(); 

	}
}