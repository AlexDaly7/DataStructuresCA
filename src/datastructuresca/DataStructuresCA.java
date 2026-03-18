/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datastructuresca;

import datastructuresca.structures.*;
import datastructuresca.objects.*;
/**
 *
 * @author Alex
 */
public class DataStructuresCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Doubly Linked List Tests
        DoublyLinkedList dll = new DoublyLinkedList();
        System.out.println("Doubly Linked List created...\nAdding nodes...");
        // Adding nodes
        dll.add(new Area("Area1", "Desc1", 0));
        dll.add(new Area("Area2", "Desc2", 0));
        dll.add(new Area("Area3", "Desc3", 0));
        
        // Print head
        dll.setCurrentHead();
        System.out.println("Head title: "+dll.getCurrentData().getTitle());
        
        // Remove head (current)
        dll.remove();
        System.out.println("Head removed\nNew head title: "+dll.getCurrentData().getTitle());
        
        // Update head
        dll.update("Updated Title", "Updated Desc");
        System.out.println("Head updated\nNew head title: "+dll.getCurrentData().getTitle());
        
        
        // Singly Linked List Tests
        SinglyLinkedList sll = new SinglyLinkedList();
        System.out.println("Singly Linked List created...\nAdding nodes...");
        // Adding nodes
        sll.add(new Project("Project1", "Desc1", 0));
        sll.add(new Project("Project2", "Desc2", 0));
        sll.add(new Project("Project3", "Desc3", 0));
        
        // Print head
        sll.setCurrentHead();
        System.out.println("Head title: "+sll.getCurrentData().getTitle());
        
        // Remove head (current)
        sll.remove();
        System.out.println("Head removed\nNew head title: "+sll.getCurrentData().getTitle());
        
        // Update head
        sll.update(new Project("Updated head title", "Update desc", 0));
        System.out.println("Head updated\nNew head title: "+sll.getCurrentData().getTitle());
        
        // Priority Queue Tests
        PriorityQueue pq = new PriorityQueue();
        System.out.println("Priority Queue created...\nAdding elements...");
        
        // Adding elements
        pq.enqueue(new Issue("Issue1", "Desc1", 5));
        pq.enqueue(new Issue("Issue2", "Desc2", 2));
        pq.enqueue(new Issue("Issue3", "Desc3", 1));
        System.out.println("Elements added\nTop priority title: "+pq.peek().getTitle());
        
        // Dequeue element
        pq.dequeue();
        System.out.println("Top priority element dequeue\nTop priority title: "+pq.peek().getTitle());
        
        // Update element
        pq.update(new Issue("issue3", "Desc3", 6));
        System.out.println("Issue3 updated\nTop priority title: "+pq.peek().getTitle());
        
        // Launch GUI
        MainGUI.main(args);
        
    }
    
}
