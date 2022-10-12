package training10oct2022;

public class SwitchGrade {

	public static void main(String[] args) {
		String grade="C";
		
		switch (grade) {
		  case "A":
			  System.out.println("Distinction");
			  break;
		  case "B":
			  System.out.println("First Class");
		    break;
		  case "C":
			  System.out.println("Second Class");
		    break;
		  case "D":
			  System.out.println("Third Class");
		    break;
		  case "F":
			  System.out.println("Fail");
		    break;
		  default:
			  System.out.println("Invalid");
		    break;
		}

	}

}
