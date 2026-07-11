package com.ravi.studentmanagement;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.ravi.studentmanagement.model.Student;
import com.ravi.studentmanagement.service.StudentService;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {

            try {

                System.out.println("\n===== Student Management System =====");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Search Student");
                System.out.println("4. Update Student");
                System.out.println("5. Delete Student");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:

                        try {

                            System.out.print("Enter ID: ");
                            int id = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter Name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter Age: ");
                            int age = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter Course: ");
                            String course = sc.nextLine();

                            Student student = new Student(id, name, age, course);
                            service.addStudent(student);

                        } catch (InputMismatchException e) {

                            System.out.println("Invalid input. Please enter valid numbers.");
                            sc.nextLine();

                        } catch (IllegalArgumentException e) {

                            System.out.println(e.getMessage());

                        }

                        break;

                    case 2:

                        service.viewStudent();
                        break;

                    case 3:

                        try {

                            System.out.print("Enter Student ID: ");
                            int searchId = sc.nextInt();
                            sc.nextLine();

                            Student foundStudent = service.searchStudent(searchId);

                            if (foundStudent != null) {
                                System.out.println("\nStudent Found");
                                System.out.println(foundStudent);
                            } else {
                                System.out.println("Student not found.");
                            }

                        } catch (InputMismatchException e) {

                            System.out.println("Invalid ID.");
                            sc.nextLine();

                        }

                        break;

                    case 4:

                        try {

                            System.out.print("Enter Student ID to Update: ");
                            int updateId = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter New Name: ");
                            String newName = sc.nextLine();

                            System.out.print("Enter New Age: ");
                            int newAge = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter New Course: ");
                            String newCourse = sc.nextLine();

                            service.updateStudent(updateId, newName, newAge, newCourse);

                        } catch (InputMismatchException e) {

                            System.out.println("Invalid input. Please enter valid numbers.");
                            sc.nextLine();

                        } catch (IllegalArgumentException e) {

                            System.out.println(e.getMessage());

                        }

                        break;

                    case 5:

                        try {

                            System.out.print("Enter Student ID to Delete: ");
                            int deleteId = sc.nextInt();
                            sc.nextLine();

                            service.deleteStudent(deleteId);

                        } catch (InputMismatchException e) {

                            System.out.println("Invalid ID.");
                            sc.nextLine();

                        }

                        break;

                    case 6:

                        System.out.print("Are you sure you want to exit? (Yes/No): ");
                        String answer = sc.nextLine();

                        if (answer.equalsIgnoreCase("Yes")) {
                            System.out.println("Thank you for using Student Management System.");
                            sc.close();
                            return;
                        }

                        break;

                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 6.");
                }

            } catch (InputMismatchException e) {

                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine();

            } finally {

                System.out.println("-------------------------------------");

            }

        }

    }
}