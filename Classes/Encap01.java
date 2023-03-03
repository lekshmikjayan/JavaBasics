
public class Encap01 {
	private int id;
	private String petname;
	
	public int showAge(int age) {
		return age;
	}
	
	public void showName() {
		System.out.println("My name is LKJ");
	}

	
	public int getId() {//public getter
		return id;
	}
	
	public void setId(int id) {//public setter
		this.id = id;
	}

	public String getpetName() {
		return petname;
	}

	public void setpetName(String petname) {
		this.petname=petname;
	}
	
}

