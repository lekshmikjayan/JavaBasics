
public class MethodParameter {

		public static void main (String[]args) {
			abc();
			def(17, "India");
			System.out.println(ghi(7,2,3));
		}
		
		static void abc() {
			System.out.println("Hallooo");
		}
		
		static void def(int age, String place) {
			System.out.println("pqr is " + age + "years old and is from " + place );
		}
		
		static int ghi(int x, int y, int z) {
			return x*(y+z);
					}
}
