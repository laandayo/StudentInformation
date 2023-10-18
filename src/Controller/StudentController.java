package Controller;
import Common.Validation;
import Repository.StudentRepository;

public class StudentController {
    static StudentRepository sr = new StudentRepository();

    public static void display() {
        sr.addStudent();
        while (true) {
            System.out.print("Do you want to enter more student information?(Y/N): ");
            if (Validation.checkInputYN()) {
                sr.addStudent();
            } else {
                break;
            }
        }
        sr.print();
    }
}
