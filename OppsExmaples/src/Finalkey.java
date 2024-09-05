final class Aas{
    final int i = 10;
    final int c;
    static final int t;
    static{
        t=30;
    }
    Aas(){
        c=20;
    }
    final void display(){
        //i = 30;//Final can not be assigned.
        System.out.println("A class dispaly called.. i = "+i);
    }
}
class Bas /* extends Aas */{//final class cannot extend it.
    int i = 20;
    /* void display(){//Cannot override the final method
        System.out.println("B class dispaly called.. i = "+i);
    } */
}
class Finalkey{
    public static void main(String[] args) {
        Aas a = new Aas();
        a.display();
        System.out.println("c = "+a.c+" t = "+Aas.t);
    }
}