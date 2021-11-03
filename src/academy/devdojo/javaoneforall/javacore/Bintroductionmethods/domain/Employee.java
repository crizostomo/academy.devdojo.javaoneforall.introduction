package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Employee {
    public String name;
    public int age;
    public double salary;

    public void print(Employee employee) {
        System.out.println("\n------------------------");
        System.out.println(employee.name);
        System.out.println(employee.age);
        System.out.println(employee.salary);
    }
}
