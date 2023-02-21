import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArList {
    public static void main (String[]args){

        ArrayList <Integer> num = new ArrayList <Integer>();
        num.add(11);
        num.add(15);
        num.add(37);
        num.add(45);
        num.add(25);
        num.add(76);
        num.remove(5);
        System.out.println(num.set(3,90));
        System.out.println(num.get(1));
        System.out.println(num);
        System.out.println(num.size());

System.out.println(num.contains(15));

for (Integer val : num){
   System.out.print(val + "a" + " ");
        };

for (int i=0; i<num.size(); i++){
    System.out.println(num.get(i));
}

// for(dt obj : declrd obj){
//sysyout(obj)
//}


int ar[] = new int []{1,2,34,5};
for (int u =0; u<ar.length; u++){
System.out.print(ar[u] + " ");
}

//contains => checks whether element is present or not// true or false
//Arrlist <dt> obj = new Arrlist <dt> ();



int y=0;
while(num.size()>0){
    System.out.println(num.get(y));
    y++;
}

String [] place = {"Mathra", "Punalur", "Kollam", "Kerala"};
//Arrays.aslist
List <String> pl =  Arrays.asList(place);
System.out.println(pl.contains("Mathra"));

};
}
 /*   
int [] ar = new int [] {146787346}

    }
}

 ArrayList <datatype> obj = new Arraylist <datatype>();
 
 obj.add;
 obj.get()
 obj.set()...obj.remove()
 * 
 */
