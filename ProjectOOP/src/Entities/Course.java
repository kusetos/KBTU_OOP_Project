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

    public Teacher getTeacher() {
        return this.teacher;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    

    public int getCredits() {
        return this.credits;
    }
    
    public void setCredits(Integer credits) {
        this.credits = credits;
    }
    

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    

    public String getCourseName() {
        return this.courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    

    public String getCourseCode() {
        return this.courseCode;
    }
    
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    

    public Vector<Student> getCurrentStudents() {
        return new Vector<Student>(currentStudents);
    }

    public String addStudent(Student student) {
        if (currentStudents.isEmpty()) {
            currentStudents.add(student);
            return "Student successfully added";
        } else {
            for (Student existingStudent : currentStudents) {
                if (existingStudent.equals(student)) { // Student already exists, avoid adding duplicate
                    return "Student cannot be added";
                }
            }
            // Student not found, add it
            currentStudents.add(student);
            return "Student successfully added";
        }
    }

    
    public Data getData() {
        return this.data;
    }
    
    public void setData(Data data) {
        this.data = data;
    }
    
    public Journal getJournal() {
        return this.journal;
    }

    public void setJournal(Journal journal) {
        this.journal = journal;
    }
    
    
    

    //                          Operations                                  
    
    
}