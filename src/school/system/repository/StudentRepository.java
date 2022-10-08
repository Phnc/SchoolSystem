package school.system.repository;

import school.system.beans.Student;

import java.util.ArrayList;

public class StudentRepository implements IStudentRepository{

    private ArrayList<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    public StudentRepository(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public boolean AddStudent(Student student) {
        return this.students.add(student);
    }

    @Override
    public Student FindByName(String studentName) {
        Student student = this.students.stream()
                .filter(s -> s.getName().equals(studentName))
                .findFirst()
                .orElse(null);
        return student;
    }

    @Override
    public boolean RemoveStudent(Student student) {
        return students.remove(student);
    }

    @Override
    public void PrintStudentReport() {
        System.out.println("Nome | Nota 1 | Nota 2 | Nota 3 | Média | Situação");
        students.forEach(System.out::println);
    }
}
