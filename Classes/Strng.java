public class Strng {
    public static void main (String[]args){
        //String literal
        String name = "Lekshmi Kochethe Jayan";
        //String name = new String ("LKJ")-->
        //memory allocating with 'new'

        String[] latest = name.split("Kochethe");
        System.out.println(latest[1]);
        System.out.println(latest[1].trim());
        System.out.println("*********");
        System.out.println(name.charAt(10));
        
        for (int i=name.length()-1; i>=0; i--){
            System.out.println(name.charAt(i));
        }
       
;        
        
        
        /* 
        //int i =0;
        for (int i=0; i<name.length(); i++){
        System.out.println(latest[i]);
        }

str s = "jhwb jhbefj kjnenf"
Str[] newobj = s.split("mfvk");
sysout(newobj[indx])
sysout(newobj[1].trim())


for(int i=ar.length-1; i>=0; i++)

        */
    }
}
