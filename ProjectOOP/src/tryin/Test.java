package tryin;

import People.*;
import ResearcherStuff.ResearchPaper;
import Entities.*;
import Enumerators.*;

import java.util.*;
public class Test {


	public static void main(String[] args) {
		Student pakita = new Student("akitap", "pakita2023", new Date(),
				"87478335971", "pakita@email.com", "Pakita", "Shamoi", "22B030448", 2, 0.0, 30, Faculty.FIT, "Information system");
		
		Teacher atsushi = new Teacher("atsushibest", "passwordtohard", new Date(), 
				"2203413", "teacheratsushi@kbtu.kz", "Atsushi", "Black", 5500000, new Date(),TeacherType.PROFESSOR);
		
	     Course course1 = new Course(atsushi, 4, "Принципы Программирования 1", "ПП1", "CODE101");
	     Course course2 = new Course(atsushi, 4, "Теория Вероятностей, Статистика", "Статистика", "CODE102");
	     Course course3 = new Course(atsushi, 4, "Research Methods", "RSM", "CODE103");
	     
	     pakita.addCourse(course3);
	     
	     course3.addStudent(pakita);
	     
	     atsushi.addCourse(course3);
	     
	    System.out.println(pakita.getIsResearcher());
	    
	    if(!pakita.getIsResearcher()) {
	    	System.out.println(pakita.toString() + "Not researcher");
	    }else {
	    	System.out.println(pakita.toString() + "Is researcher");
	    	
	    }
	    
	    Manager manager = new Manager();
	    manager.sendMessage(manager, "Hello BRO how are you");
//	    atsushi.putMarks(pakita,course2, 7.0, 3);
	    
	    pakita.setPoints(course3, 1.0, 1);
	    pakita.setPoints(course3, 2.0, 1);
	    pakita.setPoints(course3, 4.0, 2);
	    pakita.viewTranscript();
	    pakita.setIsResearcher(true);
	    atsushi.setIsResearcher(true);
	    ResearchPaper p1 = new ResearchPaper("AAAAAAAA", new Date(), pakita, 10, "NewYorkTimes", "CICICICIC", new DiplomaProject());
	    ResearchPaper p2 = new ResearchPaper("BBBBBBBB", new Date(), pakita, 999, "News", "DDIIDDIDI", new DiplomaProject());
	    
	    pakita.researchPapers.addElement(p1);
	    pakita.researchPapers.addElement(p2);
	    
	    System.out.println(pakita.printPapers("1"));
	    
	    
	    News news1 = new News(new Date(), "Bomba", "SSSSSSSSSSSSSSSS", manager);
	    News news2 = new News(new Date(), "BASAVYI", "LLLLLLLL", manager);
	    
	    news1.addComment(new Comment("AHAHAHHAHAHA"));
	    manager.news.addElement(news1);
	    manager.news.addElement(news2);
	    
	    System.out.println(manager.viewNews());
	    System.out.println();
	    
	    atsushi.sendMessage(manager, "Hello BRO how are you");
	    System.out.println(manager.viewMessages());
	    
	

}
}
