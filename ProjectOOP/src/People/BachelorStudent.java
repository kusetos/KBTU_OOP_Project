package People;

import java.util.Date;

import Entities.DiplomaProject;
import Enumerators.Faculty;

/**
* @generated
*/
public class BachelorStudent extends Student {

    private DiplomaProject diplomaProject;
    
    public BachelorStudent() {
		super();
	}


	public BachelorStudent(String username, String password, Date birthDate, String phoneNumber, String email,
			String name, String surname, String id, int yearOfStudy, double gpa, int creditLimit, Faculty faculty,
			String speciality) {
		
		super(username, password, birthDate, phoneNumber, email, name, surname, id, yearOfStudy, gpa, creditLimit, faculty,
				speciality);

	}


	public DiplomaProject getDiplomaProject() {
        return this.diplomaProject;
    }
    

    public void setDiplomaProject(DiplomaProject diplomaProject) {
        this.diplomaProject = diplomaProject;
    }
    
    
    
    
}
