class A{
    A(){
        System.out.println("--------Welcome--------");
    }
    void display(){
        System.out.println("hello");
    }
}
class Students {
    int id;
    String name;
    String subject;
    int marks;
    Students()
    {
        System.out.println("Defualt Con called");
    }
    Students(int id,String name,String subject,int marks)
    {
        this();
        System.out.println("Value is assigned..");
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
        this.display();
    }
    void display()
    {
        System.out.println("Hello "+name);
        System.out.println("Your Id is = "+id);
        System.out.println("Your Subject is = "+subject+" And your marks is = "+marks);
    }
}
public class ConstructorEx {
    public static void main(String[] args) {
        A a = new A();
        Students ashok = new Students(1, "Ashok Prjapari", "Computer", 85);
        Students obj = new Students();
        obj.display();
    }
}
