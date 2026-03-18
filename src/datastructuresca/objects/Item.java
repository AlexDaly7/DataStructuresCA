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
    protected int urgency;
    protected int trueUrgency;
    
    protected Item() {
        title = new String();
        description = new String();
        urgency = 0;
    }
    protected Item(String title, String description, Date dateAdded, int urgency) {
        this.title = title;
        this.description = description;
        this.urgency = urgency;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUrgency() {
        return urgency;
    }
    
    public int getTrueUrgency() {
        return urgency;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }
    
    public String getDetails() {
        return "Title: "+title+"\nDescription: "+description+"\nUrgency: "+urgency;
    }
}
