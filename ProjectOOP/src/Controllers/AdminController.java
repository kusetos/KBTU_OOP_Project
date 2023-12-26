package Controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import Enumerators.*;

import DataBase.Data;
import People.*;
public class AdminController {
	Scanner scanner = new Scanner(System.in);
	String answer;
	Admin admin = new Admin();
	String username;
	String password;
	String birthday;
	Date birthDate;
	String phone;
	String email;
	String name;
	String surname;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public void mainMenu() throws ParseException {
		System.out.flush();
		System.out.println("---===KBTU UNIVERSITY SYSTEM===---");
		System.out.println("---============Admin===========---\n");
		System.out.println("Chose operation: \n"+
				"1	:	Add somebody\n" +
				"2	:	Remove somebody\n" +
				"3	:	Update users\n"	+
				"4	:	View logs\n" +
				"0	:	Logging out\n"
				);
		System.out.println();
		answer = scanner.nextLine();
		System.out.flush();
		switch (answer) {
		case "1": {
			addMenu();
		}
		case "2":{
			removeMenu();
		}
		case "3":{
			System.err.println("Write User's username to update it:");
			Data.saveAndSerialize();
			answer = scanner.next();
			admin.updateUser(admin);
			System.out.println("Users updated");
			
		}
		case "4":{
			admin.viewLogs();
		}
		case "0":{
			System.out.println("You have Logged Out!!!");
		}
		default:
			mainMenu();
			
		}
		

	}
	public void addMenu() throws ParseException {
		System.out.flush();
		System.out.println("---===KBTU UNIVERSITY SYSTEM===---");
		System.out.println("---============Admin===========---\n");
		System.out.println("Chose operation: \n"+ 
		"1	:	Create User\n" +
		"2 	: 	Create Admin\n" +
		"3  :	Create Teacher\n"+
		"4  :	Create Bachelor Student\n"+
		"5  :   Create Graduate Student\n" +
		"6  :	Create Manager\n" +
		"7  :   Create Employee\n" +
		"8  :   Create Tech Support Specialist\n" +
		"0  :   Return to Main Menu\n"
				);
		answer = scanner.nextLine();
		System.out.flush();
		
		switch (answer) {
		case "1": {
			
			fillUser();
			
			admin.addUser(new User(username, password, birthDate, phone, email, name, surname));
			System.out.println("user added");
			break;
		}
		case "2":{
			System.out.println("Adding new Admin:");
			
			fillUser();
			System.out.println("Write salary:");
			Double salary = scanner.nextDouble();
			Date hireDate = new Date();
			
			admin.addAdmin(new Admin(username, password, birthDate, phone, email, name, surname, salary, hireDate));
			System.out.println("user added");
			
		}
		case "3":{
			System.out.println("Adding new Teacher:");
			
			fillUser();
			System.out.println("Write salary:");
			Double salary = scanner.nextDouble();
			Date hireDate = new Date();
			System.out.println("Chose teacher type: \n" + 
				    "1 : TUTOR\n" +
				    "2 : LECTOR\n" +
				    "3 : PROFESSOR\n"
					);
			
			TeacherType teacherType = TeacherType.TUTOR;
			String teachType = scanner.nextLine();
			
			if(teachType == "1"){
				teacherType = TeacherType.TUTOR;
			}else if(teachType == "2"){
				teacherType = TeacherType.LECTOR;
			}else if(teachType == "3"){
				teacherType = TeacherType.PROFESSOR;
			}
			
			admin.addTeacher(new Teacher(username, password, birthDate, phone, email, name, surname, salary, hireDate, teacherType));
			System.out.println("user added");
			break;
		}
		case "4":{
			System.out.println("Adding new Bachelor Student:");
			fillUser();
			System.out.println("Write id:");

			String id = scanner.nextLine();
			System.out.println("Write year of study:");
			int studyYear = scanner.nextInt();
			double gpa = 0;
			int creditLimit = 21;
			Faculty faculty = Faculty.FIT;
			System.out.println("Write speciality:");
			String speciality = scanner.nextLine();
			
			admin.addBachelorStudent(new BachelorStudent(username, password, birthDate, phone,
					email, name, surname, id, studyYear, gpa, creditLimit, faculty, speciality));
			System.out.println("user added");
			break;
		}
		case "5":{
			System.out.println("Adding new Graduate Student:");

			fillUser();
			System.out.println("Write id:");

			String id = scanner.nextLine();
			System.out.println("Write year of study:");
			int studyYear = scanner.nextInt();
			double gpa = 0;
			int creditLimit = 21;
			Faculty faculty = Faculty.FIT;
			System.out.println("Write speciality:");
			String speciality = scanner.nextLine();
			
			admin.addGraduateStudent(new GraduateStudent(username, password, birthDate, phone,
					email, name, surname, id, studyYear, gpa, creditLimit, faculty, speciality));
			System.out.println("user added");
			break;
		}
		case "6":{
			System.out.println("Adding new Manager");
			
			break;
			
		}
		case "7":{
			System.out.println("Adding new Employee");
			
			fillUser();
			System.out.println("Write salary:");
			Double salary = scanner.nextDouble();
			Date hireDate = new Date();
			admin.addEmployee(new Employee(username, password, birthDate, phone, email, name, surname, salary, hireDate));
			System.out.println("user added");
			break;
		}case "8":{
			System.out.println("Adding new Tech Support Specialist");
			fillUser();
			System.out.println("Write salary:");
			Double salary = scanner.nextDouble();
			Date hireDate = new Date();
			admin.addTechSupportSpecialist(new TechSupportSpecialist(username, password, 
					birthDate, phone, email, name, surname, salary, hireDate));
			System.out.println("user added");
			break;
		}
		case "9":{
			mainMenu();
		}
		default:
			mainMenu();
		}
		mainMenu();
		
	}
	public void removeMenu() {
		System.out.println("---===KBTU UNIVERSITY SYSTEM===---");
		System.out.println("---============Admin===========---\n");
		System.out.println("Chose operation: \n "+ 
				"1	:	Remove User" +
				"2 	: 	Remove Admin" +
				"3  :	Remove Teacher"+
				"4  :	Remove Bachelor Student"+
				"5  :   Remove Graduate Student" +
				"6  :	Remove Manager" +
				"7  :   Remove Employee" +
				"8  :   Remove Tech Support Specialist" +
				"9  :   Return to Main Menu"
				);
		scanner.next();
		try {
			mainMenu();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void fillUser() throws ParseException {
		
		System.out.println("Write username:");
		 username = scanner.nextLine();
		System.out.println("Write password:");
		 password = scanner.nextLine();
		System.out.println("Write birth date(dd/MM/yyyy):");
		 birthday = scanner.nextLine();
        birthDate = dateFormat.parse(birthday);

		System.out.println("Write phone number:");
		phone = scanner.nextLine();

		email = username + "@kbtu.kz";
		System.out.println("Write name:");
		name = scanner.nextLine();
		System.out.println("Write surname:");
		surname = scanner.nextLine();
	}
}
