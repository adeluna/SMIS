package com.smis.model;

public abstract class Person {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Métodos getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method show information
    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public abstract void showRole();
}
