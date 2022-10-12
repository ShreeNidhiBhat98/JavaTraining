package training;

public class TrainingStringMethods 
{
public static void main(String[] args) {
	 String fname="SHREENIDHI";
	 String lname="BHAT";
	 System.out.println(fname.concat(lname));
	 System.out.println(fname.charAt(4));
	 System.out.println(fname.equals(lname));
	 System.out.println(fname.contains("aks"));
	 System.out.println(fname.indexOf("H"));
	 System.out.println(fname.isBlank());
	 System.out.println(fname.replace("HR", "HE"));
	 System.out.println(fname.replace(fname, lname));
	 System.out.println(fname.toUpperCase());
	 System.out.println(fname.toLowerCase());

}
}
