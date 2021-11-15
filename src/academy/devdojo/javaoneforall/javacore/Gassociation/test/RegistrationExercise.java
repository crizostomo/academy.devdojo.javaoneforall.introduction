package academy.devdojo.javaoneforall.javacore.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.PlaceExercise;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.ProfessorExercise;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.SeminarExercise;
import academy.devdojo.javaoneforall.javacore.Gassociation.domain.StudentExercise;

public class RegistrationExercise {
    public static void main(String[] args) {
        PlaceExercise place = new PlaceExercise("5th Avenue");
        StudentExercise student = new StudentExercise("Luffy", 17);
        StudentExercise student2 = new StudentExercise("Goku", 40);

        StudentExercise[] seminarStudents = {student, student2};
        SeminarExercise seminar = new SeminarExercise("Finding one piece", seminarStudents, place);
        SeminarExercise[] availableSeminars = {seminar};
        ProfessorExercise professor = new ProfessorExercise("White Beard", "Pirates", availableSeminars);

        professor.print();
    }
}
