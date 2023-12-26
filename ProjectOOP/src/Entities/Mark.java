package Entities;

import java.io.Serializable;
import java.util.Vector;

public class Mark implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Vector<Double> firstAttMarks = new Vector<Double>();
	private Vector<Double> secondAttMarks = new Vector<Double>();
	
	private Double finalScore;
	public Mark() {
		
	}
	
	public Vector<Double> getFirstAttMarks(){
		return firstAttMarks;
	}
	
	public Vector<Double> getSecondAttMarks(){
		return secondAttMarks;
	}
	
	public Double getFinalScore() {
		return finalScore;
	}
	
	public void setFinalScore(Double finalScore) {
		this.finalScore = finalScore;
	}
	public void setFirstAttMarks(Vector<Double> firstAttMarks) {
		this.firstAttMarks = firstAttMarks;
	}
	public void setSecondAttMarks(Vector<Double> secondAttMarks) {
		this.secondAttMarks = secondAttMarks;
	}
	
	public Double sumOfFirstAtt() {
		Double sum = 0.0;
		for(Double points: firstAttMarks) {
			sum += points;
		}
		return sum;
	}
	
	public Double sumOfSecondAtt() {
		Double sum = 0.0;
		for(Double points: secondAttMarks) {
			sum += points;
		}
		return sum;
	}
	
	public void setFirstAttMarks(Double points) {
		if(sumOfFirstAtt() + sumOfSecondAtt() + points <= 60)firstAttMarks.add(points);
		else System.out.println("You can't have a total of marks more than 60");
	}
	
	public void setSecondAttMarks(Double points) {
		if(sumOfFirstAtt() + sumOfSecondAtt() + points <= 60)secondAttMarks.add(points);
		else System.out.println("You can't have a total of marks more than 60");
	}
	
	public Double totalPoints() {
		return sumOfFirstAtt() + sumOfSecondAtt() + finalScore;
	}
	
}