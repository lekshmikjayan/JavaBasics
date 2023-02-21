public class ternary {
    
    public static void main (String[]args){
      String today = "Wed";
      String day = (today == "Wed") ? "Yes" : "No";
      System.out.println(day);

    

      /*   int i = 1;
        while (i<6){
            System.out.println(i);
            i++;
        }   */


     /*    while(true){
            System.out.println("Lachu");
           if( get api = success || get api failure) {
            break;
           }

        }  */

        int arro[] = {1,2,4,5,6,7};
        int i=0;

        while(true){
          //  if(i>arro.length){
          //      break;
          //  }
          if (i < arro.length){
            System.out.println(arro[i]);
            i++;
          }
          else {
            break;
          }

        }

//ternary

int r =100;
String d = "final";
d = (r %2 == 1) ? "odd" : "even";
System.out.println(d);

        int[][] rrr = {{1,2,3}, {4,5,6}};
          System.out.println(rrr[0][2]);
     /*    while(i<arro.length){
            if(arro[i]==4){
                i++;
                continue;
                
            }
            System.out.println(arro[i]);
            i++;
        } */

         
    }
}




