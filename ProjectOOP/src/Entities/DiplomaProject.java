package Entities;

import People.*;
import java.util.*;


public class DiplomaProject{
    
    
	private String topic;
	
	private Vector<User> participants;

	public DiplomaProject(String topic, Vector<User> participants) {
		this.topic = topic;
		this.participants = participants;
	}
	public DiplomaProject() {
		
	}

	
	//GET/SET Topic
	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	//GTE/SET participants 
	public Vector<User> getParticipants() {
		return participants;
	}


	public void setParticipants(Vector<User> participants) {
		this.participants = participants;
	}

	public void join(User user) {
		if(participants.equals(null)) {
			participants = new Vector<User>();
		}
		participants.add(user);
	}



	public int hashCode() {
		return Objects.hash(participants, topic);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiplomaProject other = (DiplomaProject) obj;
		return Objects.equals(participants, other.participants) && Objects.equals(topic, other.topic);
	}
	
	
    
    
    
}
