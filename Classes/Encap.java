
public class Encap {
		private String empName;
		private int empAge;
		
		
		
	public String getName() {
		return empName;
	}
	
	public void setName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return empAge;
	}
	
	public void setAge(int empAge) {
		this.empAge = empAge;
	}
	
	public String key() {
		return ("Emp name is" + this.empName +"and id is : " +this.empAge);
	}
	

}
