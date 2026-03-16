/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca.objects;

/**
 *
 * @author Alex
 */
public class Area extends Item {
    public Area() {
        title = new String();
        description = new String();
        urgency = 0;
    }
    
    public Area(String title, String description, int urgency) {
        this.title = title;
        this.description = description;
        this.urgency = urgency;
    }
}
