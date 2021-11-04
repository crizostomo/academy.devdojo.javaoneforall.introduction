package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double average;

    public void print(){
        System.out.println(name);
        System.out.println(age);
        if(salaries != null) {
            for (double salary : salaries) {
                System.out.print(salary + " ");
            }
        }
        calculateAndPrintAverageSalary();
    }

    public void calculateAndPrintAverageSalary() {
        if (salaries == null) return;

        for (double salary : salaries) {
            average += salary;
        }
        average /= salaries.length;
        System.out.println("\nThe average salary is " + average);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public double getAverage() {
        return average;
    }

}
