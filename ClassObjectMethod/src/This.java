class A{
    A()
    {
        display(this);
    }
    void display(A obj)
    {
        System.out.println("Display...");
        obj.call();
    }
    void call()
    {
        System.out.println("Call...");
    }
}
public class This {
    public static void main(String[] args) {
        A o = new A();
    }
}
