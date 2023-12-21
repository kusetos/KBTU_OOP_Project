package DataBase;

import java.util.Vector;

import Entities.Course;
import Entities.Journal;
import Entities.Message;
import Entities.News;
import Entities.Order;
import People.Admin;
import People.BachelorStudent;
import People.Employee;
import People.GraduateStudent;
import People.Manager;
import People.Student;
import People.User;


public class Data {
    
    private static Vector<Employee>employees;
    private static Vector<Student> students;

    private static Vector<News> news;
    private static Vector<Message> messages;
   // private static Vector<Researcher> researchers;
    private static Vector<Manager> managers;
    private static Vector<BachelorStudent> bachelorStudents;
    private static Vector<GraduateStudent> graduateStudents;
    private static Vector<User> users;
    private static Vector<Course> courses;
    private static Vector<Admin> admins;
    private static Vector<Order> orders;
    private static Vector<Journal> journals;

    public static Vector<Course> getCourses(){
    	return courses;
    }

    public static  Vector<Employee> getEmployees() {
        return employees;
    }
    
    
    public static Vector<Student> getStudents() {
        return students;
    }

    
    public static Vector<Journal> getJournals() {
        return journals;
    }
    
    
    public static Vector<Order> getOrders() {
        return orders;
    }
    
    public static Vector<News> getNews() {
        return news;
    }

    public static Vector<Message> getMessages() {
        return messages;
    }

    
    public static Vector<Admin> getAdmins() {
        return admins;
    }

    
	/*
	 * public static Vector<Researcher> getResearchers() { return researchers; }
	 */

    
    public static Vector<Manager> getManagers() {
        return managers;
    }

    
    public static Vector<BachelorStudent> getBachelorStudents() {
        return bachelorStudents;
    }

    
    public static Vector<GraduateStudent> getGraduateStudents() {
        return graduateStudents;
    }

    public static Vector<User> getUsers() {
        return users;
    }
    


    /*
    public Order getOrder() {
        return this.order;
    }
    */
    public static void addOrder(Order order) {
    	orders.add(order);
    }
    

}
