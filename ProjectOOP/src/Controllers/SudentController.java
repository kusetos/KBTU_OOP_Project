package Controllers;

import java.text.ParseException;
import java.util.Scanner;

import Entities.Course;
import People.Student;

public class SudentController {
	Scanner scanner = new Scanner(System.in);
	String answer;
	Student student = new Student();
	
	public void mainMenu() throws ParseException {
		
		System.out.flush();
		System.out.println("---===KBTU UNIVERSITY SYSTEM===---");
		System.out.println("---===========Student==========---\n");
		System.out.println("Chose operation: \n");
		System.out.println("1  :  View Courses");
		System.out.println("2  :  Register for Courses");
		System.out.println("3  :  View info about teacher of a specific course");
		System.out.println("4  :  View Marks");
		System.out.println("5  :  View Transcript");
		System.out.println("6  :  Rate teachers");
		System.out.println("7  :  Student organizations");
		System.out.println("8  :  show Info");
		System.out.println("9  :  calculateGPA");
		System.out.println("10  :  more");
		System.out.println("0  :  logging out");
		
		answer = scanner.next();
		switch (answer) {
		case "1": {
			student.viewCourses();
		}
		case "2": {
			student.registerForCourses(new Course());
		}
		case "3": {
			student.viewTeacherOfCourse(new Course());
		}
		case "4": {
			student.getMarks();
		}
		case "5": {
			student.viewTranscript();
		}
		case "6": {
			student.viewTeacherOfCourse(new Course());
		}
		case "7": {
			student.studentOrganization();
		}
		case "8": {
			student.calculateGPA();
		}
		case "9": {
			student.showInfo();
		}
		case "0": {
			
			student.setIsResearcher(false);
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + answer);
		}
		 
		
	}
}
