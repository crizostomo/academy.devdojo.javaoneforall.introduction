package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Customer {
    public String name;
    public int age;
    public double[] salaries;

    public void print(){
        System.out.println(name);
        System.out.println(age);
        for(double salary: salaries) {
            System.out.print(salary + " ");
        }
    }
}
