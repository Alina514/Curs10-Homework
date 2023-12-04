import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List< StudentGrades> studentGrades = new ArrayList<>();
        Scanner scanner = new Scanner(new File("File", "Grades.txt"));
        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            studentGrades.add(studentFromLine(line));
        }

        System.out.println(studentGrades);

    }
    private void StudentGrades(String value, String value1, int value2){

    }
    private static StudentGrades studentFromLine(String line){
        String[] values = line.split(Pattern.quote(" | "));
        return new StudentGrades(values[0],values[1], parseInt(values[2]));
    }
    
    Classroom classroom = new Classroom();




}