package Entities;


/**
* @generated
*/
public class Project {
    
    private String topic;
    
    private  publishedPapers;
    
    private  participants;
    
    
    
    private String getTopic() {
        return this.topic;
    }

    private String setTopic(String topic) {
        this.topic = topic;
    }

    private  getPublishedPapers() {
        return this.publishedPapers;
    }

    private  setPublishedPapers(invalid publishedPapers) {
        this.publishedPapers = publishedPapers;
    }

    private  getParticipants() {
        return this.participants;
    }

    private  setParticipants(invalid participants) {
        this.participants = participants;
    }
    
    
    
   
    public boolean join() {
        //TODO
        return false;
    }
    
    
}
