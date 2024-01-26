package Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Vector;
import People.Manager;


public class News implements Serializable{

    private Date newsDate;
    
    private String title;

    private String text;
    
    private Vector<Comment> comments;    

    public News(Date newsDate, String title, String text, Manager manager) {
		super();
		this.newsDate = newsDate;
		this.title = title;
		this.text = text;
	}
    public News() {
    	
    }

	public Date getNewsDate() { //	GETTER for DATE OF NEWS
        return this.newsDate;
    }
    
    public String getTitle() { //	GETTER FOR TITLE
        return this.title;
    }

    public boolean setTitie(String title) { //	SETTER FOR TITLE
    	
    	if(title.equals(null) || title.equals("")) { // CHECKS IF IT EMPTY
    		return false;
    	}else 
    		this.title = title;
    	
    	return true;   
    }
    
    public String getText() {//	   GETTER FOR TEXT
        return this.text;
    }

    public boolean setText(String text) {//	SETTER FOR TEXT
    	
    	if(text.equals(null) || text.equals("")) { // CHECKS IF IT EMPTY
    		return false;
    	}else 
    		this.text= text;
    	
    	return true;
    }
    
    public boolean addComment(Comment comment) {
    	if(comment.getText() == null || comment.getText() == "") { // CHECK IF COMMENT IS EMPTY
    		return false;
    	}else {
    		if(comments == null) {
    			comments = new Vector<Comment>(); //	CREATE NEW COMMENT VECTOR IF IT NOT EXIST
    		}
    		comments.add(comment);	//	ADD COMMENT	
    		return true;
    	}
    }
	@Override
	public String toString() {
		return "News [newsDate=" + newsDate.toString() + ", title=" + title + ", text=" + text + ", comments=" + comments ;
	}
    
    
    
    
}
