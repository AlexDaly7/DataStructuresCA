/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca.interfaces;
import datastructuresca.objects.Item;
/**
 *
 * @author DELL
 */
public interface PriorityQueueInterface {
    public void enqueue(Item element);
    public void dequeue();
    public Item peek();
    public void update(Item element);
    public void update(String title, String desc, int urgency);
    public int findPosition(int value);
    public int size();
    public void remove();
    public boolean isEmpty();
}
