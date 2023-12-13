package Entities;

import java.util.Vector;

import DataBase.Data;
import People.Student;
import People.Teacher;

public class Course {
    private Teacher teacher;
    private int credits;
    private String description;
    private String courseName;
    private String courseCode;
    Vector<Student> currentStudents = new Vector<Student>();  //vector for storing list of students at the course
    private Data data;
    private Journal journal;

    public Course(){
        
    }

    public Course(Teacher teacher, int credits, String description, String courseName, String courseCode, Data data){
        this.teacher = teacher;
        this.credits = credits;
        this.description = description;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.data = data;
    }

    //getter and setter for teacher
    public Teacher getTeacher() {
        return this.teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    //getter and setter for credits
    public int getCredits() {
        return this.credits;
    }
    public void setCredits(Integer credits) {
        this.credits = credits;
    }
    
    //getter and setter for desription
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    //getter and setter for courseName
    public String getCourseName() {
        return this.courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    //getter and setter for courseCode
    public String getCourseCode() {
        return this.courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    //get all students that are studying this course
    public Vector<Student> getCurrentStudents() {
        return new Vector<Student>(currentStudents);
    }

    //add new student to the course
    public boolean addStudent(Student student) {
        if (currentStudents.isEmpty()) { //add student if there is no student
            currentStudents.add(student);
            return true;
        } else {
            if (currentStudents.contains(student)){
                return false; //student already exists, avoid adding duplicate
            }

            //student not found, add it
            currentStudents.add(student);
            return true;
        }
    }

    //getter and setter for data
    public Data getData() {
        return this.data;
    }
    
    public void setData(Data data) {
        this.data = data;
    }
    
    //getter and setter for Journal. NEED TO UPDATE
    public Journal getJournal() {
        return this.journal;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }
    
    //   Operations                                  
    
}