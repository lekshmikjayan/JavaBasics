import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
	public static void main(String[]args) {
		LinkedList <Integer> abv = new LinkedList <Integer>();
		abv.add(75);
		abv.add(175);
		abv.add(725);
		abv.add(753);
		abv.add(475);
		abv.add(755);
		abv.add(675);
		abv.add(757);
		abv.add(875);
		abv.add(759);
	
		Iterator <Integer> it = abv.iterator();
		
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		
	}
}
