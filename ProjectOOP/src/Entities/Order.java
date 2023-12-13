package Entities;

import DataBase.Data;
import People.TechSupportSpecialist;

/**
* @generated
*/
public class Order {
    
    /**
    * @generated
    */
    private ITOrderStatus status;
    
    /**
    * @generated
    */
    private String description;
    
    /**
    * @generated
    */
    private Date sentTime;
    
    
    /**
    * @generated
    */
    private TechSupportSpecialist techSupportSpecialist;
    
    /**
    * @generated
    */
    private Data data;
    
    

    /**
    * @generated
    */
    private ITOrderStatus getStatus() {
        return this.status;
    }
    
    /**
    * @generated
    */
    private ITOrderStatus setStatus(ITOrderStatus status) {
        this.status = status;
    }
    
    
    /**
    * @generated
    */
    private String getDescription() {
        return this.description;
    }
    
    /**
    * @generated
    */
    private String setDescription(String description) {
        this.description = description;
    }
    
    
    /**
    * @generated
    */
    private Date getSentTime() {
        return this.sentTime;
    }
    
    /**
    * @generated
    */
    private Date setSentTime(Date sentTime) {
        this.sentTime = sentTime;
    }
    
    
    
    /**
    * @generated
    */
    public Data getData() {
        return this.data;
    }
    
    /**
    * @generated
    */
    public Data setData(Data data) {
        this.data = data;
    }
    
    
    /**
    * @generated
    */
    public TechSupportSpecialist getTechSupportSpecialist() {
        return this.techSupportSpecialist;
    }
    
    /**
    * @generated
    */
    public TechSupportSpecialist setTechSupportSpecialist(TechSupportSpecialist techSupportSpecialist) {
        this.techSupportSpecialist = techSupportSpecialist;
    }
    
    
    

    //                          Operations                                  
    
    
}
