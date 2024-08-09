import java.util.Scanner;

public class SwapValue {
    void swapValue(int a,int b)//a=10,b=20
    {
        System.out.println("Befor A = "+a+" B = "+b);
        a = a + b;//a = 10 + 20 = 30
        b = a - b;//b = 30 - 20 = 10
        a = a - b;//a = 30 - 10 = 20
        System.out.println("after A = "+a+" B = "+b);
    }
    public static void main(String[] args) {
        SwapValue obj = new SwapValue();
        int a=0,b=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A value = ");
        a = sc.nextInt();
        System.out.print("Enter B value = ");
        b = sc.nextInt();
        obj.swapValue(a, b);
        sc.close();
    }
}
