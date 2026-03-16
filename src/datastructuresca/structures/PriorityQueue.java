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
        priorityQ.add(findPosition(element.getUrgency()), element); // Add element to queue at position determined by findPosition()
    }
    
    @Override
    public void dequeue() { // Removes first item in the list.
        priorityQ.removeFirst();
    }
    
    @Override
    public int findPosition(int value) {
        if(priorityQ.get(0).getUrgency()<value) {
            return 0;
        }
        for(int i=0;i<priorityQ.size();i++) {
            
            if(priorityQ.get(i).getUrgency()>=value) { // If urgency of Item at i is above or equal to
                if(priorityQ.get(i+1).getUrgency()<=value) { // If urgency of Item at i+1 is below or equal to
                    return i+1; // Return this spot of the next Item
                }
            }
        }
        // If there is no spot in the middle or top to put it into.
        // Put it at the end
        return priorityQ.size()+1;
    }
    
    @Override
    public void remove(Item item) { // Remove item from the queue
        priorityQ.remove(item);
    }
    
    
    @Override
    public Item peek() { // Return first element
        return priorityQ.getFirst();
    }
    
    @Override
    public int size() { // Return size
        return priorityQ.size();
    }
    
    @Override
    public boolean isEmpty() { // Is queue empty
        return priorityQ.isEmpty();
    }
}
