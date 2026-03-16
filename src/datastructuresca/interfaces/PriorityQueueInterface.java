/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca.interfaces;

/**
 *
 * @author DELL
 */
public interface PriorityQueueInterface<T> {
    public void enqueue(T element);
    public void dequeue(T element);
    public T peek();
    public int size();
    public void remove(int position);
    public boolean isEmpty();
}
