package Entities;

import java.io.Serializable;
import java.util.Vector;

import People.Student;
public class Organization implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String name;
	private Vector<Student> members = new Vector<Student>();
	private Student head;
	
	public Organization(String name, Student head) {
		this.name = name;
		this.head = head;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHead(Student head) {
		this.head = head;
	}
	
	public Student getHead() {
		return head;
	}
	
	public void setMembers(Vector<Student> members) {
		this.members = members;
	}
	
	public Vector<Student> getMembers(){
		return members;
	}
	
	public void addMember(Student s) {
		members.add(s);
	}
	
	public void removeMember(Student s) {
		members.remove(s);
	}
}
