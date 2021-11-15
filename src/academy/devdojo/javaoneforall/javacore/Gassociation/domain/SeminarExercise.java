package academy.devdojo.javaoneforall.javacore.Gassociation.domain;

public class SeminarExercise {
    private String title;
    private StudentExercise[] studentExercises;
//A Seminar can have zero or several students
    private PlaceExercise place;

    public SeminarExercise(String title, PlaceExercise place) {
        this.title = title;
        this.place = place;
    }

    public SeminarExercise(String title, StudentExercise[] studentExercises, PlaceExercise place) {
        this.title = title;
        this.studentExercises = studentExercises;
        this.place = place;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StudentExercise[] getStudentExercises() {
        return studentExercises;
    }

    public void setStudentExercises(StudentExercise[] studentExercises) {
        this.studentExercises = studentExercises;
    }

    public PlaceExercise getPlace() {
        return place;
    }

    public void setPlace(PlaceExercise place) {
        this.place = place;
    }
}
