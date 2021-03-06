package academy.devdojo.javaoneforall.javacore.Hinheritance.domain;

//71 - Object Orientation - Inheritance pt 01
//73 - Object Orientation - Inheritance pt 03 - protected
//74 - Object Orientation - Inheritance pt 04 - Constructors
//75 - Object Orientation - Inheritance pt 05 - Initialization order

//If we don't add any constructors, Java will take care of it for us

public class Employee {
    protected String name;
    protected String socialSecurityNumber;
    protected Address address;
    protected double salary;
    static {
        System.out.println("Inside employee static init block");
    }
    {
        System.out.println("Inside employee init block 1");
    }
    {
        System.out.println("Inside employee init block 2");
    }

//This is if I want to turn name mandatory
    public Employee(String name) {
        System.out.println("Inside Employee Constructor");
        this.name = name;
    }


//    Before in class 71 and 72
//    private String name;
//    private String socialSecurityNumber;
//    private Address address;
//    private double salary;

    public void print(){
        System.out.println(this.name);
        System.out.println(this.socialSecurityNumber);
        System.out.println(this.salary);
        System.out.println(this.address.getStreet() + " " + this.getAddress().getZipcode());

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
