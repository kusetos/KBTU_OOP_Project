package People;

import java.util.*;

import Comparators.*;
import DataBase.Data;
import Entities.News;
import Entities.Order;
import ResearcherStuff.*;

public class User {
	private String username;
	private String password;
	private Date birthDate;
	private String phoneNumber;
	private String email;
	private String name;
	private String surname;
	
	private boolean isResearcher = false;
	private double hIndex;
	public Vector<ResearchPaper> researchPapers = new Vector<ResearchPaper>();

	public User() {
		
	}
	
	public User(String username, String password, Date birthDate, String phoneNumber, String email, String name, String surname) {
		this.birthDate = birthDate;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.surname = surname;
		this.name = name;
		this.username = username;
	}
	public User(String username, String password) {
		this.password = password;
		this.username = username;
	}

	
	// GETTER AND SETTER DATE
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	// GETTER AND SETTER PHONE NUMBER
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// GETTER AND SETTER EMAIL
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	// GETTER AND SETTER NAME
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// GETTER AND SETTER SURNAME
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	// GETTER AND SETTER USERNAME
	public String getUsername() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	
	// GETTER AND SETTER password
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void makeOrder(String description) { // make order
		Order order = new Order(description);
		order.setSender(this);
		Data.addOrder(order);
	}
	public String viewNews() {
		String s = "";
		for(News n : Data.getNews()) {
			s += n.toString() + '\n';
		}
		return s;
	}
	//RESEARCHER ---------------------------------------------------------------
	
	// GET/SET isResearcher
	public boolean getIsResearcher() {
		return isResearcher;
	}
	
	public void setIsResearcher(boolean set) {
		isResearcher = set;
	}
    
	//GET/SET hIndex
    public double getHIndex() {
        return this.hIndex;
    }
    public void setHIndex(double i) {
    	this.hIndex = i;
    }

    public double calculateHIndex() {
    	return researchPapers.size();
    }

    // GET can be Supervisor
    public boolean eligibleToBeSupervisor() { 
        if(this.hIndex > 3) return true;
        else return false;
    }
    
    @SuppressWarnings("unchecked")
	public String printPapers(String compType) {
    	
		Vector<ResearchPaper> papers = (Vector<ResearchPaper>) researchPapers.clone();
		String s = "";
        if(compType == "1") {
        	PaperDatePublishComparator comparator = new PaperDatePublishComparator();
        	Collections.sort(papers, comparator);
        }else if(compType == "2") {
        	PaperPageComparator comparator = new PaperPageComparator();
        	Collections.sort(papers, comparator);
        }
        for(var paper : papers) {
        	s += paper.toString() + '\n';
        }
        return s;
    }
    //----------------------------------------------------------------------------------
    
	public boolean equals(Object o){
		if(this == o)return true;
		if(o == null)return false;
		if(this.getClass() != o.getClass())return false;
		User u = (User)o;
		if(this.hashCode() != u.hashCode())return false;
		return Objects.equals(this.birthDate, u.birthDate) && Objects.equals(this.email, u.email)
				&& Objects.equals(this.name, u.name) && Objects.equals(this.password, u.password)
				&& Objects.equals(this.surname, u.surname) && Objects.equals(this.username, u.username);
	}
	
	public int hashCode() {
		return Objects.hash(username, birthDate, email, name, surname,password);
	}

	@Override
	public String toString() {
		return "User [birthDate=" + birthDate + ", phoneNumber=" + phoneNumber + ", email=" + email + ", name=" + name
				+ ", surname=" + surname + "]";
	}
	
	
}

