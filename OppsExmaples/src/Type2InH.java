class Animal{
    void eat(){
        System.out.println("I can eat.");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Bhaou Bhaou...");
    }
}
class ChildDog extends Dog {
    void cutesness()
    {
        System.out.println("I am the cutesest animal alive.");
    }
}
public class Type2InH {
    public static void main(String[] args) {
        //Multilevel inheritance
        ChildDog cd = new ChildDog();
        cd.bark();
        cd.eat();
        cd.cutesness();
    }
}
