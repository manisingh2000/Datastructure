/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datastructure;

/**
 *
 * @author MANI SINGH
 */
class Node{
    int data;
    Node next;
}
public class DeleteMiddle {
    
    static Node delete(Node Front){
        if (Front==null){
            return null;
        }
        if(Front.next==null){
            return null;
        }
        Node SlowPointer = Front;
        Node FastPointer = Front;
        
        Node Previous = null;
        while (FastPointer != null && FastPointer.next != null){
            FastPointer = FastPointer.next.next; 
            Previous = SlowPointer; 
            SlowPointer = SlowPointer.next;
        }
        Previous.next= SlowPointer.next;
        return Front; 
    }
    static void printList(Node Pointer) 
    { 
        while (Pointer != null) { 
            System.out.print(Pointer.data + "|"); 
            Pointer = Pointer.next; 
        } 
        System.out.println("NULL"); 
    }
    static Node newNode(int data) 
    { 
        Node temp = new Node(); 
        temp.data = data; 
        temp.next = null; 
        return temp; 
    }     
    public static void main(String args[]){      
        Node Front = newNode(1); 
        Front.next = newNode(2); 
        Front.next.next = newNode(3); 
        Front.next.next.next= newNode(4);  
        Front.next.next.next= newNode(5);
        System.out.println("Linked List before deletion"); 
        printList(Front);  
        Front = delete(Front);  
        System.out.println("Linked List after deletion of middle"); 
        printList(Front);
        
    }
    
}
