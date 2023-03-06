//super

public class Employeedata {
	String name;
	int age;

	
	public Employeedata(String name, int age) {
		this.name = name;
		this.age = age;
		
		
	}
	
	public void show() {
		System.out.println("Im parent");
	}
}

class Basic extends Employeedata {
	int num;

	public Basic(String name, int age, int num) {
		super(name, age);
		this.num = num;
	}
	
	public void view() {
		super.show();
		System.out.println("Im child");
		
	}

	public void display() {
		System.out.println("Emp name: " + name + "age: " + age + "num: " + num);
	}
}