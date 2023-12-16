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
    
    private  Vector<Employee> getEmployees() {
        return this.employees;
    }
    
    private  void setEmployees(invalid employees) {
        this.employees = employees;
    }
    
    private  getStudents() {
        return this.students;
    }
    
    private  setStudents(invalid students) {
        this.students = students;
    }
    
    private  getJournals() {
        return this.Journals;
    }
    
    private  setJournals(invalid Journals) {
        this.Journals = Journals;
    }
    
    private  getOrders() {
        return this.orders;
    }
    
    private  setOrders(invalid orders) {
        this.orders = orders;
    }
    
    private News getNews() {
        return this.news;
    }
    
    private News setNews(News news) {
        this.news = news;
    }
    
    private Message getMessages() {
        return this.messages;
    }
    
    private Message setMessages(Message messages) {
        this.messages = messages;
    }
    
    private Admin getAdmins() {
        return this.admins;
    }
    
    private Admin setAdmins(Admin admins) {
        this.admins = admins;
    }
    
    private Researcher getResearchers() {
        return this.researchers;
    }
    
    private Researcher setResearchers(Researcher researchers) {
        this.researchers = researchers;
    }
    
    private Manager getManagers() {
        return this.managers;
    }
    
    private Manager setManagers(Manager managers) {
        this.managers = managers;
    }
    
    private BachelorStudent getBachelorStudents() {
        return this.bachelorStudents;
    }
    
    private BachelorStudent setBachelorStudents(BachelorStudent bachelorStudents) {
        this.bachelorStudents = bachelorStudents;
    }
    
    private GraduateStudent getGraduateStudents() {
        return this.graduateStudents;
    }
    
    private GraduateStudent setGraduateStudents(GraduateStudent graduateStudents) {
        this.graduateStudents = graduateStudents;
    }
    
    private User getUsers() {
        return this.users;
    }
    
    private User setUsers(User users) {
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
    
    public Order getOrder() {
        return this.order;
    }
    
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