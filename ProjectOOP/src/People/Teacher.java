package People;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Vector;
import Entities.Course;
import Enumerators.TeacherType;

public class Teacher extends Employee implements Serializable{
    
    private Vector<Course> courses;
    private Vector<Student> courseStudents;
    private String compliant;
	private TeacherType teacherType;
    private double rate;
    private int numOfRatedStudent = 0;

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
    public void putMarks(Student student, Course course, double point, int typeOfPoints) {
        for(Student c: courseStudents){
            if (c == student) {
                c.setPoints(course, point, typeOfPoints);
            }
        }
    }

    //getter as sending and setter as adding for compliant
    public String sendCompliant() {
        return compliant;
    }

    public void addCompliant(String compliant){
        this.compliant = this.compliant + "\n" + compliant;
    }

    //getter and setter for TeacherType
	public TeacherType getTeacherType() {
		return teacherType;
	}

	public void setTeacherType(TeacherType teacherType) {
		this.teacherType = teacherType;
	}

    //getter for rate
    public double getRate(){
        return rate;
    }

    //rating teacher
    public void addRate(int newRate){
        //checking for being rate in correct diapazone
        if(newRate > 10 || newRate < 0) {
            System.out.println("Rate should be between 10.0 and 0.0 points");
            return;
        }
        //adding rate and getting average value for rating
        numOfRatedStudent++;
        rate = (rate * (numOfRatedStudent - 1) + newRate ) / numOfRatedStudent;
    }

    //showInfo
    public void showInfo(){
        System.out.println("----------- Teacher -----------");
        System.out.println("Full name " + this.getSurname() + " " + this.getName());
        System.out.println("Email " + this.getEmail());
        System.out.println("Avarage rate " + this.getRate());
        System.out.println("Teacher type " + this.getTeacherType());
        System.out.println("Courses " + this.courses);
    }

	//hashCode
	public int hashCode() {
		return Objects.hash(super.hashCode(), courses, numOfRatedStudent, rate, teacherType);
	}

	//equals
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!super.equals(obj)) return false;
		if (getClass() != obj.getClass()) return false;
		Teacher t = (Teacher) obj;
		return Objects.equals(compliant, t.compliant) && Objects.equals(courseStudents, t.courseStudents)
				&& Objects.equals(courses, t.courses) && numOfRatedStudent == t.numOfRatedStudent
				&& Double.doubleToLongBits(rate) == Double.doubleToLongBits(t.rate)
				&& teacherType == t.teacherType;
	}
}
