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
    private static Vector<Admin> admins;
    //private static Vector<Researcher> researchers;
    private static Vector<Manager> managers;
    private static Vector<BachelorStudent> bachelorStudents;
    private static Vector<GraduateStudent> graduateStudents;
    private static Vector<User> users;
    private static Vector<Course> course;
    private static Vector<Admin> admin;
    private static Vector<Manager> manager;
    private static Vector<Order> orders;
    private static Vector<Message> message;
    private static Vector<Journal> journal;

    public static Vector<Order> getOrders() {
        return orders;
    }
    
    public static  Vector<Employee> getEmployees() {
        return this.employees;
    }
    
    
    public static  getStudents() {
        return this.students;
    }
    
    private  setStudents(invalid students) {
        this.students = students;
    }
    
    public static  getJournals() {
        return this.Journals;
    }
    
    public static  setJournals(invalid Journals) {
        this.Journals = Journals;
    }
    /*
    private  getOrders() {
        return this.orders;
    }
    */
    public static  setOrders(invalid orders) {
        this.orders = orders;
    }
    
    public static News getNews() {
        return this.news;
    }
    
    public static News setNews(News news) {
        this.news = news;
    }
    
    public static Message getMessages() {
        return this.messages;
    }
    
    public static Message setMessages(Message messages) {
        this.messages = messages;
    }
    
    public static Admin getAdmins() {
        return this.admins;
    }
    
    public static Admin setAdmins(Admin admins) {
        this.admins = admins;
    }
    
    public static Researcher getResearchers() {
        return this.researchers;
    }
    
    public static Researcher setResearchers(Researcher researchers) {
        this.researchers = researchers;
    }
    
    public static Manager getManagers() {
        return this.managers;
    }
    
    public static Manager setManagers(Manager managers) {
        this.managers = managers;
    }
    
    public static BachelorStudent getBachelorStudents() {
        return this.bachelorStudents;
    }
    
    public static BachelorStudent setBachelorStudents(BachelorStudent bachelorStudents) {
        this.bachelorStudents = bachelorStudents;
    }
    
    public static GraduateStudent getGraduateStudents() {
        return this.graduateStudents;
    }
    
    public static GraduateStudent setGraduateStudents(GraduateStudent graduateStudents) {
        this.graduateStudents = graduateStudents;
    }
    
    public static User getUsers() {
        return this.users;
    }
    
    public static User setUsers(User users) {
        this.users = users;
    }
    
    public Course getCourse() {
        return this.course;
    }
    
    
    public Journal getJournal() {
        return this.journal;
    }
    
    public Journal setJournal(Journal journal) {
        this.journal = journal;
    }
    
    public Manager getManager() {
        return this.manager;
    }
    
    public Manager setManager(Manager manager) {
        this.manager = manager;
    }
    /*
    public Order getOrder() {
        return this.order;
    }
    */
    public static void addOrder(Order order) {
    	orders.add(order);
    }
    
    public Vector<Admin> getAdmin() {
        return this.admin;
    }
    

    
    public Vector<Message> getMessage() {
        return this.message;
    }

}
