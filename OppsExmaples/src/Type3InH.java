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
class Cat extends Animal{
    void meow()
    {
        System.out.println("Meow Meow...");
    }
}
public class Type3InH {
    public static void main(String[] args) {
        //Hierarchical inheritance 
        Dog d = new Dog();
        d.eat();
        d.bark();
        Cat c = new Cat();
        c.eat(); 
        c.meow();
    }
}
