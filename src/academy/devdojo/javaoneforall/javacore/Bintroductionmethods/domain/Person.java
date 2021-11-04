package academy.devdojo.javaoneforall.javacore.Bintroductionmethods.domain;

public class Person {
    private String name;
    private Integer age;

    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(Integer age){
        if(age < 0){
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }
}
