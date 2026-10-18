package com.smis.model;

public class Professor extends Person {
    private String subject;

    // Constructor
    public Professor(String name, int age, String subject) {
        super(name, age); // Call to Person constructor
        this.subject = subject;
    }

    // Getters and setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void showRole() {
        System.out.println("Role: Professor");
    }

    // Specific method
    public void showProfessorInfo() {
        showInfo(); // inherited method from Person
        System.out.println("Subject: " + subject);
    }
}
