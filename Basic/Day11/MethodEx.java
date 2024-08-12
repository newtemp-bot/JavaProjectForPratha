class MethodEx {
    void display(){ //no return type no params
        System.out.println("hello");
        System.out.println("Welcome");
    } 
    void display (int a) //no return type with params , parms also have multiple datatype variables.
    {
        System.out.println("My 'A' value is = "+a);
    }
    int displayWithReturn()//with retrun type no params
    {
        System.out.println("hii");
        return 10;
    }
    int displayWithReturn(int a)//with retrun type with params
    {
        return 10+a;
    }
    void printTableByValue (int n)
    {
        for (int i = 1; i <= 10; i++)   
            System.out.println(n+" x "+i+" = "+n*i);
    }
    public static void main(String[] args) {
        MethodEx obj = new MethodEx();
        obj.display();
        //code
        obj.display(50);
        int b = obj.displayWithReturn();
        System.out.println("b= "+b);
        int c = obj.displayWithReturn(12);
        System.out.println("c= "+c);
        obj.printTableByValue(10);
        //code
        obj.printTableByValue(12);
    }
}
