package People;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Vector;

import DataBase.Data;
import Entities.Course;
import Entities.News;
import Entities.Order;
import Enumerators.ManagerType;
import Comparators.StudentGPAComparator;
import Comparators.UserNameComparator;

public class Manager extends Employee {
    
    private ManagerType managerType;
    private Vector<News> news = new Vector<>();
    private Data data;
    
    //getter and setter for managerType
    private ManagerType getManagerType(){
        return managerType;
    }
    
    private void setManagerType(ManagerType managerType){
        this.managerType = managerType;
    }

    //                          Operations                                  
    
    public void approveStudentRegistration(Course course, Student student) {
        //TODO
    }
    
    public void createStatisticalReports(Student student) {
        //TODO
    }
    
    public void assignCoursesToTeachers(Course course, Teacher teacher) {
        //TODO
    }
    
    //we divided managing new into 2. posting news and deleting news. Next one is Posting news
    public void postNews(Date newsDate, String title, String text) {
        News newPost = new News(newsDate, title, text, this); 
        news.addElement(newPost); 
    }

    //deleting news
    public void deleteNews(News newNews){
        news.removeElement(newNews);
    }

    //viewing all news
    public Vector<News> viewNews(){
        return news;
    }
    
    //view info about student
    public void viewInfoAboutStudents(Student student) {
        student.showInfo();
    }

    //view info about student sorted by gpa
    public Vector<Student> viewInfoAboutStudentsByGPA(boolean ascending) {
        Vector<Student> students;
        students = data.getStudents();
        Collections.sort(students, StudentGPAComparator);
        //sorting them ascending by GPA if the boolean is true and descending if false
        if (ascending)
            return students;
        else {
            Collections.reverse(students);
            return students;
        }
    }

    //view info about student sorted by name
    public Vector<Student> viewInfoAboutStudentsByName(boolean alphabetically) {
        Vector<Student> students;
        students = data.getStudents();
        Collections.sort(students, UserNameComparator);
        //sorting them alphabetically if the boolean is true and reverse if false
        if (alphabetically){
            return students;
        } else {
            Collections.reverse(students);
            return students;
        }
    }

    //view info about teacher
    public void viewInfoAboutTeachers(Teacher teacher) {
        teacher.showInfo();
    }

    //view info about teacher by name
    public Vector<Teacher> viewInfoAboutTeachersByName(Teacher teacher, boolean alphabetically) {
        Vector<Teacher> teachers;
        teachers = data.getTeacher();
        Collections.sort(teachers, UserNameComparator);
        //sorting them alphabetically if the boolean is true and reverse if false
        if (alphabetically){
            return teachers;
        } else {
            Collections.reverse(teachers);
            return teachers;
        }
    }
    
    public Vector<Order> viewRequestsByEmployees() {
        Vector<Order> orders;
        orders = data.getOrders();
        return orders;
    }
}