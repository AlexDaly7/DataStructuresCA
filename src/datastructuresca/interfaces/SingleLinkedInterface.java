/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca.interfaces;

import datastructuresca.objects.Project;
import datastructuresca.objects.SingleNode;

/**
 *
 * @author Alex
 */

public interface SingleLinkedInterface {
    public void add(Project data);
    public void add(Project data, int position);
    public SingleNode get(int position);
    public void remove();
    public int size();
    public boolean isEmpty();
}

