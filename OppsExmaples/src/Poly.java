/* class Atest {
    void display() {
        System.out.println("Hello");
    }

    void display(int i)// overloading method
    {
        System.out.println("Second method");
    }
    
    static String add(int a, int b) {
        return String.valueOf((a + b + 10));
    }

    static int add(int a, int b) {
        return a + b;
    }

} */

class Parent{
    Parent()
    {
        System.out.println("Hii");
        System.out.println("Parent Constuctor");
    }
    int i = 10;
    void naknaksha(){
        System.out.println("Mari akho moti che..");
    }
}
class Child extends Parent{
    Child()
    {
        System.out.println("Child Constuctor");
        super();
    }
    int i = 50;
    @Override
    void naknaksha(){
        System.out.println("Mari akho moti and blue che..");
        System.out.println("I = "+(super.i+i));
        super.naknaksha();
    }
}

public class Poly {
    public static void main(String[] args) {
        /* Atest a = new Atest();
        a.display();
        a.display(0);
        System.out.println("20"+Atest.add(10, 20)); */
        Child c = new Child();
        c.naknaksha();
    }
}
