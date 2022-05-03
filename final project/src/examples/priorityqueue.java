/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author Brett
 */
public class priorityqueue {
    
    
    final static int MaxQ = 100;  
    int head = 0, tail = 0;           
    int[] QA = new int[MaxQ];
    
   
    public boolean empty() {            
        
        return head == tail;  }
    
    
    public int dequeue() {          
        
        if (this.empty()) {             
            
            System.out.printf("\nAttempt to remove from an empty queue\n");
            System.exit(2);  
        }
        
            head = (head + 1) % MaxQ;
            return QA[head];      
    
    } //end dequeue 
    
    
    public void enqueue(int n) {    
        
        tail = (tail + 1) % MaxQ;
        
        if (tail == head) {              
            System.out.printf("\nQueue is full\n");             
            System.exit(1);           }           
        
        QA[tail] = n;        } //end enqueue
}
