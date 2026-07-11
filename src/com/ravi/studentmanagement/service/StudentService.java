package com.ravi.studentmanagement.service;

import com.ravi.studentmanagement.model.Student;

import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> studentList;

    public StudentService() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        for (Student s : studentList) {
            if (s.getId() == student.getId()) {
                System.out.println("Error: Student with this ID already exists.");
                return;
            }
        }

        studentList.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewStudent() {
        if (studentList.isEmpty()) {
            System.out.println("No students found");
        } else {
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    public Student searchStudent(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(int id, String name, int age, String course) {
        Student student = searchStudent(id);

        if (student != null) {
            student.setName(name);
            student.setAge(age);
            student.setCourse(course);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(int id) {
        boolean removed = studentList.removeIf(student -> student.getId() == id);

        if (removed) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
}