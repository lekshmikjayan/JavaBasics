
public class check3 {

	public static void main(String[] args) {
		String cb = new String("Welcome to my heaven");
		int count = 0;
		for (int i = 0; i < cb.length(); i++) {
			if (cb.charAt(i) == 'a' || cb.charAt(i) == 'i' || cb.charAt(i) == 'e' || cb.charAt(i) == 'o'
					|| cb.charAt(i) == 'u') {
				System.out.println("String contains vowels : " + cb.charAt(i) + " at index " + i);
				count++;
				
			}
		}
		System.out.println("No of vowels: " + count);
	
	}
}