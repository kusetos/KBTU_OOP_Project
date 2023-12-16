package People;

import java.util.ArrayList;
import java.util.Date;
import Entities.Message;

public class Employee extends User {
    
    private double Salary;
    private Date hireDate;
    private ArrayList<Message> sentMessages = new ArrayList<>(); // Store sent messages

    // Constructor to initialize fields
    public Employee(double Salary, Date hireDate) {
        this.Salary = Salary;
        this.hireDate = hireDate;
    }

    //getter and setter for salary
    public double getSalary() {
        return this.Salary;
    }
    
    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    
    //getter and setter for salary
    public Date getHireDate() {
        return this.hireDate;
    }
    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void sendMessage(Employee recipient, String text) {
        Message newMessage = new Message(recipient, text); // Create message only when needed
        sentMessages.add(newMessage); // Store sent message
    }
}