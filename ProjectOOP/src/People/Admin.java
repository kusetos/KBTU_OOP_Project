package People;

import java.io.Serializable;
import java.util.*;
import DataBase.Data;
import Enumerators.*;

public class Admin extends Employee implements Serializable{
	
	public Admin() {
		
	}
	
	public Admin(String username, String password, Date birthDate, String phoneNumber, String email, String name, String surname, 
			double Salary, Date hireDate) {
		super(username, password, birthDate, phoneNumber, email, name, surname, Salary, hireDate);
	}
	
	//add user
	public void addUser(User user) {
		Data.addUser(user);
	}
	
	public void addAdmin(Admin admin) {
		Data.addAdmin(admin);
	}
	
	public void addTeacher(Teacher teacher) {
        Data.addTeacher(teacher);
	}
	
	public void addBachelorStudent(BachelorStudent student) {

        Data.addBachelorStudent(student);
    }
	public void addGraduateStudent(GraduateStudent student) {

		Data.addGraduateStudent(student);
	}
	
	public void addManager(Manager manager) {
        Data.addManager(manager);
	}
	
	public void addEmployee(Employee empl) {
		Data.addEmployee(empl);
	}
	
	public void addTechSupportSpecialist(TechSupportSpecialist techSupport) {
        Data.addTechSupport(techSupport);
    }
	
	//remove users
	public void removeUser(User user) {
		Data.removeUser(user);
	}
	
	public void removeAdmin(Admin admin) {
		Data.removeAdmin(admin);
	}
	
	public void removeTeacher(Teacher teacher) {
		Data.removeTeacher(teacher);
	}
	
	public void removeBachelorStudent(BachelorStudent student) {
		Data.removeBachelorStudents(student);
	}
	
	public void removeGraduateStudent(GraduateStudent student) {
		Data.removeGraduateStudents(student);
	}
	
	public void removeManager(Manager manager) {
		Data.removeManager(manager);
	}
	
	public void removeEmployee(Employee employee) {
		Data.removeUser(employee);
	}
	
	
	public void removeTechSupport(TechSupportSpecialist techSup) {
		Data.removeTechSupport(techSup);
	}
	
	public void updateUser(User user) {
			
	}
	
    public void viewLogs() {
        System.out.println("nothing");
    }
}
