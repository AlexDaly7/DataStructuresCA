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
public class Project {
    private String title;
    private String description;
    private int urgency;
    private boolean done;
    
    public Project() {
        title = new String();
        description = new String();
        urgency = 0;
        done = false;
    }
    
    public Project(String title, String description, int urgency) {
        this.title = title;
        this.description = description;
        this.urgency = urgency;
        done = false;
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

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
    
    
}
