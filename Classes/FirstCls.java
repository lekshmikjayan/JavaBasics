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


   }
}
