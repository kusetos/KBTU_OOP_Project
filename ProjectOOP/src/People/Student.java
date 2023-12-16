package People;
import java.util.Date;

import java.util.Objects;
import java.util.Vector;

import Entities.Course;
import Enumerators.Faculty;
import Enumerators.Organization;
public class Student extends User{
	String id;
	int yearOfStudy;
	int totalCredits;
	Vector<Course> courses = new Vector<>();
	double gpa;
	int creditLimit;
	Faculty faculty;
	String speciality;
	Organization org;
	
	public Student() {
		super();
	}
	
	public Student(String username, String password, Date birthDate, String phoneNumber, String email, String name,
			String surname, String id, int yearOfStudy, double gpa, int creditLimit, Faculty faculty, String speciality, Organization org) {
		super(username, password, birthDate, phoneNumber, email, name, surname);
		this.id = id;
		this.yearOfStudy = yearOfStudy;
		this.gpa = gpa;
		this.creditLimit = creditLimit;
		this.faculty = faculty;
		this.speciality = speciality;
		this.org = org;
	}
	

		
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public int getTotalCredits() {
		return totalCredits;
	}

	public void setTotalCredits(int totalCredits) {
		this.totalCredits = totalCredits;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public Organization getOrganization() {
		return org;
	}
	public void setOrganization(Organization org) {
		this.org = org;
	}
	
	public String viewCourses() {
		String strCourses = new String();
		for(Course c : courses) {
			strCourses += c.toString();
			strCourses += '\n';
		}
		return strCourses;
	}
	public void registerForCourses(Course course) {
		manager.approveStudentRegistration(course);
	}
	public Teacher viewTeacherOfCourse(Course course) {
		return course.getTeacher();
	}
	public Transcript getTranscript() {
		return transcript;
	}
	public void rateTeachers(Teacher teacher, int rate) {
		teacher.addRate(rate);
	}
	public Organization studentOrganization() {
		return this.studentOrganization();
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
