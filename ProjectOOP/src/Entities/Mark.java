package Entities;

import People.Student;

public class Mark {
    
    private Student student;
    private Course course;
    private Lesson lesson;
    private int points;

    public Mark(){}

    public Mark(Student student, Course course, Lesson lesson, int points){
        this.student = student;
        this.course = course;
        this.lesson = lesson;
        this.points = points;
    }
    
    //getter and setter for student
    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
    //getter and setter for course
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    
    //getter and setter for lesson
    public Lesson getLesson() {
        return this.lesson;
    }
    
    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
    
    //getter and setter for points
    public int getPoints() {
        return this.points;
    }
}