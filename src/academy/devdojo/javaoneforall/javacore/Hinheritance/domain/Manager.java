package academy.devdojo.javaoneforall.javacore.Hinheritance.domain;

//71 - Object Orientation - Inheritance pt 01

public class Manager extends Employee {

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
