package DataAccess;
import Model.Student;
import Common.Validation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentDao {
    private static List<Student> studentsList;

    public StudentDao() {
        studentsList = new ArrayList<>();
    }
    public void addStudent() {
        System.out.println("Please input student information ");
        System.out.print("Name: ");
        String name = Validation.checkInputString();
        System.out.print("Classes: ");
        String classes = Validation.checkInputString();
        System.out.print("Mark: ");
        float mark = Validation.checkInputFloat();
        studentsList.add(new Student(name, mark, classes));
    }

    public void print() {
        if (studentsList.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        Collections.sort(studentsList);
        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println("--------Student " + i + 1 + "--------");
            System.out.println("Name: " + studentsList.get(i).getName());
            System.out.println("Classes: " + studentsList.get(i).getClasses());
            System.out.println("Mark: " + studentsList.get(i).getMark());
        }
    }
}
