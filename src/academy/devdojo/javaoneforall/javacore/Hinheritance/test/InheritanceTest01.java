package academy.devdojo.javaoneforall.javacore.Hinheritance.test;

//71 - Object Orientation - Inheritance pt 01

import academy.devdojo.javaoneforall.javacore.Hinheritance.domain.Address;
import academy.devdojo.javaoneforall.javacore.Hinheritance.domain.Employee;
import academy.devdojo.javaoneforall.javacore.Hinheritance.domain.Manager;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("12th ave");
        address.setZipcode("1321-xxx");
        Employee employee = new Employee();
        employee.setName("Vegeta");
        employee.setSocialSecurityNumber("Plus than 8000");
        employee.setSalary(8000);
        employee.setAddress(address);
        employee.print();
        System.out.println("-------------------------");
        Manager manager = new Manager();
        manager.setName("Mestre Kame");
        manager.setSocialSecurityNumber("Less than 8000");
        manager.setSalary(80000);
        manager.setAddress(address);
        manager.setDepartment("Training");
        manager.print();
    }
}
