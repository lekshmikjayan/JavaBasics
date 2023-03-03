

public class Main2 {
	public static void main (String [] args) {
		Encap00  e = new Encap00();
		e.setfon(987654321);
		e.setLastname("John");
		
		System.out.println("Fon: " + e.getfon() + " and last name is: " + e.getLastname());

		//Animals a = new Animals();	
		Cats c = new Cats();
		//Lion l = new Lion();
		Lion l = new Cats();
		
		int z = c.add(67, 330);
		c.show();
		int g = c.getdiv(455,5);
		c.voice();
		c.setDistrict("Kollam");
		System.out.println("sum is: "+ z + " My district is: " + c.getDistrict()+ " quotient is: " + g );
		
		l.voice();
		String h = Animals.vorname("Jeeva..");
		
	
	
		Sample s = new Sample(7, 90, "Kerala");
		s.view();
	/*	
	s.b=99;
	s.state = "ehjbf";
	s.w = 67;
	s.view();
	*/
	
	
	
	}
	
	
	
}
