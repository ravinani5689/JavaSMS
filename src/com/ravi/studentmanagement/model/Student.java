package com.ravi.studentmanagement.model;

public class Student {

    private int id;
    private String name;
    private String course;
    private int age;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return  "id: " + this.id +
                ", Name: " + this.name +
                ", Age: " + this.age +
                ", Course: " + this.course;
    }

    // Alternatively, use:
    // @Override
    // public String toString() {
    //     return "Name: " + this.name +
    //            ", Age: " + this.age +
    //            ", Course: " + this.course;
    // }

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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}