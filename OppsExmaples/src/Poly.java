class Atest {
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

}

public class Poly {
    public static void main(String[] args) {
        Atest a = new Atest();
        a.display();
        a.display(0);
        System.out.println("20"+Atest.add(10, 20));
    }
}
