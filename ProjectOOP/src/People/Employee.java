package People;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import Entities.Message;

public class Employee extends User {
    
    private double Salary;
    private Date hireDate;
    private Vector<Message> sentMessages = new Vector<>(); // Store sent messages

    public Employee() {
    
    }
    
    public Employee(String username, String password, Date birthDate, String phoneNumber, String email, String name, String surname, 
    			double Salary, Date hireDate) {
    	super(username, password, birthDate, phoneNumber, email, name, surname);
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
        Message newMessage = new Message(recipient, text, this); // Create message only when needed
        sentMessages.addElement(newMessage); // Store sent message
    }
}
