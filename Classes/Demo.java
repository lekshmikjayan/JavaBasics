
public class Demo {

	static String view(String name, String place) {
		return ("I'm " + name + "from " + place);
	}
	
	public int view(int a, int b, int c) {
		return (a+b+c);
	}
	
	public void view() {
		System.out.println("Halloooooo");
	}
	
	public static void main(String[]args) {
		Demo d = new Demo();
		Demo d2 = new Demo();
		System.out.println(d.view(16, 23, 346));
		System.out.println(d2.view(136, 235, 346));
		d.view();
		
		
		int v = Recursion.sum(3,7);
		System.out.println("The sum is " + v);
	}
}
