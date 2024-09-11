class AbstractionEx{
    public static void main(String[] args) {
        //MainC a = new Sub();
        InterfaceEx e = new NewSub();
        InterfaceEx e2 = new Sub();
        e.dis();
        e2.dis();
        //a.dis();
        //a.myOwnMethod();
    }
}