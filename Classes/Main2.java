import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Encap00 e = new Encap00();
		e.setfon(987654321);
		e.setLastname("John");

		System.out.println("Fon: " + e.getfon() + " and last name is: " + e.getLastname());

		// Animals a = new Animals();
		Cats c = new Cats();
		// Lion l = new Lion();
		Lion l = new Cats();

		int z = c.add(67, 330);
		c.show();
		int g = c.getdiv(455, 5);
		c.voice();
		c.setDistrict("Kollam");
		System.out.println("sum is: " + z + " My district is: " + c.getDistrict() + " quotient is: " + g);

		l.voice();
		String h = Animals.vorname("Jeeva..");

		Sample s = new Sample(7, 90, "Kerala");
		s.view();
		/*
		 * s.b=99; s.state = "ehjbf"; s.w = 67; s.view();
		 */

		Television t = new Television();
		t.show();
		int a = t.sub(298, 45);
		t.display();
		String ed = t.names("Pikachu");
		t.display();
		t.mult(3, 32);

		System.out.println(a + ed);

		Box1 b1 = new Box1();
		String h2 = b1.sample("anu");
		b1.show();
		b1.view();
		b1.file();
		int g3 = b1.age(73);
		b1.que();
		int g4 = b1.demo(35, 11);
		int g7 = Box1.num(88);
		System.out.println(g3 + "is the age and diff is " + g4 + "name is " + h2 + g7);

		Scanner s3 = new Scanner(System.in);
		System.out.println("Enter name, age, salary");

		String name = s3.nextLine();
		int age = s3.nextInt();
		double salary = s3.nextDouble();

		System.out.println("name: " + name + "age: " + age + "salary: " + salary);

	}

}
