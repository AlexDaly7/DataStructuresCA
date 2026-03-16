/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca.objects;
import java.util.Date;
/**
 *
 * @author Alex
 */
public class Item {
    protected String title;
    protected String description;
    protected Date dateAdded;
    protected int urgency;
    
    protected Item() {
        title = new String();
        description = new String();
        dateAdded = new Date();
        urgency = 0;
    }
    protected Item(String title, String description, Date dateAdded, int urgency) {
        this.title = title;
        this.description = description;
        this.dateAdded = dateAdded;
        this.urgency = urgency;
    }

    protected String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    protected String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    protected Date getDateAdded() {
        return dateAdded;
    }

    protected int getUrgency() {
        return urgency;
    }

    protected void setUrgency(int urgency) {
        this.urgency = urgency;
    }
    
    protected String getDetails() {
        return "Title: "+title+"\nDescription: "+description+"\nDate Added: "+dateAdded.toString()+"\nUrgency: "+urgency;
    }
}
