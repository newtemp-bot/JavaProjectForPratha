import java.util.Scanner;

class SumOfNNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();  
        System.out.println();
        System.out.print("Enter N Number which you want to sum = ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;//sum=sum+i;
        }
        System.out.println("Your sum is = "+sum);
    }
}