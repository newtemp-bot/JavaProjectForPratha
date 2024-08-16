class A{
    void property(){
        System.out.println("I have 3 viga land by next to sindhu.");
    }
}
class B extends A{

}
public class App {
    public static void main(String[] args) throws Exception {
        //Single Inheritance
        B obj = new B();
        obj.property();
    }
}
