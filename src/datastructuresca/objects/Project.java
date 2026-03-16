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
    
    public Project() {
        title = new String();
        description = new String();
        urgency = 0;
    }
    
    public Project(String title, String description, Date dateAdded, int urgency) {
        this.title = title;
        this.description = description;
        this.urgency = urgency;
    }
}
