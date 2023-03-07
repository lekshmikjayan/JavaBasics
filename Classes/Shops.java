import java.util.ArrayList;

public class Shops {
	public static void main(String[]args) {
		ArrayList <String> sh = new ArrayList<String>();
		sh.add("automobiles");
		sh.add("Furniture");
		sh.add("electronics");
		sh.add("finance");
		sh.add("stationery");
		System.out.println(sh.size());
		int i = 0;
		while (i<1) {
			System.out.println(sh);
			i++;
			
		}
		System.out.println(sh.contains("umbrella"));
		sh.set(2, "Sandals");
		System.out.println(sh);
		
	}
}
