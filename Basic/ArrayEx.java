import java.util.Scanner;

class ArrayEx{
    public static void main(String[] args) {
        int sum = 0;
        /* Single dimension array */
        //Declare without defualt value 
        int arr[];
        arr = new int[5];
        arr[0] = 20;
        arr[1] = 30;
        //int[] arr;
        //int []arr;
        //Declare with memory without defualt value 
        int arr2[] = new int[5];
        //Defination with defualt value
        int arr3[] = {10,20,30,40};
        //Defination with memory with defualt value
        int arr4[] = new int[]{30,10,40,20};

        Scanner sc = new Scanner(System.in);
        /* for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter Your numebr a["+i+"] = ");
            arr2[i] = sc.nextInt();
        } */
        for (int i : arr4) {
            sum+=i;
        }
        System.out.println(sum);
    }
}