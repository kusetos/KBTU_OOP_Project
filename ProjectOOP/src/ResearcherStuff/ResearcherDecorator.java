package ResearcherStuff;

import People.GraduateStudent;

public class ResearcherDecorator extends BasicUserDecorator implements Researcher {
    
    /**
    * @generated
    */
    private int hIndex;
    
    
    /**
    * @generated
    */
    private GraduateStudent graduateStudent;
    
    

    /**
    * @generated
    */
    private int getHIndex() {
        return this.hIndex;
    }
    
    /**
    * @generated
    */
    private int setHIndex(Integer hIndex) {
        this.hIndex = hIndex;
    }
    
    
    
    /**
    * @generated
    */
    public GraduateStudent getGraduateStudent() {
        return this.graduateStudent;
    }
    
    /**
    * @generated
    */
    public GraduateStudent setGraduateStudent(GraduateStudent graduateStudent) {
        this.graduateStudent = graduateStudent;
    }
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public boolean eligibleToBeSupervisor() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public String printPapers() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public int calculateHIndex() {
        //TODO
        return 0;
    }
    
    
}
