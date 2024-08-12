import java.util.Scanner;

class LoopsEx {
    public static void main(String[] args) {

        //int i = 0;
       /*  while (i<5) {
            System.out.println("hello "+i);
            i++;
        } */


        //i=0;//1//2//3//4//5
        //start the loop
        //0<5 = true = print hello 0 = i++,
        //1<5 = true = print hello 1 = i++,
        //2<5 = true = print hello 2 = i++,
        //3<5 = true = print hello 3 = i++,
        //4<5 = true = print hello 4 = i++,
        //5<5 = false = end the loop.


        /* i=0;
        do{
            System.out.println("hello "+i);
            i++;
        }while(i>5); */



        /* int n = 12,k=1;
        System.out.println("\n\n\n");
        while (k<=10) {
            System.out.println(n + " X " + k + " = " + (n*k));
            k++;
        } */

        // syntax  =  for(intiliztion;condition;inc/dec){ //statements(code).... }
        System.out.println();
        System.out.println();
        System.out.println();
        /* for(int i = 1;i<=10;i++){
            System.out.print(i+",");
        } */
        /* for(int i =10;i>=1;i--)
        {
            System.out.println(i+",");
        } */
        /* int n = 12;
        for (int i = 1; i <= 10; i++) System.out.println(n + " X " + i + " = " + (n*i)); */
        
        for (int i = 0; i < 3; i++) {//start intiliztion,
            //loop until condtion will not false((1)check condtion,(2)excute code,(3)inc/dec),
            //if condtion give false or return or break then it will terminate for.
            System.out.println(i);
        }
        
        
        
        for(int row=0;row<3;row++)//ounter
        {
            for(int col=0;col<3;col++){//inner
                System.out.print(col+" ");
            }
            System.out.println();
        } 
    }
}
