import java.util.LinkedList;
public class Numbers {
	public static void main (String []args) {
		LinkedList <Integer> num = new LinkedList<Integer>();
		num.add(2);
		num.add(12);
		num.add(22);
		num.add(32);
		num.add(42);
		num.add(52);
		num.add(62);
		num.add(72);
		num.add(82);
System.out.println(num);
	num.remove(4);
	num.set(2, 75);
	System.out.println(	num.get(7));
	num.addLast(102);
	System.out.println(num);	
	}
}
