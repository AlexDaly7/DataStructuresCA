/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca.structures;

import datastructuresca.objects.SingleNode;
import datastructuresca.interfaces.LinearListInterface;
import datastructuresca.objects.Project;
/**
 *
 * @author Alex
 */
public class SinglyLinkedList  implements LinearListInterface<Project> {
    private SingleNode head;
    private SingleNode current;
    private int size;
    
    public SinglyLinkedList() {
        head = null;
        current = head;
        size = 0;
    }
    
    @Override
    public void add(Project project) {
        SingleNode newNode = new SingleNode(project);
        if(size==0) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }
    
    @Override
    public void remove() {
        SingleNode toRemove = current; // Save current node
        currentToHead(); // Go to head
        while(current.getNext()!=toRemove) { // While current.getNext() does not equal toRemove get next
           current = current.getNext();
        }
        current.setNext(current.getNext().getNext()); // Set current's next to 2 nodes ahead, skipping the target node and dereferencing it
        size--;
    }
    
    @Override
    public int size() {
        return size;
    }
    
    @Override 
    public Project getCurrentData() {
        return current.getData();
    }
    
    @Override
    public boolean isEmpty() {
        return size==0;
    }
    
    public void currentToHead() {
        current = head;
    }
}
