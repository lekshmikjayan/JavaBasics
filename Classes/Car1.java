
public class Car1 extends Vehicle {
	public int move(int q, int o, int t) {
		return ( q+o+t);
	}
	
	public String move(String name) {
		return ("Name is : " +name);
	}
	
	public void move() {
		System.out.print("Movmnt is impossible..!!!");
	}
}
