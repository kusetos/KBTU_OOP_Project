package Entities;

import java.util.Date;

import People.User;

public class Comment{

	private User sender;
	
	private String text;
	
	private Date commentDate;
	
	public Comment(String text) {
		this.text = text;
		commentDate = new Date();
	}
	public Comment() {
		commentDate = new Date();
	}
	
	public User getSender() { // GETTER for SENDER
		return sender;
	}
	
	public Date getCommentDate() { // GETTER FOR COMMNET DATE
		return commentDate;
	}
	public String getText() { // Getter FOR TEXT
		return text;
	}
	
	public boolean changeText(String text) {
    	if(text.equals(null) || text.equals("")) { // CHECKS IF IT EMPTY
    		return false;
    	}else
    		this.text= text;
    	
    	return true;
	}
	@Override
	public String toString() {
		return "Comment [sender=" + sender + ", text=" + text + ", commentDate=" + commentDate + "]";
	}
		
}
