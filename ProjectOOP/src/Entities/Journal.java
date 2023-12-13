package Entities;

import java.util.Vector;

import DataBase.Data;
import People.Student;

/**
* @generated
*/
public class Journal {
    

    private Vector<Course> courses;
    
    private Vector<Lesson> lessons;

    private Course course;

    private Lesson lesson;    
    
    

    public Journal(Vector<Course> courses, Vector<Lesson> lessons, Course course, Lesson lesson) {
		super();
		this.courses = courses;
		this.lessons = lessons;
		this.course = course;
		this.lesson = lesson;

	}
    
    public Journal() {
    	
    }
    
	private Vector<Course> getCourses() {
        return this.courses;
    }
    
    /**
    * @generated
    */
    private Vector<Course> setCourses(Vector<Course> courses) {
        this.courses = courses;
    }
    
    
    /**
    * @generated
    */
    private Vector<Lesson> getLessons() {
        return this.lessons;
    }
    
    /**
    * @generated
    */
    private Vector<Lesson> setLessons(Vector<Lesson> lessons) {
        this.lessons = lessons;
    }
    
    
    
    /**
    * @generated
    */
    public Data getData() {
        return this.data;
    }
    
    /**
    * @generated
    */
    public Data setData(Data data) {
        this.data = data;
    }
    
    
    /**
    * @generated
    */
    public Course getCourse() {
        return this.course;
    }
    
    /**
    * @generated
    */
    public Course setCourse(Course course) {
        this.course = course;
    }
    
    
    /**
    * @generated
    */
    public Lesson getLesson() {
        return this.lesson;
    }
    
    /**
    * @generated
    */
    public Lesson setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
    
    
    /**
    * @generated
    */
    public Student getStudent() {
        return this.student;
    }
    
    /**
    * @generated
    */
    public Student setStudent(Student student) {
        this.student = student;
    }
    
    
    
}
