package training10oct2022;

public class PracticeDemo {

	public static void main(String[] args) 
	{
		System.out.println("Product of a and b: "+product());
		TestDemo obj=new TestDemo();
		System.out.println("Area of a and b: "+obj.area(3,4));
	}

	private static int product()
	{
		int a=5;
		int b=10;
		int c=a*b;
		return c;	
		}

}
