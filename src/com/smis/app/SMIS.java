package com.smis.app;

import com.smis.model.Student;
import com.smis.model.Professor;
import com.smis.model.Person;

import java.util.List;

public class SMIS {
    public static void main(String[] args) {
        // Object instantiation
        Student student = new Student("Andrea de Luna", 31, "108910", 9.5);
        Professor professor = new Professor("Gustavo Alfredo Valdes Gonzalez", 33, "PROGRAMACIÓN ORIENTADA A OBJETOS");

        // Methods use
        student.showStudentInfo();
        professor.showProfessorInfo();

        List<Person> people = List.of(student, professor);

        for (Person p : people) {
            p.showRole();
        }
    }
}
