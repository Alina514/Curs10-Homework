import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private List<StudentGrades> studentGradesList;

    public Classroom() {
        this.studentGradesList = studentGradesList;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> gradesForDiscipline = new ArrayList<>();

        for (StudentGrades studentGrades : studentGradesList) {
            if (discipline.equals(studentGrades.getDiscipline())) {
                gradesForDiscipline.add(studentGrades.getGrade());
            }
        }

        return gradesForDiscipline;
    }
}
