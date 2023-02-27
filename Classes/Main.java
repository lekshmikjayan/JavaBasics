

public class Main {
	public static void main (String[]args) {
		GetSet g = new GetSet();
		g.setId(17);
		g.setName("Bottle");
		System.out.println("Id is " + g.getId() + " and my name is " + g.getName());
		
		Trial t = new Trial(21,33);
		System.out.println(t.num);
		t.qxz();
		
		int add = Trial.trf(33, 20);
		System.out.println(add);
	
	
	Encap e = new Encap();
	e.setName("Peter");
	e.setAge(45);
	System.out.println("Employee name is " + e.getName() + " and age is "+ e.getAge());
	

		
	
		Calculator qd = new Calc();
		int v= qd.add(10, 5);
		int y = qd.subtract(10, 3);
		//int b = qd.mult(3, 4);
		
	//	System.out.println("Sum is " +v + "Diff is: " + y + "Prdt is: " + b);
		System.out.println("Sum is " +v + "Diff is: " + y);
		
	
	//Vehicle ve = new Vehicle();
	Vehicle c = new Car1();
	c.move();
	//c.move()
	//System.out.println(c.move("Baleno"));
	//System.out.println("sum is " + c.move(23, 45,13));
	System.out.println("diff: " + c.move(55, 34));
	
	Ground gr = new Ground();
	Ground.cat ctc = new Ground.cat();
	gr.place= "wqijdoi";
	System.out.println(gr.place);
	System.out.println(	ctc.b);
	
	Demoo l = new Demoo();
	Demopq p = new Demopq();
	l.check();
	l.demo();
	System.out.println("           ");
	l.checking();
	
	p.check();
	p.demo();
	int u = l.sample(98, 97);
	System.out.println("           ");
	System.out.println("dif: " + u);
	
	
	Lab lb = new Lab();
	int pdt = lb.demo8(45, 5);
	System.out.println(pdt);
	lb.idno(7);
	lb.name="WWE";
	System.out.println(lb.name);
	System.out.println("           ");
	lb.demo9();
	System.out.println("           ");
	lb.demo7();
	
	System.out.println("           ");
	Chair cr = new Chair();
	int newCost = cr.checkTable(1000);
	System.out.println(newCost);
	cr.moveTable();
	cr.showTable();
	cr.setDisplay();
	cr.checkDisplay();
	
	size se = size.Extralarge;
	switch(se) {
	case Small:
		System.out.println("This is small..!!");
		break;
	case medium:
		System.out.println("This is medium sized..!!");
		break;
	case Large:
		System.out.println("This is Large..!!");
		break;
	case Extralarge:
		System.out.println("This is too large..!!");
		break;
	default:
		System.out.println("No matching");
		
		
	}
	
	}	
	
}
