class Test {
    static int i;
    static 
    {
        i = 10;
        System.out.println("static block called ");
    }
    Test(){
        System.out.println("Constructor called");
    }
}
 class StaticBlock {
    public static void main(String args[]) {
       Test t1 = new Test();
       Test t2 = new Test();
    }
}