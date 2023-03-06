
class Box1 implements Box, Box2 {
	public String sample(String name) {
		return name;
	}

	public void show() {
		System.out.println("I think this is overriding..!");
	}

//	@Override
	public void view() {
		// TODO Auto-generated method stub
		System.out.println("HallooooS");
	}

	public void file() {
		System.out.println("bye bye");
	}

	public static int age(int age) {
		return age;
	}

	public static void que() {
		System.out.println("Im in q..!");
	}

	public static int demo(int x, int y) {
		return x - y;
	}

	static int num(int num) {
		return num;
	}

}
