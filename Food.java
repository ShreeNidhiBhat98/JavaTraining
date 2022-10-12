package training10oct2022;

public class Food {

	void foodlist()
	{
		String pizza="PIZZA";
		String cake="CAKE";
		String sweets="SWEETS";
		 
		System.out.println(pizza+" "+cake+" "
				+ ""+sweets);
	}

	public static void main(String[] args) 
	{
		new Food().foodlist();
	}

}
