package academy.devdojo.javaoneforall.javacore.Gassociation.domain;

public class ProfessorExercise {

    private String name;
    private String researchField;
    private SeminarExercise[] seminars;

//A professor can minister one or several seminars

    public ProfessorExercise(String name) {
        this.name = name;
    }

    public ProfessorExercise(String name, String researchField) {
        this.name = name;
        this.researchField = researchField;
    }

    public ProfessorExercise(String name, String researchField, SeminarExercise[] seminars) {
        this.name = name;
        this.researchField = researchField;
        this.seminars = seminars;
    }

    public void print() {
        System.out.println("-----------");
        System.out.println("Professor's name - " + this.name + " - Research field " + this.researchField);
        if (seminars == null) return;
        System.out.println("#######");
        for (SeminarExercise seminar : seminars) {
            System.out.println("Seminar title is " + seminar.getTitle());
            System.out.println("Happening at " + seminar.getPlace().getAddress());
            if (seminar.getStudentExercises() == null || seminar.getStudentExercises().length > 0) continue;
            System.out.println("***********");
            for (StudentExercise studentExercise : seminar.getStudentExercises()) {
                System.out.println("Student name - " + studentExercise.getName() + "age- " + studentExercise.getAge());
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public SeminarExercise[] getSeminars() {
        return seminars;
    }

    public void setSeminars(SeminarExercise[] seminars) {
        this.seminars = seminars;
    }
}
