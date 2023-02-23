public class FirstCls {
    int id = 17;
    
    String place = "KL";
    //id and place r the attributes

   public static void main (String[]args){
   
   //Widening
    int ab = 25;
    double abc = ab; 

    System.out.println(abc);//25.0

    //Narrowing
    double pq = 54.23;
    int pqr = (int) pq;

    System.out.println(pqr);

    System.out.println( Demo.view("tree ", "earth"));
    
    int b = Trial.show(3, 5);
    System.out.println(b);
    
    Trial t = new Trial();
    int result = t.shows(99,4);
    System.out.println(result);
    /*
    Check c = new Check();
    c.contact = 2355;
    c.country= "rhgbkhjg";
    c.show();
    
    */
    
    Check h = new Check();
    h.setId(127);
    System.out.println(h.getId());
    
    
   }
}
