
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;  
        this.next = null;
    }
} 
public class LinkedList{
    public Node head = null;
    public Node tail = null;
         
        void insert(){
            System.out.println("Enter elements");
            Scanner sc = new Scanner(System.in);
            int d= sc.nextInt();
            Node newnode= new Node(d);
            
            
            newnode.next=null;
            if(head==null){
                head=newnode;
                tail = newnode;
            }
            else{
                tail.next=newnode;
                tail = newnode;
            }
           System.out.println("element inserted");
        }
        void traverse(){
            if(head==null){
                System.out.println("List is empty");
            }
            else{
            System.out.println("Elements in list");
            Node current;
            for(current=head;current!=tail;current=current.next){
                System.out.print(" "+current.data + " ");
            }
        }
        }
        
    public static  void main(String args[]){
        LinkedList obj= new LinkedList();
        while(true){
            System.out.println("Press 1 to insert");
            System.out.println("Press 2 to display");
            System.out.println("Press 3 to exit");
            System.out.println("Enter choice");
            Scanner scan= new Scanner(System.in);
            int choice= scan.nextInt();
            switch(choice){
                case 1:obj.insert();
                    break;
                case 2:obj.traverse();
                    break;
                case 3:System.exit(0);
                    break;
            }
        
        }
        
    }
}

