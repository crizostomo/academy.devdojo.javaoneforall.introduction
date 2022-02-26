package academy.devdojo.javaoneforall.javacore.Labstractclasses.domain;

//84 - Object Orientation - Abstract classes pt 01
//85 - Object Orientation - Abstract classes pt 02 - Abstract methods
//86 - Object Orientation - Abstract classes pt 03 - Abstract methods rules

public abstract class Employee extends Person {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.calculateBonusSalary();
    }

    public abstract void calculateBonusSalary();

    @Override
    public void print() {
        System.out.println("Printing...");
    }
    //Abstract method means that whoever is extending the class will be forced
    //to provide implementation by the method

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
