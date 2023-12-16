package People;

import java.util.Date;
import java.util.Objects;
public class User {
	String username;
	String password;
	Date birthDate;
	String phoneNumber;
	String email;
	String name;
	String surname;
	
	public User() {
		
	}
	
	public User(String username, String password, Date birthDate, String phoneNumber, String email, String name, String surname) {
		this.birthDate = birthDate;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.surname = surname;
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
	
	public void makeOrder() {
		
	}
	
	
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
	
}

