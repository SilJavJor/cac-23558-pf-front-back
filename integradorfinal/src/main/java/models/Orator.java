
package models;

import java.util.Date;

public class Orator {
    
    private int id;
    private String name;
    private String lastName;
    private String email;
    private String title;
    private String topic;
    private Date savedDate;
    private Date modificationDate;

    public Orator() {
    }

    public Orator(int id, String name, String lastName, String email, String title, String topic, Date savedDate, Date modificationDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.title = title;
        this.topic = topic;
        this.savedDate = savedDate;
        this.modificationDate = modificationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getSavedDate() {
        return savedDate;
    }

    public void setSavedDate(Date savedDate) {
        this.savedDate = savedDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }
    

}
