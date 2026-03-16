/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastucturesca.objects;

/**
 *
 * @author DELL
 */
public class SinglyNode<T> {
    private T data;
    SinglyNode<T> nextNode;
    
    
    public SinglyNode(T data, SinglyNode nextNode) {
         this.data = data;
         this.nextNode = nextNode;
    };
    
    public SinglyNode getNext() {
        return nextNode;
    }
    
    public void setNext(SinglyNode nextNode) {
        this.nextNode = nextNode;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
}
