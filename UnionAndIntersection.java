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
public class UnionAndIntersection {
    Node head;
    class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    void Union(Node head1, Node head2) 
    { 
         
        while (head1 != null) { 
            push(head1.data); 
            head1 = head1.next; 
        }  
        while (head2 != null) { 
            if (!isPresent(head, head2.data)) 
                push(head2.data); 
            head2 = head2.next; 
        } 
    }  
    void Intersection(Node head1, Node head2) 
    { 
        Node result = null; 
          
        while (head1 != null) { 
            if (isPresent(head2, head1.data)) 
                push(head1.data); 
            head1 = head1.next; 
        } 
    } 
    void printList() 
    { 
        Node temp = head; 
        while (temp != null) { 
            System.out.print(temp.data + " "); 
            temp = temp.next; 
        } 
        System.out.println(); 
    } 
    void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 
    boolean isPresent(Node head, int data) 
    { 
        
        while (head != null) { 
            if (head.data == data) 
                return true; 
            head = head.next; 
        } 
        return false; 
    } 
    public static void main(String args[]) 
    { 
        UnionAndIntersection list1 = new UnionAndIntersection(); 
        UnionAndIntersection list2 = new UnionAndIntersection(); 
        UnionAndIntersection uni = new UnionAndIntersection(); 
        UnionAndIntersection inter = new UnionAndIntersection(); 
        list1.push(20); 
        list1.push(4); 
        list1.push(15); 
        list1.push(10); 
        list2.push(10); 
        list2.push(2); 
        list2.push(4); 
        list2.push(8);  
        inter.Intersection(list1.head, list2.head); 
        uni.Union(list1.head, list2.head);   
        System.out.println("First List is"); 
        list1.printList();   
        System.out.println("Second List is"); 
        list2.printList();   
        System.out.println("Union List is"); 
        uni.printList();   
        System.out.println("Intersection  List is"); 
        inter.printList(); 
    }
    
}
