/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca.structures;

import datastructuresca.interfaces.PriorityQueueInterface;
import java.util.ArrayList;
import datastructuresca.objects.Item;
/**
 *
 * @author DELL
 */
public class PriorityQueue implements PriorityQueueInterface{
    private ArrayList<Item> priorityQ;
    
    public PriorityQueue() {
        priorityQ = new ArrayList<Item>();
    }
    
    @Override
    public void enqueue(Item element) {
        if(priorityQ.isEmpty()) {
            priorityQ.add(element);
        } else {
            priorityQ.add(findPosition(element.getUrgency()), element); // Add element to queue at position determined by findPosition()
        }
    }
    
    @Override
    public void dequeue() { // Removes first item in the list.
        if(!priorityQ.isEmpty()) {
            priorityQ.removeFirst();
        }
    }
    
    @Override
    public int findPosition(int value) {
        if(priorityQ.isEmpty()||priorityQ.get(0).getUrgency()<value) { // If first element is less than value, return first position
            return 0;
        }
        int lastValue = priorityQ.get(0).getUrgency();
        for(int i=0;i<=priorityQ.size()-1;i++) {
            
            if(lastValue>=value&&priorityQ.get(i).getUrgency()<=value) { // If urgency of item fits between last and current list entries urgencies.
                return i; // Return this spot of the next Item
            }
            lastValue = priorityQ.get(i).getUrgency();
        }
        // If there is no spot in the middle or top to put it into.
        // Put it at the end
        return priorityQ.size();
    }
    
    @Override
    public void remove() { // Remove item from the queue
        priorityQ.remove(0);
    }
    
    
    @Override
    public Item peek() { // Return first element
        return priorityQ.get(0);
    }
    
    @Override
    public void update(Item element) {
        Item current = priorityQ.get(0);
        current.setTitle(element.getTitle());
        current.setDescription(element.getDescription());
        current.setUrgency(element.getTrueUrgency());
    }
    
    @Override
    public int size() { // Return size
        return priorityQ.size();
    }
    
    @Override
    public boolean isEmpty() { // Is queue empty
        return priorityQ.isEmpty();
    }
    
    public int getTotalUrgency() {
        int urgency = 0;
        for(Item issue : priorityQ) {
            urgency += issue.getUrgency();
        }
        return urgency;
    }
}
