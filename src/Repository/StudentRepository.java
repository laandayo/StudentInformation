package Repository;
import DataAccess.StudentDao;

public class StudentRepository implements IStudentRepository{
    private static final StudentDao data = new StudentDao();
    @Override
    public void addStudent() {
        data.addStudent();
    }
    @Override
    public void print() {
        data.print();
    }
}
