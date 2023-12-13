package Entities;

import java.util.Date;

public class Comment{

	private String text;
	
	private Date commentDate;
	
	public Comment(String text) {
		this.text = text;
	}
	
	public Date getCommentDate() { // GETTER FOR COMMNET DATE
		return commentDate;
	}
	public String getText() { // Getter FOR TEXT
		return text;
	}
}
