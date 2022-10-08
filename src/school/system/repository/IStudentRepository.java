package school.system.repository;

import school.system.beans.Student;

public interface IStudentRepository {

    boolean AddStudent(Student student);
    Student FindByName(String studentName);
    boolean RemoveStudent(Student student);
    void PrintStudentReport();

}
