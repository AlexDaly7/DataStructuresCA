/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca.interfaces;
       
import datastructuresca.objects.Area;
import datastructuresca.objects.Node;
 /**
 *
 * @author Alex
 */
public interface DoublyLinkedInterface {
    public void add(Area data);
    public void add(Area data, int position);
    public Node get(int position);
    public void remove();
    public int size();
    public boolean isEmpty();
}
