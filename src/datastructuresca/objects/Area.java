/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca.objects;
import datastructuresca.structures.PriorityQueue;
import datastructuresca.objects.Issue;
/**
 *
 * @author Alex
 */
public class Area extends Item {
    private PriorityQueue pQueue;
    
    public Area() {
        title = new String();
        description = new String();
        urgency = 0;
        pQueue = new PriorityQueue();
        trueUrgency = 0;
    }
    
    public Area(String title, String description, int urgency) {
        this.title = title;
        this.description = description;
        this.urgency = urgency;
        this.trueUrgency = urgency;
        pQueue = new PriorityQueue();
    }
    
    public void add(Issue issue) {
        pQueue.enqueue(issue);
    }
    
    public void remove() {
        pQueue.remove();
    }
    
    @Override
    public int getTrueUrgency() {
        int issueUrgency = 0;
        return pQueue.getTotalUrgency();
    }
    
    @Override
    public int getUrgency() {
        return urgency;
    }
    
    public void calcUrgency() {
        
    }
    
    public Issue peek() {
        if(!pQueue.isEmpty()) {
            return (Issue)pQueue.peek();
        } else {
            return new Issue();
        }
        
    }
    
    public void update(Item element) {
        pQueue.update(element);
    }
    
    public int size() {
        return pQueue.size();
    }
    
    public boolean isEmpty() {
        return pQueue.isEmpty();
    }
}
