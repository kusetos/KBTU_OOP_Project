package Entities;

import java.util.Date;

import DataBase.Data;
import People.Employee;
import People.Manager;

//each empolyee can send massages to each other

public class Message{
    
    private Employee recipientEmployee;
    
    private String text;

    private Date messageDate;
   
    
    public Message(Employee recipientEmployee, String text) { //Constructors
    	
		this.recipientEmployee = recipientEmployee;
		this.text = text;
		this.messageDate = new Date();
	}
    public Message() {  
    	messageDate = new Date();
    }
    
	public String getText() { // Getter FOR TEXT
		return text;
	}
	
	public boolean changeText(String text) { // Setter for TEXT
		
		if(text.equals(null) || text.equals("")) { // CHECKS IF IT EMPTY
			return false;
		}else
			this.text= text;
		
		return true;
	}
	
	public Employee getRecipientEmploayee() { // GETTER FOR recipient
		return recipientEmployee;
	}
	
	public void setRecipient(Employee newRecipient) { //SETTER FOR RECIPIENT
		this.recipientEmployee = newRecipient;
	}
	
	
	
    
    
}
