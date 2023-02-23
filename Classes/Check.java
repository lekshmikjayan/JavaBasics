
public class Check {
	private int id;
	private int age;
	


public int getId () {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}


public static void main (String[]args) {
	Check cd= new Check() ;
	cd.setId(7);
	cd.setAge(12);
	System.out.println(cd.getId() + " age is " + cd.getAge());	
;		
}



}
