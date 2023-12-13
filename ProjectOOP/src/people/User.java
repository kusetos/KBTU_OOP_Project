package people;

import Entities.Journal;
import ResearcherStuff.BasicUserDecorator;
import ResearcherStuff.ResearcherDecorator;

/**
* @generated
*/
public class User extends BasicUserDecorator implements Comparable, Serializable, ResearcherDecorator {
    
    /**
    * @generated
    */
    private String name;
    
    /**
    * @generated
    */
    private Date dateOfBirth;
    
    /**
    * @generated
    */
    private Journal journalSubscriptions;
    
    /**
    * @generated
    */
    private String login;
    
    /**
    * @generated
    */
    private String password;
    
    /**
    * @generated
    */
    private String surname;
    
    
    /**
    * @generated
    */
    private Comparable comparable;
    
    

    /**
    * @generated
    */
    private String getName() {
        return this.name;
    }
    
    /**
    * @generated
    */
    private String setName(String name) {
        this.name = name;
    }
    
    
    /**
    * @generated
    */
    private Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    /**
    * @generated
    */
    private Date setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    
    /**
    * @generated
    */
    private Journal getJournalSubscriptions() {
        return this.journalSubscriptions;
    }
    
    /**
    * @generated
    */
    private Journal setJournalSubscriptions(Journal journalSubscriptions) {
        this.journalSubscriptions = journalSubscriptions;
    }
    
    
    /**
    * @generated
    */
    private String getLogin() {
        return this.login;
    }
    
    /**
    * @generated
    */
    private String setLogin(String login) {
        this.login = login;
    }
    
    
    /**
    * @generated
    */
    private String getPassword() {
        return this.password;
    }
    
    /**
    * @generated
    */
    private String setPassword(String password) {
        this.password = password;
    }
    
    
    /**
    * @generated
    */
    private String getSurname() {
        return this.surname;
    }
    
    /**
    * @generated
    */
    private String setSurname(String surname) {
        this.surname = surname;
    }
    
    
    
    /**
    * @generated
    */
    public Comparable getComparable() {
        return this.comparable;
    }
    
    /**
    * @generated
    */
    public Comparable setComparable(Comparable comparable) {
        this.comparable = comparable;
    }
    
    
    

    //                          Operations                                  
    
    
}
