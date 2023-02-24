
public class Form {
	String name;
	int age;
	int id;
	String place;
	private int otp;
	
	
	public Form(String name, int age, int id, String place, int otp){
		this.name = name;
		this.age = age;
		this.id = id;
		this.place = place;
		this.setOtp(otp);
		
	}

	public Form(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getOtp() {
		return otp;
	}


	public void setOtp(int otp) {
		this.otp = otp;
	}
	
	public Form() {
	
	}
	
	public String List(){
		return ("Name: " + this.name + " age: " + this.age + " id: " + this.id + " place: " + this.place + " otp:" + this.otp);
	} 
	
}
