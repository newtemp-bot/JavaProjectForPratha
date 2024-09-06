interface CarShow {
    void run();
}
interface JaduShow {
    void run();
}

class BMW implements CarShow,JaduShow {
    @Override
    public void run() {
        System.out.println("BMW Is running..");
    }    
}
abstract class Aa {
    abstract void dis();
    void jadu()
    {
        System.out.println("Hello");
    }
}
class Ba extends Aa {
    private int x = 10;
    void dis(){
        System.out.println("A class method dis called..."+x);
    }
}
class AbstractEx {
    public static void main(String[] args) {
        Aa a = new Ba();
        Aa aa = new Aa() {
            @Override
            void dis() {
                
            }
        };
        a.dis();
        CarShow cs = new BMW();
        cs.run();
    }
}
