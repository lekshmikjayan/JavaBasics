
public class MethodOverloading {
	/*
	public static void main (String[]args) {
		System.out.println(display(100,2));
		
		MethodOverloading o = new MethodOverloading();
		o.display("Elephant" , 39 );
		
	}*/
	
	static int display(int x, int y) {
		return (x/y);
	}
	public void display(String name, int y) {
		System.out.println(name + y);
	}

}
