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
    private SingleNode previous;
    private int size;
    
    public SinglyLinkedList() {
        head = null;
        current = head;
        previous = head;
        size = 0;
    }
    
    @Override
    public void add(Project project) { 
        SingleNode newNode = new SingleNode(project);
        if(size==0) {
            head = newNode;
        } else {
            newNode.setNext(head);
            previous = head;
            head = newNode;
        }
        size++;
        current = head;
    }
    
    @Override
    public void remove() {
        setCurrentHead();
        if(size<=1) {
            head = null;
            current = head;
        } else if (previous==null) {
            current = current.getNext();
        } else {
            previous.setNext(current.getNext());
            current = current.getNext();
        }
        size--;
    }
    
    @Override
    public int size() {
        return size;
    }
    
    @Override 
    public Project getCurrentData() {
        if(current!=null) {
            return current.getData();
        } else {
            return new Project();
        }
    }
    
    public SingleNode getCurrent() {
        return current;
    }
    
    @Override
    public void getNext() {
        if(current.getNext()!=null) {
            previous = current;
            current = current.getNext();
        } else {
            previous = current;
            current = head;
        }
    }
    
    @Override
    public boolean isEmpty() {
        return size==0;
    }
    
    public void update(Project project) {
        current.setData(project);
    }
    public void setCurrentHead() {
        current = head;
    }
}
