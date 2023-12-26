package People;

import java.util.Date;
import java.util.Vector;
import Entities.Course;
import Entities.Lesson;
import Enumerators.TeacherType;

public class Teacher extends Employee {
    
    private Vector<Course> courses;
    private Vector<Student> courseStudents;
    private String compliant;
	private TeacherType teacherType;

    public Teacher() {
    	
    }

    public Teacher(String username, String password, Date birthDate, String phoneNumber, String email, String name, String surname, 
    		double Salary, Date hireDate, TeacherType teacherType) {
        super(username, password, birthDate, phoneNumber, email, name, surname, Salary, hireDate);
        this.setTeacherType(teacherType);
    }
    
    // we renamed viewCourse as getCourse and divided manageCourse as setCourse, addCourse and removeCourse
    public Vector<Course> getCourses() {
        return this.courses;
    }
    
    public void setCourses(Vector<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }
    
    public void removeCourse(Course course) {
        if(courses.isEmpty() || courses.equals(null)) {}
        else {
    		courses.remove(course);
    	}
    }
    
    //to view Students at the course
    public String viewStudents() {
        String strStudents = new String();
        for(Student c: courseStudents){
            strStudents += c.toString() + "\n";
        }
        return strStudents;
    }
    
    //marking our student
    public void putMarks(Student student, int point) {
        for(Student c: courseStudents){
            if (c == student) c.addMark(point);
        }
    }

    //getter as sending and setter for compliant
    public String sendCompliant() {
        return compliant;
    }

    public void setCompliant(String compliant){
        this.compliant = compliant;
    }

	public TeacherType getTeacherType() {
		return teacherType;
	}

	public void setTeacherType(TeacherType teacherType) {
		this.teacherType = teacherType;
	}
}
