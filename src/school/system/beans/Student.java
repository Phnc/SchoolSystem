package school.system.beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

    private String Name;

    private double Grade1;
    private double Grade2;
    private double Grade3;

    public static String CourseName;

    private double Mean;

    private String StudentSituation;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Student(String name, double grade1, double grade2, double grade3, double mean, String studentSituation) {
        Name = name;
        Grade1 = grade1;
        Grade2 = grade2;
        Grade3 = grade3;
        Mean = mean;
        StudentSituation = studentSituation;
    }

    public Student() {
    }

    public double getGrade1() {
        return Grade1;
    }

    public void setGrade1(double grade1) {
        Grade1 = grade1;
    }

    public double getGrade2() {
        return Grade2;
    }

    public void setGrade2(double grade2) {
        Grade2 = grade2;
    }

    public double getGrade3() {
        return Grade3;
    }

    public void setGrade3(double grade3) {
        Grade3 = grade3;
    }

    public static String getCourseName() {
        return CourseName;
    }

    public static void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public double getMean() {
        this.setMean();
        return Mean;
    }

    public void setMean() {
        List<Double> grades = Arrays.asList(Grade1, Grade2, Grade3);

        List<Double> orderedGrades = grades.stream().sorted().collect(Collectors.toList());

        this.Mean = (orderedGrades.get(1) + orderedGrades.get(2))/2;
    }

    public String getStudentSituation() {
        this.setStudentSituation();

        return StudentSituation;
    }

    public void setStudentSituation() {
        double mean = this.getMean();

        if(mean >= 6){
            this.StudentSituation = "Aprovado";
        } else if (mean >= 4 && mean <6) {
            this.StudentSituation = "Em Recuperação";
        }
        else {
            this.StudentSituation = "Reprovado";
        }

    }


    @Override
    public String toString() {
        return this.getName()
                + " | " + this.getGrade1()
                + " | " + this.getGrade2()
                + " | " + this.getGrade3()
                + " | " + this.getMean()
                + " | " + this.getStudentSituation();
    }
}
