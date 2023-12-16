package DataBase;

import Entities.Course;
import Entities.Journal;
import Entities.Message;
import Entities.News;
import Entities.Order;
import People.Admin;
import People.BachelorStudent;
import People.GraduateStudent;
import People.Manager;
import People.User;

/**
* @generated
*/
public class Data {
    
    private  employees;
    private  students;
    private  Journals;
    private  orders;
    private News news;
    private Message messages;
    private Admin admins;
    private Researcher researchers;
    private Manager managers;
    private BachelorStudent bachelorStudents;
    private GraduateStudent graduateStudents;
    private User users;
    private Course course;
    private Admin admin;
    private Manager manager;
    private Order order;
    private Message message;
    private News news2;
    private Journal journal;
    
    private  getEmployees() {
        return this.employees;
    }
    
    private  setEmployees(invalid employees) {
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
    
    public Course setCourse(Course course) {
        this.course = course;
    }
    
    public News getNews2() {
        return this.news2;
    }
    
    public News setNews2(News news2) {
        this.news2 = news2;
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
    
    public Order setOrder(Order order) {
        this.order = order;
    }
    
    public Admin getAdmin() {
        return this.admin;
    }
    
    public Admin setAdmin(Admin admin) {
        this.admin = admin;
    }
    
    public Message getMessage() {
        return this.message;
    }
    
    public Message setMessage(Message message) {
        this.message = message;
    }
}