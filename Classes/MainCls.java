public class MainCls{
    String name = "LKJ";
    int s = 7;

    public static void main(String[]args){
        MainCls abcd = new MainCls(); // object creation 
        MainCls efgh = new MainCls();
        System.out.println(abcd.name);
        System.out.println(efgh.name);
        System.out.println(abcd.s);

        //switch
        String name = "w";
        switch (name) {
            case "abc":
            System.out.println("bsjhdb");
            break;
            case "def":
            System.out.println("uewfbqwfj");
            break;
            case "Manu":
            System.out.println("Its me");
            break;
            case "hqwj":
            System.out.println("fwhqj");
            break;
            default:
            System.out.println("No matches");

        } 


    }
}