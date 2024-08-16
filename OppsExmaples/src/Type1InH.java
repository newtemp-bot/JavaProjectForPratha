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
public class Type1InH {
    public static void main(String[] args) {
        //Single inheritance
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
