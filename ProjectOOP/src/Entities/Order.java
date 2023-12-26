package Entities;

import java.util.Date;

import DataBase.Data;
import People.TechSupportSpecialist;
import People.User;
import Enumerators.ITOrderStatus;

public class Order {
    

	private ITOrderStatus status;
    
    private String description;
    
    private Date sentTime;
    
    private User sender;

    
    public Order(String description) {
    	
    	this.status = ITOrderStatus.NEW;;
    	this.description = description;
    	this.sentTime = new Date();

    }
    public Order(String description, User sender) {
    	
    	this.status = ITOrderStatus.NEW;;
    	this.description = description;
    	this.sentTime = new Date();
    	this.sender = sender;
    }
    public Order() {
    	this.status = ITOrderStatus.NEW;
    	this.sentTime = new Date();
    }
    
    public String getDescription() { // GETTER ТЕКСТ ЗАПРОСА DESCRIPTION
        return this.description;
    }

    public void setDescription(String description) { // SETTER ТЕКСТА
        this.description = description;
    }

    public ITOrderStatus getStatus() { // GETTER FOR STATUS
    	return this.status;
    }
    
    public void viewStatus() { // Watched status become OLD.
    	this.status = ITOrderStatus.OLD;
    }
    
    public Date getDate() {   // GETTER FOR sended TIME
        return this.sentTime;
    }
    
    public User getSender() { // GETTER for SENDER
    	return sender;
    }
    public void setSender(User sender) {
    	this.sender = sender;
    }

}
