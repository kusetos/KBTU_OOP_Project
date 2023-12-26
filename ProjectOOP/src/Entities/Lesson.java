package Entities;

import Enumerators.Language;
import Enumerators.LessonName;
import Enumerators.LessonType;

/**
* @generated
*/
public class Lesson {

    private LessonName lessonName;

    private Course course;

    private Language language;

    private LessonType type;

    private int officeNumber;

    private String code;
    
    public Lesson(LessonName name, Course course, Language language, LessonType type, int officeNumber, String code) {
		super();
		this.lessonName = name;
		this.course = course;
		this.language = language;
		this.type = type;
		this.officeNumber = officeNumber;
		this.code = code;
	}

    public Lesson() {
    	
    }
    // all setters made for admin or managers!!!!!!!!!!!!!!
    
	public LessonName getLessoname() { // GETTOR FOR LESSON NAME
        return this.lessonName;    
    }
    
    public void setName(LessonName name) {//SETTER FOR LESSON NAME
        this.lessonName = name;
    }
    

    public Course getCourse() { //GETTER FOR COURSE
        return this.course;
    }

    public void setCourse(Course course) { // SETTER FOR COURSE
        this.course = course;
    }
    
    public Language getLanguage() {	// GETTER FOR LANGUAGE EN/KZ/RUS
        return this.language;
    }
    

    public void setLanguage(Language language) { //SETTER FOR LANGUAGE
        this.language = language;
    }
    
    public LessonType getType() { // GETTER FOR LESSON TYPE practice/lecture/office hours
        return this.type;
    }
    
    public void setLessonType(LessonType type) { // SETTERS FOR LESSON TYPE
        this.type = type;
    }
    
    public int getOfficeNumber() { // GETTER FOR OFFICE NUMBER
        return this.officeNumber;
    }

    private void setOfficeNumber(int officeNumber) { // SETTER FOR OFFICE NUMBER
        this.officeNumber = officeNumber;
    }
    
   
    private String getCode() { // GETTER FOR CODE
        return this.code;
    }
    
    private void setCode(String code) { // 	SETTER FOR CODE
        this.code = code;
    }
    
    public String toString() {
		return "Lesson [lessonName=" + lessonName + ", courseName=" + course.getCourseName() +
				", language=" + language + ", lessonType=" + type + ", officeNumber=" + officeNumber + ", code=" + code + "]";
	}
    
}
