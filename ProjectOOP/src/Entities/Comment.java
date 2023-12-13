package Entities;

import java.util.Date;

public class Comment{

	private String text;
	
	private Date commentDate;
	
	public Comment(String text) {
		this.text = text;
	}
	public Comment() {
		
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
}
