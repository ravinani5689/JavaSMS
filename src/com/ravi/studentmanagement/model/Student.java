package com.ravi.studentmanagement.model;

public class Student {

    private int id;
    private String name;
    private String course;
    private int age;

    public Student(int id, String name, int age, String course) {
        setId(id);
        setName(name);
        setAge(age);
        setCourse(course);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be greater than 0.");
        }
        this.id = id;
    }

    public String getData() {
        return "ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Course: " + course;
    }


    @Override
    public String toString(){
        return getData();
    }
    public String getName() {
        return name;
    }
    //ds
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 120) {
            throw new IllegalArgumentException("Age must be between 1 and 120.");
        }
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        if (course == null || course.trim().isEmpty()) {
            throw new IllegalArgumentException("Course cannot be empty.");
        }
        this.course = course;
    }
}