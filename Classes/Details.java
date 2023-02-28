import java.util.HashMap;
import java.util.HashSet;

public class Details {
	public static void main (String []args) {
		
		HashMap<Integer , String> bio = new HashMap <Integer, String> ();
		bio.put(30, "Manish");
		bio.put(25, "Lekshmi");
		bio.put(1, "Bobby");
		bio.put(7, "Table");
		
	System.out.println(bio.values());
	for (Integer i : bio.keySet()) {
		  System.out.println(i);
		}
	
	for (String i : bio.values()) {
		  System.out.println(i);
		}
	
	HashSet <Integer> ing = new HashSet<Integer>();

	ing.add(98);
	ing.add(88);
	ing.add(78);
	ing.add(68);
	ing.add(58);
	ing.add(48);
	ing.add(38);
	ing.add(28);
	ing.add(18);
	ing.add(8);
	ing.add(78);
	System.out.println(ing);
	System.out.println(ing.contains(38));
	System.out.println(ing.size());
	
	
	Integer intNum = 3842;
	Character charSet = 'L';
	System.out.println(intNum.intValue());
	System.out.println(charSet.charValue());
	
	}

}
