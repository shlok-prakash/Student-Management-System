package com.studentapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.exit;

public class Student {

    private String name;
    private int age;
    private String studentId;
    private List<String> courses;

    public Student(String name, int age, String studentId) {
        super();
        if (validateAge(age) && validateName(name) && validateStudentId(studentId)) {
            this.age = age;
            this.studentId = studentId;
            this.name = name;
            courses = new ArrayList<String>(); //Initialization of courses!!
        }
    }

    public void enrollCourse(String Course){
        if(validateCourseName(Course)) {
            if (!courses.contains(Course)) {
                courses.add(Course);
                System.out.printf("Student is enrolled to %s successfully!!%n", Course);
            } else {
                System.err.println("Student is already enrolled to the course " + Course);
                exit(0);
            }
        }
    }

    public boolean validateCourseName(String course){
        if(course.equalsIgnoreCase("Java")||course.equalsIgnoreCase("DSA")||course.equalsIgnoreCase("Devops")){
            return true;
        }else{
            System.err.println("Invalid Course name "+ course +", Please select courses from the list!! [Java,DSA,Devops]");
            return false;
        }
    }

    public void printStudentInfo(){
        System.out.println("========= Student Data =========");
        System.out.println("Student Name: " + name);
        System.out.println("Student Id: " + studentId);
        System.out.println("Student age: " + age);
        System.out.println("Enrolled For: " + courses);
        System.out.println("================================");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", courses=" + courses +
                '}';
    }

    //Validation Methods
    public boolean validateAge(int age){
        if(age>=19 && age<=35){
            return  true;
        }else{
            System.err.println("Invalid Student Age!!! Student to be between 19 and 35");
            return false;
        }
    }

    public Boolean validateName(String name){
        String nameRegex = "^[a-zA-Z\\s]+$";
        Pattern namePattern = Pattern.compile(nameRegex);
        Matcher nameMatcher =  namePattern.matcher(name);
        if(nameMatcher.matches()){
            return true;
        }else{
            System.err.println("Invalid name !!! Please enter alphabets only");
            return false;
        }
    }

    private boolean validateStudentId(String studentId) {
        String studentIdRegex = "S-\\d+$";
        Pattern studentIdPattern = Pattern.compile(studentIdRegex);
        Matcher studentIdMatcher = studentIdPattern.matcher(studentId);
        if(studentIdMatcher.matches()){
            return true;
        }else{
            System.err.println("Invalid StudentId !!! Enter a Valid Student Id, Use the format 'S-<number>'");
            return false;
                    }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public List<String> getCourses() {
        return courses;
    }
}
