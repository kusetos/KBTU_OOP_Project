package Entities;

import java.util.Date;
import java.util.Vector;

import DataBase.Data;
import People.Manager;


public class News {

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
    
    public String getTitile() { //	GETTER FOR TITLE
        return this.title;
    }

    public void setTitile(String titile) { //	SETTER FOR TITLE
        this.title = titile;
    }
    
    public String getText() {//	   GETTER FOR TEXT
        return this.text;
    }

    public void setText(String text) {//	SETTER FOR TEXT
        this.text = text;
    }
    
    
}
