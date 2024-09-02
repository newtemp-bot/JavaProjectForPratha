class Address{
    String add1;
    String state;
    String contry;
    Address(String add1, String state, String contry) {
        this.add1 = add1;
        this.state = state;
        this.contry = contry;
    }
}
class Emp {
    int id;
    String name;
    Address address;//Aggregation 
    Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println("Emp Id = "+id);
        System.out.println("Emp Name = "+name);
        System.out.println("Emp Address = "+address.add1+" "+address.state+" "+address.contry);
    }
}

class Agg{
    public static void main(String[] args) {
        Address a1 = new Address("41 ABC", "Gujart", "India");
        //Address a2 = new Address("C-302 MHD", "Gujart", "India");
        Emp e1 = new Emp(1, "Ashok", a1);
        //Emp e2 = new Emp(2, "Rajesh", a2);
        e1.display();
    }
}