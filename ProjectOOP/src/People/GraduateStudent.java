package People;

import Entities.*;
import Entities.ResearchProject;
import Enumerators.*;
import ResearcherStuff.*;

public class GraduateStudent extends Student {
    
   private ResearchProject project;

   public GraduateStudent(ResearchProject project) {
	   super();
	   this.project = project;
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
