package People;

import java.util.Date;

import Entities.*;
import Entities.ResearchProject;
import Enumerators.*;
import ResearcherStuff.*;

public class GraduateStudent extends Student {
    
   private ResearchProject project;

   public GraduateStudent(String username, String password, Date birthDate, String phoneNumber, String email,
			String name, String surname, String id, int yearOfStudy, double gpa, int creditLimit, Faculty faculty,
			String speciality) {
		
		super(username, password, birthDate, phoneNumber, email, name, surname, id, yearOfStudy, gpa, creditLimit, faculty,
				speciality);

   }
   public GraduateStudent(){
	   
   }
   {
	   super.setIsResearcher(true);
   }
   //GET/SET project
   public ResearchProject getProject() {
	   return project;
   }
   public void setProject(ResearchProject project) {
	   this.project = project;
   }
   
   
   
}
