package training10oct2022;

public class CheckIsEven {

	public static void main(String[] args) 
	{
		int num=23;
		if(isEven(num))
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
	
	public static boolean isEven(int num)
	{
		if(num%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
