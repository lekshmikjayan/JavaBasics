
public class Sample {
	int w;
	int b;
	String state;
	
	
	public Sample(int w, int b,String state) {
		this.w = w;
		this.b = b;
		this.state = state;
	}

	public void view() {
		System.out.println("value of w: " + w + "value of b: " + b + "and the state is: " + state);
	}
}
