package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Employee;


public class CustomerExercise {
    public static void main(String [] args) {
        Employee employee = new Employee();
        employee.name = "Naruto";
        employee.age = 20;
        employee.salaries = new double[]{987.55, 1250.50, 1150.55};

        employee.print();

    }
}
