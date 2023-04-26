import java.util.Scanner;

public class vowelcheck {
		public static void main (String[] args) {
			String name = "My name is bfweifbiuqeqkfkobfc";
			int count = 0;
			
			System.out.println(name.length());
			for (int i =0; i<name.length(); i++) {
				if (name.charAt(i)!='a' && name.charAt(i)!='e' && name.charAt(i)!='i' && name.charAt(i)!='o' &&name.charAt(i)!='u' ) {
					System.out.println("consonants in the name are: " + name.charAt(i) + " at index: " + i);
					count++;
				}
			}
			System.out.println("Number of consonants " + count);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			
			
			for (int i=1; i<=10; i++) {
				System.out.println(num * (i));
			
			}
			
		}
}
