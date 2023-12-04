public class StudentGrades {
    private String value1;
    private String value2;
    private int value3;


    public StudentGrades(String value1, String value2, int value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;

    }
    public String toString() {
        return "StudentGrades: " + "name: " + value1 + ",  discipline: " + value2  + ",  grade: " + value3;
    }

    public String getDiscipline() {
        return null;
    }

    public Integer getGrade() {
        return null;
    }
    public String getName(){
        return null;
    }
}
