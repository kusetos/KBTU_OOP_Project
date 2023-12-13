package All;

import java.util.Objects;
public class User {
	String username;
	String password;
	String birthDate;
	String phoneNumber;
	String email;
	String name;
	String surname;
	
	public User() {
		
	}
	
	public User(String username, String password, String birthDate, String phoneNumber, String email, String name, String surname) {
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
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void changePassword(String oldPassword, String newPassword) {
		if(this.password.equals(oldPassword)) {
			this.password = newPassword;
			System.out.println("Password changed successfully");
		}
		else {
			System.out.println("Wrong password");
		}
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
