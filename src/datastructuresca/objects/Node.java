/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca.objects;

/**
 *
 * @author Alex
 */
public class Node {
    private Area data;
    private Node nextNode;
    private Node prevNode;
    
    public Node(Area area, Node nextNode, Node prevNode) {
        data = area;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }
    
    public void setNext(Node nextNode) {
        this.nextNode = nextNode;
    }
    
    public Node getNext() {
        return nextNode;
    }
    
    public void setPrev(Node prevNode) {
        this.prevNode = prevNode;
    }
    
    public Node getPrev() {
        return prevNode;
    }
    
    public void setData(Area data) {
        this.data = data;
    }
    
    public Area getData() {
        return data;
    }
}
