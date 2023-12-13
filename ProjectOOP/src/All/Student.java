package All;
import java.util.Objects;
import java.util.Vector;

import Entities.Course;
import Enumerators.Faculty;
public class Student extends User{
	String id;
	int yearOfStudy;
	int totalCredits;
	Vector<Course> courses = new Vector<>();
	double gpa;
	int creditLimit;
	Faculty faculty;
	String speciality;
	
	public Student() {
		this.yearOfStudy = 0;
		this.gpa = 0;
		this.creditLimit = 0;
		this.faculty = null;
		this.speciality = null;
		this.id = null;
	}
	
	public Student(String username, String password, String birthDate, String phoneNumber, String email, String name,
			String surname, String id, int yearOfStudy, double gpa, int creditLimit, Faculty faculty, String speciality) {
		super(username, password, birthDate, phoneNumber, email, name, surname);
		this.id = id;
		this.yearOfStudy = yearOfStudy;
		this.gpa = gpa;
		this.creditLimit = creditLimit;
		this.faculty = faculty;
		this.speciality = speciality;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;		
	}
	
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public String getSpeciality() {
		return speciality;
	}
	
	public Faculty getFaculty() {
		return faculty;
	}
	
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	
	public String getId() {
		return id;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o))return false;
		Student s = (Student)o;
		return Objects.equals(this.id, s.id) && Objects.equals(this.faculty, s.faculty) && Objects.equals(this.speciality, s.speciality) && this.yearOfStudy == s.yearOfStudy;
	}
	
	public int hashCode() {
		return Objects.hash(super.hashCode(), id, speciality, faculty);
	}
	
}
