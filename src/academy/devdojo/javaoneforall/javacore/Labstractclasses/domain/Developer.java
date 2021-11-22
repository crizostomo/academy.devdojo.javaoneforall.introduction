package academy.devdojo.javaoneforall.javacore.Labstractclasses.domain;

//85 - Object Orientation - Abstract classes pt 02 - Abstract methods


public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonusSalary() {
        this.salary = this.salary + this.salary * 0.1;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
