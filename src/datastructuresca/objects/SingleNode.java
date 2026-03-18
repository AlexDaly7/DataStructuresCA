/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca.objects;

/**
 *
 * @author Alex
 */
public class SingleNode {
    private Project data;
    SingleNode nextNode;
    
    
    public SingleNode(Project data) {
         this.data = data;
         this.nextNode = null;
    };
    
    public SingleNode getNext() {
        return nextNode;
    }
    
    public void setNext(SingleNode nextNode) {
        this.nextNode = nextNode;
    }
    
    public Project getData() {
        return data;
    }
    
    public void setData(Project data) {
        this.data = data;
    }
}
