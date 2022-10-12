package training10oct2022;

public class CreateObject {

	public static void main(String[] args) 
	{
		CreateObject obj=new CreateObject();
		System.out.println("Area of circle: "+obj.area(2));
	}

	private double area(int r)
	{
		double pi=3.14;
		double ar=pi*r*r;
		return ar;
	}

}
