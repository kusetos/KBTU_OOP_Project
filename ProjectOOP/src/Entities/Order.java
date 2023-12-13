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

    
    public Order(String description, Date sentTime) {
    	
    	this.status = ITOrderStatus.NEW;;
    	this.description = description;
    	this.sentTime = sentTime;

    }
    public Order() {
    	this.status = ITOrderStatus.NEW;
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
    public Date getSentTime() {   // GETTER FOR TIME
        return this.sentTime;
    }

}
