import java.util.Scanner;

public class Test{
	String classname;
	int strength;
	
	public static void main (String []args) {
		Scanner s = new Scanner(System.in);
System.out.println("Enter classname , strength , gender: ");

	String classname = s.nextLine();
	int strength = s.nextInt();
	char gender = s.next().charAt(0);
	
	System.out.println("Classname is: " + classname);
	System.out.println("Strength is : " + strength);
	System.out.println("gender is : " + gender);
	}
	
}