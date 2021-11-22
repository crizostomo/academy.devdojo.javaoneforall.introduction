package academy.devdojo.javaoneforall.javacore.Labstractclasses.test;

//84 - Object Orientation - Abstract classes pt 01
//85 - Object Orientation - Abstract classes pt 02 - Abstract methods
//86 - Object Orientation - Abstract classes pt 03 - Abstract methods rules

import academy.devdojo.javaoneforall.javacore.Labstractclasses.domain.Developer;
import academy.devdojo.javaoneforall.javacore.Labstractclasses.domain.Employee;
import academy.devdojo.javaoneforall.javacore.Labstractclasses.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Nami", 5000);
        Developer developer = new Developer("Sasuke", 12000);

        System.out.println(manager);
        System.out.println(developer);
        manager.print();
        developer.print();
    }
}
