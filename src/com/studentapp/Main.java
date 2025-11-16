package com.studentapp;

import java.util.*;


public class Main {

    private static List<Student> studentList;
    private static Scanner scanner;

    public static void main(String[] args) {

        System.out.println("************ STUDENT MANAGEMENT SYSTEM ************");


        studentList = new ArrayList<>();
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("************ Welcome ************");
            System.out.println("Select an Option....");
            System.out.println("1. Register a Student");
            System.out.println("2. Find a student with StudentId");
            System.out.println("3. List all the Student Information");
            System.out.println("4. List all the Student Information in Sorted Order");
            System.out.println("5. Exit");

            System.out.println("Enter your Option : ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    enrollStudent(scanner);
                    break;
                case 2:
                    findStudentById(scanner);
                    break;
                case 3:
                    printAllStudentData();
                    break;
                case 4:
                    sortByName();
                    break;
                case 5:
                    exit();
                    break;
                default:
                    System.err.println("Invalid Option selected!! ... Enter between 1 to 5");
            }
        }
    }

    private static void findStudentById(Scanner scanner){
        System.out.println("Enter the Student Id ");
        String studentId = scanner.next();
        Student studentFound=null;
        try{
            studentFound  = studentList.stream().filter(stu -> stu.getStudentId().equalsIgnoreCase(studentId))
                    .findFirst()
                    .orElseThrow(()->new RuntimeException("No Data Found !!!"));
        }catch (RuntimeException e){
            System.err.println("Student with Id "+studentId + " not Found!!");
        }

        studentFound.printStudentInfo();

    }

    private static void exit(){
        System.out.println();
        System.exit(0);
    }

    private static void enrollStudent(Scanner sc){

        System.out.print("Enter the Name of the Student : ");
        String studentName = sc.next();
        scanner.nextLine();

        System.out.print("Enter the age of the Student : ");
        int studentAge = sc.nextInt();

        System.out.print("Enter the Id of the Student : ");
        String studentId = sc.next();
        scanner.nextLine();

        Student newStudent = new Student(studentName,studentAge,studentId);
        studentList.add(newStudent);

        while(true) {

            System.out.println("Enter the course to be enrolled !!! Type Done to exit");
            String courseName = sc.next();
            if(courseName.equalsIgnoreCase("done")){
                break;
            }
            newStudent.enrollCourse(courseName);
        }
        newStudent.printStudentInfo();

    }

    private static void printAllStudentData(){
        if(!studentList.isEmpty()) {
            System.out.println("------------------- Print All Student Information -------------------");
            for (Student student : studentList) {
                student.printStudentInfo();
            }
            System.out.println("------------------- Print All Student Information -------------------");
        }else{
            System.err.println("Student List is Empty!!! No Student Record Found !!");
        }
    }


    private static void sortByName() {
        Comparator<Student> studentNameComparator =  (o1,o2) -> o1.getName().compareTo(o2.getName());
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
        Collections.sort(studentList, studentNameComparator);
        System.out.println(studentList);
    }

    public static Student findStudentById(String studentId){

        Student result=null;
        try{
            result  = studentList.stream().filter(stu -> stu.getStudentId().equalsIgnoreCase(studentId))
                    .findFirst()
                    .orElseThrow(()->new RuntimeException("No Data Found !!!"));
        }catch (RuntimeException e){
            System.err.println("Student with Id "+studentId + " not Found!!");
        }
        return result;
    }
}
