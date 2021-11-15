package academy.devdojo.javaoneforall.javacore.Gassociation.domain;

public class StudentExercise {
    private String name;
    private int age;
    private SeminarExercise seminar;
//A student can have only one seminar

    public StudentExercise(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public StudentExercise(String name, int age, SeminarExercise seminar) {
        this.name = name;
        this.age = age;
        this.seminar = seminar;
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

    public SeminarExercise getSeminar() {
        return seminar;
    }

    public void setSeminar(SeminarExercise seminar) {
        this.seminar = seminar;
    }
}
