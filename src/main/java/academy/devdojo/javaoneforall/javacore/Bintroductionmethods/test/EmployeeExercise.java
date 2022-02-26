package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain.Employee;


public class EmployeeExercise {
    public static void main(String [] args) {
        Employee employee = new Employee();
        employee.setName ("Naruto");
        employee.setAge(20);
        employee.setSalaries(new double[]{987.55, 1250.50, 1150.55});

        employee.print();

        System.out.println(employee.getAverage());

    }
}
