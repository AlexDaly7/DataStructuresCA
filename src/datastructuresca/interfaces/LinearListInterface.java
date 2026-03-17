/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca.interfaces;

/**
 *
 * @author Alex
 */

public interface LinearListInterface<T> {
    public void add(T data);
    public void remove();
    public int size();
    public T getCurrentData();
    public boolean isEmpty();
}

