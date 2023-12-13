package Entities;

import DataBase.Data;
import People.Student;
import People.Teacher;

/**
* @generated
*/
public class Course {
    
    /**
    * @generated
    */
    private Teacher teacher;
    
    /**
    * @generated
    */
    private int credits;
    
    /**
    * @generated
    */
    private String description;
    
    /**
    * @generated
    */
    private String courseName;
    
    /**
    * @generated
    */
    private string courseCode;
    
    /**
    * @generated
    */
    private Student currentStudents;
    
    
    /**
    * @generated
    */
    private Data data;
    
    /**
    * @generated
    */
    private Journal journal;
    
    

    /**
    * @generated
    */
    private Teacher getTeacher() {
        return this.teacher;
    }
    
    /**
    * @generated
    */
    private Teacher setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    
    /**
    * @generated
    */
    private int getCredits() {
        return this.credits;
    }
    
    /**
    * @generated
    */
    private int setCredits(Integer credits) {
        this.credits = credits;
    }
    
    
    /**
    * @generated
    */
    private String getDescription() {
        return this.description;
    }
    
    /**
    * @generated
    */
    private String setDescription(String description) {
        this.description = description;
    }
    
    
    /**
    * @generated
    */
    private String getCourseName() {
        return this.courseName;
    }
    
    /**
    * @generated
    */
    private String setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    
    /**
    * @generated
    */
    private string getCourseCode() {
        return this.courseCode;
    }
    
    /**
    * @generated
    */
    private string setCourseCode(string courseCode) {
        this.courseCode = courseCode;
    }
    
    
    /**
    * @generated
    */
    private Student getCurrentStudents() {
        return this.currentStudents;
    }
    
    /**
    * @generated
    */
    private Student setCurrentStudents(Student currentStudents) {
        this.currentStudents = currentStudents;
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
    public Journal getJournal() {
        return this.journal;
    }
    
    /**
    * @generated
    */
    public Journal setJournal(Journal journal) {
        this.journal = journal;
    }
    
    
    

    //                          Operations                                  
    
    
}
