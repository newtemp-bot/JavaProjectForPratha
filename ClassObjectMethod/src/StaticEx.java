class A{
    int count = 0;
    static int workHour = 8;
}
public class StaticEx {
    public static void main(String[] args) {
        A o1,o2;
        o1 = new A();
        o2 = new A();
        o1.count+=12;
        System.out.println("O1 Count is = "+o1.count);
        o2.count+=15;
        System.out.println("O2 Count is = "+o2.count);
        o1.workHour=12;
        System.out.println("O1 Work hours is = "+o1.workHour);
        System.out.println("O2 Work hours is = "+o2.workHour);
    }
}
