package People;

import java.util.Date;
import DataBase.Data;
import Enumerators.Faculty;
import Enumerators.ManagerType;
import Enumerators.Organization;
import Enumerators.TeacherType;

public class Admin extends Employee{
	
	public Admin() {
		
	}
	
	public Admin(String username, String password, Date birthDate, String phoneNumber, String email, String name, String surname, 
			double Salary, Date hireDate) {
		super(username, password, birthDate, phoneNumber, email, name, surname, Salary, hireDate);
	}
	
	//add user
	public void addTeacher(String username, String password, Date birthDate, String phoneNumber, String email, String name, 
			String surname, double Salary, Date hireDate, TeacherType teacherType) {
        Teacher teacher = new Teacher(username, password, birthDate, phoneNumber, email, name, surname, Salary, hireDate, teacherType);
        Data.users.add(teacher);
	}
	
	public void addStudent(String username, String password, Date birthDate, String phoneNumber, String email, String name,
			String surname, String id, int yearOfStudy, double gpa, int creditLimit, Faculty faculty, String speciality, Organization org) {
        Student student = new Student(username, password, birthDate, phoneNumber, email, name,
    			surname, id, yearOfStudy, gpa, creditLimit, faculty, speciality, org);
        Data.users.add(student);
    }
	
	public void addManager(String username, String password, Date birthDate, String phoneNumber, String email, String name, 
			String surname, double Salary, Date hireDate, ManagerType managerType) {
        Manager manager = new Manager(username, password, birthDate, phoneNumber, email, name, surname, Salary, hireDate, managerType);
        Data.users.add(manager);
	}
	
	public void addTechSupportSpecialist(String username, String password, Date birthDate, String phoneNumber, String email, String name, 
			String surname, double Salary, Date hireDate) {
        TechSupportSpecialist techSupportSpecialist = new TechSupportSpecialist(username, password, birthDate, phoneNumber, email, name, surname, Salary, hireDate);
        Data.users.add(techSupportSpecialist);
    }
	
	//remove user
	public void removeUser(String username, String name, String surname) {
    	for(User u : Data.users) {
    		if(u.getUsername().equals(username) && u.getName().equals(name) && u.getSurname().equals(surname)) {
    			Data.users.remove(u);
    		}
    	}
    }
	
    public void viewLogs() {
        //TODO
    }
}
