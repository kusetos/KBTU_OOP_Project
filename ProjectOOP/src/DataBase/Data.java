package DataBase;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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


public class Data implements Serializable{
    
    private static Vector<Employee>employees = new Vector<>();
    private static Vector<Student> students = new Vector<>();

    private static Vector<News> news = new Vector<>();
    private static Vector<Message> messages = new Vector<>();
   // private static Vector<Researcher> researchers;
    private static Vector<Manager> managers = new Vector<>();
    private static Vector<BachelorStudent> bachelorStudents = new Vector<>();
    private static Vector<GraduateStudent> graduateStudents = new Vector<>();
    private static Vector<User> users = new Vector<>();
    private static Vector<Course> courses = new Vector<>();
    private static Vector<Admin> admins = new Vector<>();
    private static Vector<Order> orders = new Vector<>();
    private static Vector<Journal> journals = new Vector<>();

    public static void saveAndSerialize() {
    	serialize(orders);
    }
    	
    private static void serialize(Object o) {
    	try {
    		FileOutputStream fos = new FileOutputStream("DataBase/testData.bin");
    		ObjectOutputStream oos = new ObjectOutputStream(fos);
    		oos.writeObject(o);
    		oos.close();
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
    
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
