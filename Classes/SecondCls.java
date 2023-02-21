class SecondCls {
    public static void main(String[]args){
        FirstCls f1 = new FirstCls();
        FirstCls f2 = new FirstCls();
        f1.id = 117; //changing attr val
        System.out.println(f1.place);
        System.out.println(f1.id);
        System.out.println(f2.id);
    }
    
}


