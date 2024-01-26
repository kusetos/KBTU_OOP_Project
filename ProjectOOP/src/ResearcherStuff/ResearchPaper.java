package ResearcherStuff;

import Entities.*;
import Enumerators.*;

import java.util.*;
import People.*;

public class ResearchPaper implements Cloneable { 
    
    /**
    * @generated
    */
    private String title;
    
    private Date datePublished;
    
    private User author;
    
    private int pages;
    
    private String publisher;
    
    private String citiation;


  
    public ResearchPaper(String title, Date datePublished, User authors, int pages, String publisher,
			String citiation, DiplomaProject diplomaProject) {

		this.title = title;
		this.datePublished = datePublished;
		this.author = authors;
		this.pages = pages;
		this.publisher = publisher;
		this.citiation = citiation;

	}
    public ResearchPaper() {
    	
    }

	public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public Date getDatePublished() {
        return this.datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    public User getAuthors() {
        return this.author;
    }

    public void setAuthors(User author) {
        this.author = author;
    }
   
    public int getPages() {
        return this.pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
    
    public String getPublisher() {
    	return publisher;
    }
    
    public void setPublisher(String publisher) {
    	this.publisher = publisher;
    }

    public String getCitation(Format f) {
    	
    	 if (f == Format.PLAIN_TEXT) {
    		   return String.format("%s, \"%s\", %s, %s.", author.toString(), title, publisher, datePublished);
    		 } else if (f == Format.BIBTEX) {
    		   return String.format("@misc{{citation_key, \n" +
    		                        "  author = {{%s}}, \n" +
    		                        "  title = {{%s}}, \n" +
    		                        "  publisher = {{%s}}, \n" +
    		                        "  year = {{%s}}, \n" +
    		                        "}} \n", author.toString(), title, publisher, datePublished);
    		 } else {
    		   throw new IllegalArgumentException("Invalid format: " + f);
    		 }
    }
	@Override
	public String toString() {
		return "ResearchPaper [title=" + title + ", datePublished=" + datePublished.toString() + ", author=" + author.toString() + ", pages="
				+ pages + ", publisher=" + publisher+ "]";
	}
    
    
}
