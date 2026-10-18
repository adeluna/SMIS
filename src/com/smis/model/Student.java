package com.smis.model;

public class Student extends Person {
    private String enrollmentId;
    private double averageGrade;

    // Constructor
    public Student(String name, int age, String enrollmentId, double averageGrade) {
        super(name, age); // Call to Person constructor
        this.enrollmentId = enrollmentId;
        this.averageGrade = averageGrade;
    }

    // Getters and setters
    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public void showRole() {
        System.out.println("Role: Student");
    }

    // Specific method
    public void showStudentInfo() {
        showInfo(); // inherited method from Person
        System.out.println("Enrollment ID: " + enrollmentId + ", Average Grade: " + averageGrade);
    }
}
