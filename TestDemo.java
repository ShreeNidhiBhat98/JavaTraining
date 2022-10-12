package training10oct2022;

public class TestDemo {
	static void add()
	{
		int a=10;
		int b=11;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		TestDemo obj=new TestDemo();
	System.out.println("Sum of a and b is: ");
	add();
	System.out.println("area of x and y is: "+obj.area(5, 6));
	}

	public int area(int i, int j) 
	{
		int ar = i*j;
		return ar;
	}
}

