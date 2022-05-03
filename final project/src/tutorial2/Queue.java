/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial2;

/**
 *
 * @author Brett
 */
public class Queue {
    
 Node head = null; 
 Node tail = null;          

 public boolean empty() {              
     
     return head == null;           
 
 }//end empty
   
public void enqueue(NodeData nd) {           
    
    Node p = new Node(nd);           
    
    if (this.empty()) 
    
    {                      
        head = p;              
        tail = p; 
        
    }//end if           
    
    else {   
        
        tail.nextNode = p;              
        tail = p;
        
    }//end else        

} //end enqueue 
    
public NodeData dequeue() {   
    
    if (this.empty()) {             
        
        System.out.println("Queue is Empty");              
        System.exit(1);    
        
    }//end if           
    
    NodeData hold = head.data;           
    head = head.nextNode;           
    
    if (head == null) {
        
        tail = null;
    }//end if           
    
    return hold;        

} //end dequeue

}//end Queue 
