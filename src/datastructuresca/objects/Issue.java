/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca.objects;
import datastructuresca.structures.SinglyLinkedList;
import datastructuresca.objects.Project;
import datastructuresca.objects.SingleNode;
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
        trueUrgency = 0;
    }
    
    public Issue(String title, String description, int urgency) {
        singleList = new SinglyLinkedList();
        this.title = title;
        this.description = description;
        this.urgency = urgency;
        trueUrgency = 0;
    }
    
    public void calcTrueUrgency() { // Issue urgency is its urgency minus urgency relieved from completed projects.
        int projectsUrgency = 0;
        singleList.setCurrentHead();
        
        for(int i=0;i<singleList.size();i++) {
            Project project = singleList.getCurrentData();
            if(project.isDone()) {
                projectsUrgency += project.getUrgency();
            }
            singleList.getNext();
        }
        trueUrgency = urgency - projectsUrgency;
    }
    
    @Override
    public int getTrueUrgency() {
        return getTrueUrgency();
    }
    
    @Override
    public int getUrgency() { // Need to transfer true urgency when updating
        return urgency;
    }
    
    public void add(Project project) {
        singleList.add(project);
    }
    
    public void remove() { 
        singleList.remove();
    }
    
    public void update(Project project) {
        singleList.update(project);
    }
    
    public int size() {
        return singleList.size();
    }
    
    public Project getCurrentData() {
        return singleList.getCurrentData();
    }
    
    public void getNext() {
        singleList.getNext();
    }
    
    public void setCurrentHead() {
        singleList.setCurrentHead();
    }
    
    public boolean isEmpty() {
        return singleList.isEmpty();
    }
}
