package Entities;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Vector;

import DataBase.Data;
import Enumerators.Grade;
import People.Student;

public class Journal {
	//using HashMap to store Course and Lesson information to make them relatable to each other
    private HashMap<Course, Lesson> journal;

    public Journal(Course course, Lesson lesson){
    	journal = new HashMap<>();
		this.journal.put(course, lesson);
	}
    
    public Journal() {
        journal = new HashMap<>();
    }
    
    //adding new record about course and lesson
    public void addRecord(Course course, Lesson lesson) {
        journal.put(course, lesson);
    }
    
    //getter for courses
	public Set<Course> getCourses() {
        return journal.keySet();
    }
	
	//get record from hashMap by Course
	public String getRecordByCourse(Course course) {
		Lesson record;
		record = journal.get(course);
		return "Course: " + course + "\n Lesson" + record;
	}
    
	//getter for lessons
    public Collection<Lesson> getLessons() {
        return journal.values();
    }
    
    public HashMap<Course, Lesson> getJournal() {
    	return journal;
    }
}