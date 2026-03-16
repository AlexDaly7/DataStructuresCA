/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresca.objects;

/**
 *
 * @author Alex
 */
public class SingleNode<T> {
    private T data;
    SingleNode<T> nextNode;
    
    
    public SingleNode(T data, SingleNode nextNode) {
         this.data = data;
         this.nextNode = nextNode;
    };
    
    public SingleNode getNext() {
        return nextNode;
    }
    
    public void setNext(SingleNode nextNode) {
        this.nextNode = nextNode;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
}
