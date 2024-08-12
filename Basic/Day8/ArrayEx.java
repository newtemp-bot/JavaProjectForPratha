public class ArrayEx {
    public static void main(String[] args) {

        //Single Dimensional Array
        {
            //declaration
            /*dataType[] arr; (or)  
            dataType []arr; (or)  
            dataType arr[]; */
            
            //Instantiation
            //arrayRefVar=new datatype[size];  

            //both
            //dataType arrayVar[] = new datatype[size];
            
            //Defination
            //dataType arrayVar[] = new datatype[]{10,20,30,.....Up to N};

            //dataType arrayVar[] = {10,20,30,.....Up to N};

            //1
            int a[];
            a = new int[5];

            //2
            int b[] = new int[5];

            //3
            int c[] = new int[]{10,20,30};

            //Inserting
            a[0] = 10;
            a[1] = 20;
            a[2] = 30;


            b = new int[]{10,20};

            /* for (int value : a) {
                System.out.println(value);
            } */
        /* for (int i = 0; i < a.length; i++)
        {
                System.out.println(a[i]);
        } */
        /* for (int value : b) {
                System.out.println(value);
            }
            System.out.println(b.length); */
        }

        //Multidimensional Array
        {
            /*dataType[][] arrayRefVar; (or)  
            dataType [][]arrayRefVar; (or)  
            dataType arrayRefVar[][]; (or)  
            dataType []arrayRefVar[];  */

            //int[][] arr=new int[3(row)][4(col)];//3 row and 4 column  

            int arr[][]= {{1,2,3},{2,4,5},{4,4,5}};  

            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.print(arr[row][col] + " ");
                }
                System.out.println();
            }
        }
    }
}
