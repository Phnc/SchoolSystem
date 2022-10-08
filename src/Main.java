import school.system.beans.Student;
import school.system.repository.StudentRepository;

public class Main {
    public static void main(String[] args) {
        Student.setCourseName("Orientação a Objetos");
        System.out.println(Student.getCourseName());

        StudentRepository repository = new StudentRepository();

        Student student = new Student();
        student.setName("Uiliamis");
        student.setGrade1(10);
        student.setGrade2(6.5);
        student.setGrade3(8.9);

        System.out.println(repository.AddStudent(student));

        System.out.println(repository.FindByName("Uiliamis"));

        repository.PrintStudentReport();

        System.out.println(repository.RemoveStudent(student));

        repository.PrintStudentReport();

    }
}