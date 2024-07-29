import java.util.Scanner;

public class SwapVarEx {
    public static void main(String[] args) {
        int a=0, b=0, c=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n\nEnter A value = ");
        a = sc.nextInt();
        System.out.print("Enter B value = ");
        b = sc.nextInt();
        
        System.out.println("Befor A = "+a+" B = "+b+" C = "+c);
        c = a;
        a = b;
        b = c;
        System.out.println("After A = "+a+" B = "+b+" C = "+c);
    }
}
