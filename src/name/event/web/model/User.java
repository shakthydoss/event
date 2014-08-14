package name.event.web.model;
// Generated 14 Aug, 2014 5:14:05 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Integer iuser;
     private String name;
     private String email;
     private String oauth;
     private char mailSubscription;
     private char IAgreePolicy;
     private Date createdOn;
     private Integer createdBy;
     private Date modifiedOn;
     private Integer modifiedBy;
     private Set events = new HashSet(0);

    public User() {
    }

	
    public User(String name, String email, String oauth, char mailSubscription, char IAgreePolicy) {
        this.name = name;
        this.email = email;
        this.oauth = oauth;
        this.mailSubscription = mailSubscription;
        this.IAgreePolicy = IAgreePolicy;
    }
    public User(String name, String email, String oauth, char mailSubscription, char IAgreePolicy, Date createdOn, Integer createdBy, Date modifiedOn, Integer modifiedBy, Set events) {
       this.name = name;
       this.email = email;
       this.oauth = oauth;
       this.mailSubscription = mailSubscription;
       this.IAgreePolicy = IAgreePolicy;
       this.createdOn = createdOn;
       this.createdBy = createdBy;
       this.modifiedOn = modifiedOn;
       this.modifiedBy = modifiedBy;
       this.events = events;
    }
   
    public Integer getIuser() {
        return this.iuser;
    }
    
    public void setIuser(Integer iuser) {
        this.iuser = iuser;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getOauth() {
        return this.oauth;
    }
    
    public void setOauth(String oauth) {
        this.oauth = oauth;
    }
    public char getMailSubscription() {
        return this.mailSubscription;
    }
    
    public void setMailSubscription(char mailSubscription) {
        this.mailSubscription = mailSubscription;
    }
    public char getIAgreePolicy() {
        return this.IAgreePolicy;
    }
    
    public void setIAgreePolicy(char IAgreePolicy) {
        this.IAgreePolicy = IAgreePolicy;
    }
    public Date getCreatedOn() {
        return this.createdOn;
    }
    
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    public Integer getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }
    public Date getModifiedOn() {
        return this.modifiedOn;
    }
    
    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
    public Integer getModifiedBy() {
        return this.modifiedBy;
    }
    
    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
    public Set getEvents() {
        return this.events;
    }
    
    public void setEvents(Set events) {
        this.events = events;
    }




}

