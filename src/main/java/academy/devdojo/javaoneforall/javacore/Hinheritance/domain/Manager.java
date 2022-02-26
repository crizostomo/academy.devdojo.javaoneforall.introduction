package academy.devdojo.javaoneforall.javacore.Hinheritance.domain;

//71 - Object Orientation - Inheritance pt 01
//72 - Object Orientation - Inheritance pt 02 - super
//73 - Object Orientation - Inheritance pt 03 - protected
//74 - Object Orientation - Inheritance pt 04 - Constructors
//75 - Object Orientation - Inheritance pt 05 - Initialization order
public class Manager extends Employee {

    private String department;
    static {
        System.out.println("Inside manager static init block");
    }
    {
        System.out.println("Inside manager init block 1");
    }
    {
        System.out.println("Inside manager init block 2");
    }

//We need to add name/Constructor as well for Manager, because is came from employee

    public Manager(String name){
        super(name);
        System.out.println("Inside Manager Constructor");
    }

//The super needs to be the first valid statement

    @Override
    public void print(){
        super.print();
        System.out.println(this.department);
        paymentReport();
    }

    public void paymentReport(){
        System.out.println("The employee "+this.name+" from the department "+this.department +
                " received a salary of "+this.salary);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
