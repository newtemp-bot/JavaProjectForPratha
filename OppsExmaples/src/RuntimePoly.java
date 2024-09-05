import java.util.Scanner;

class Animals {
    void eat() {
        System.out.println("Eating...");
    }
}

class Cat extends Animals {
    void eat() {
        System.out.println("Cat is eating...");
    }
}

class Dog extends Animals {
    void eat() {
        System.out.println("Dog is eating...");
    }
}

public class RuntimePoly {
    public static void main(String[] args) {
        Animals aef;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.err.println("============================================");
            System.out.println("\t\t 1. Dog Eat");
            System.out.println("\t\t 2. Cat Eat");
            System.out.println("\t\t 3. Exit");
            System.err.println("============================================");
            System.err.print("Enter your choice = ");
            int c = sc.nextInt();
            if (c == 3) {
                break;
            }
            switch (c) {
                case 1:
                    aef = new Dog();
                    aef.eat();
                    break;
                case 2:
                    aef = new Cat();
                    aef.eat();
                    break;
                default:
                    System.out.println("\n\n==== Wrong choice try again.... ==== \n\n");
                    break;
            }
        }
        sc.close();
    }
}
