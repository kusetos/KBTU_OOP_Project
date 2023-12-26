package DataBase;

import java.io.*;
import java.util.Vector;

import Entities.*;
import People.*;


public class Data implements Serializable{
    
    private static Vector<Employee>employees = new Vector<>();
    private static Vector<Student> students = new Vector<>();
    private static Vector<Teacher> teachers = new Vector<>();

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
    	//people
    	//serialize(users, "SerializableObjects/users.bin");
    	//serialize(students, "SerializableObjects/students.bin");
    	serialize(employees, "SerializableObjects/employees.bin");
    	serialize(managers, "SerializableObjects/managers.bin");
    	serialize(bachelorStudents, "SerializableObjects/bachelorStudents.bin");
    	serialize(graduateStudents, "SerializableObjects/graduateStudents.bin");
    	serialize(teachers, "SerializableObjects/teachers.bin");
    	
    	//entities
    	serialize(courses, "SerializableObjects/graduateStudents.bin");
    	serialize(orders, "SerializableObjects/orders.bin");
    	serialize(news, "SerializableObjects/news.bin");
    	serialize(messages, "SerializableObjects/messages.bin");
    	serialize(journals, "SerializableObjects/journals.bin");
    	
    }
    
    @SuppressWarnings("unchecked")
	public static void loadAndDeserialize() throws ClassNotFoundException {
    	
    	employees = (Vector<Employee>) deserialize("SerializableObjects/employees.bin");
		managers = (Vector<Manager>) deserialize("SerializableObjects/managers.bin");
		bachelorStudents = (Vector<BachelorStudent>) deserialize("SerializableObjects/bachelorStudents.bin");
		graduateStudents = (Vector<GraduateStudent>) deserialize("SerializableObjects/graduateStudents.bin");
		teachers = (Vector<Teacher>) deserialize("SerializableObjects/teachers.bin");
		courses = (Vector<Course>) deserialize("SerializableObjects/courses.bin");
		news = (Vector<News>) deserialize("SerializableObjects/news.bin");
		messages = (Vector<Message>) deserialize("SerializableObjects/messages.bin");
		journals = (Vector<Journal>) deserialize("SerializableObjects/journals.bin");
		
    }
    
    private static Object deserialize(String file) throws ClassNotFoundException {
    	try {
    		FileInputStream fis = new FileInputStream(file);
    		ObjectInputStream ois = new ObjectInputStream(fis);
    		
    		return ois.readObject();
    	}catch(IOException e) {
    	e.printStackTrace();
    	}
		return file;
    }
    	
    private static void serialize(Object o, String file) {
    	try {
    		FileOutputStream fos = new FileOutputStream(file);
    		ObjectOutputStream oos = new ObjectOutputStream(fos);
    		oos.writeObject(o);
    		oos.close();
    		fos.close();
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
