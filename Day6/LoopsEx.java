class LoopsEx {
    public static void main(String[] args) {
        int i = 0;
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
        int n = 12,k=1;
        System.out.println("\n\n\n");
        while (k<=10) {
            System.out.println(n + " X " + k + " = " + (n*k));
            k++;
        }
    }
}
