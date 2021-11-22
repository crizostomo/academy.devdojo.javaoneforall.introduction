package academy.devdojo.javaoneforall.javacore.Labstractclasses.domain;

//84 - Object Orientation - Abstract classes pt 01
//85 - Object Orientation - Abstract classes pt 02 - Abstract methods


public class Manager extends Employee{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonusSalary() {
        this.salary = this.salary + this.salary * 0.05;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
