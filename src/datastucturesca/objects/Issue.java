/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastucturesca.objects;
import java.util.Date;
/**
 *
 * @author DELL
 */
public class Issue extends Item {
    public Issue() {
        title = new String();
        description = new String();
        dateAdded = new Date();
        urgency = 0;
    }
    
    protected Issue(String title, String description, Date dateAdded, int urgency) {
        this.title = title;
        this.description = description;
        this.dateAdded = dateAdded;
        this.urgency = urgency;
    }
}
