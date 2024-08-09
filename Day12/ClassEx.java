class A {
    static int i;
    A(){
        System.out.println("Start");
    }
   A(int i)
   {
    System.out.println(i);
   }
    void display(){
        System.out.println("I = "+i);
    }
    static
    {
        System.out.println("hello");
    }
}


public class ClassEx {

    public static void main(String[] args) {
        A obj2;
        A obj = new A(10);
        obj2 = new A();
        obj.i = 50;
        obj.display();
        obj2.display();
    }
}