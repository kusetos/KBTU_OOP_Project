package Entities;

import java.util.Date;

import DataBase.Data;
import People.Employee;
import People.Manager;

//each empolyee can send massages to each other

public class Message{
    
    private Employee recipient;
    
    private Employee sender;
    
    private String text;

    private Date messageDate;
   
    
    public Message(Employee recipientEmployee, String text, Employee recipient) { //Constructors
    	
		this.recipient = recipient;
		this.text = text;
		this.messageDate = new Date();
	}
    public Message() {  
    	messageDate = new Date();
    }
    
    // Getter FOR TEXT
	public String getText() { 
		return text;
	}
	
	//Getter and SETTER FOR RECIPIENT RECIPIENT
	public Employee getRecipient() { 
		return recipient;
	}
	public void setRecipient(Employee newRecipient) { 
		this.recipient = newRecipient;
	}
	
	// GETTER FOR SENDER
	public Employee getSender() { 
		return sender;
	}
	
	 //GETTER FOR MassageDate
	public Date getDate() {
		return messageDate;
	}
	
	 // Setter for TEXT
	public boolean changeText(String text) {
		
		if(text.equals(null) || text.equals("")) { // CHECKS IF IT EMPTY
			return false;
		}else
			this.text= text;
		
		return true;
	}
	@Override
	public String toString() {
		return "Message [recipient=" + recipient + "\n sender=" + sender + "\n text=" + text + ", messageDate="
				+ messageDate.toString() + "]";
	}

	
	
    
    
}
