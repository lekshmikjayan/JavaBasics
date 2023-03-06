
  class Television extends Laptop {
		public String names(String name) {
			return name;
		}
		
		public void display() {
			System.out.println("am i overridden?");
		}
		
		public int mult(int u, int v) {
			return u * v;
		}
}
