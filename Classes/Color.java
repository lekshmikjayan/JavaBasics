import java.util.ArrayList;
import java.util.Collections;

public class Color {
	public static void main (String []args) {
		
		ArrayList <String> cl = new ArrayList<String>();
		cl.add("blue");
		cl.add("green");
		cl.add("black");
		cl.add("white");
		cl.add("red");
		cl.add("ash");
		cl.add("yellow");
		cl.add("brown");
		cl.remove(6);
		cl.set(2, "purple");
		System.out.println(cl.get(4));
		//System.out.println(cl);
		System.out.println(cl.size());
		
		
		int i=0;
		while (i<=0) {

			System.out.println(cl);
			i++;
		}
		
		Collections.sort(cl);
		System.out.println(cl);
	}
}
