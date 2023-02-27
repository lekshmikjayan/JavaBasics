import java.util.Scanner;
public class Scnr7 {
	public static void main (String []args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Enter valid num, id,name , place");
		int num = p.nextInt();
		int id = p.nextInt();
		String name = p.nextLine();
		String place = p.nextLine();
		
		
		if(id %2 ==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
		
		
		System.out.println("num: " + num +" id: " +id +  "name: " + name +  " place: " + place  );
	}
}
