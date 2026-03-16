/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca.structures;

import datastructuresca.interfaces.LinearListInterface;
import datastructuresca.objects.Area;
import datastructuresca.objects.Node;
/**
 *
 * @author DELL
 */


public class DoublyLinkedList implements LinearListInterface<Area> {
    private Node head;
    private Node last;
    private Node current;
    private int size;
    
    public DoublyLinkedList() {
        head = null;
        last = null;
        current = head;
        size = 0;
    }
    
    @Override
    public void add(Area area) { // Add node to list
        Node newNode = new Node(area, null, null);
        if(size==0) {
            head = newNode; // If list is empty, new node becomes both head and last.
            last = newNode;
        } else {
            newNode.setPrev(head); // If list is not empty, insert new node into head.
            head.setNext(newNode);
            head = newNode;
        }
        size++; // Increase size
    }
    
    @Override
    public void remove() { // Delete current node
        if(size==0) {} else if (size==1) { // If size 0 do nothing
            head = null; // If size is 1 then there is only one node, reset list.
            last = null;
        } else {
            if(head==current) { // If the current node is the head, set the node before head to the head and make its next null.
                head = head.getPrev();
                head.setNext(null);
            } else if (last==current) { // If the current node is the last, set the node after last to the last and make its prev null.
                last = last.getNext();
                last.setPrev(null);
            } else { // If the current node is in the middle, change node after and before current to refer to eachother and set current node to its next.
                current.getNext().setPrev(current.getPrev());
                current.getPrev().setNext(current.getNext());
                current = current.getNext();
            }
        }
        size--; // Decrease size
    }
    
    @Override
    public Area getCurrent() { // Returns current nodes data
        return current.getData();
    }
    
    @Override
    public int size() { // Returns list size
        return size;
    }
    
    @Override
    public boolean isEmpty() { // Is list empty
        return (size==0);
    }
}
