/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca.objects;
import datastructuresca.structures.SinglyLinkedList;
import datastructuresca.objects.Project;
/**
 *
 * @author Alex
 */
public class Issue extends Item {
    private SinglyLinkedList singleList;
    
    public Issue() {
        singleList = new SinglyLinkedList();
        title = new String();
        description = new String();
        urgency = 0;
    }
    
    public Issue(String title, String description, int urgency) {
        singleList = new SinglyLinkedList();
        this.title = title;
        this.description = description;
        this.urgency = urgency;
    }
    
    public void add(Project project) {
        singleList.add(project);
    }
    
    public void remove() {
        singleList.remove();
    }
    
    public int size() {
        return singleList.size();
    }
    
    public Project getCurrentData() {
        return singleList.getCurrentData();
    }
    
    public boolean isEmpty() {
        return singleList.isEmpty();
    }
}
