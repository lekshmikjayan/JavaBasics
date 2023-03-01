import java.util.Scanner;

public class Addition {
	public static void main(String[]args) {
		int x, y , sum;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First num: ");
		x= s.nextInt();
		System.out.println("Enter Second num: ");
		y=s.nextInt();
		
		sum = x+ y;
		System.out.println("Result is: " + sum);
		
//Counting words
		
	String words = " hallo hi by tc c u good morning";
	int countWords = words.split("\\s").length;
	System.out.println(countWords);
	
	String name = "Lekshmi K Jayan";
	String[] vorName = name.split(" ");
        
	for (String a : vorName)
		
        System.out.println(a);
	
	int countName = name.split(" ").length;
	System.out.println(countName);
	
	System.out.println(vorName);
	
	System.out.println(name.trim());
	//Reversing String
	
	String reverseName = "";
	for(int i=0; i<name.length(); i++) {
		reverseName = name.charAt(i) + reverseName;
	}
	System.out.println(reverseName);
	
	}
}
