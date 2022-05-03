/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial2;


import static java.lang.Character.toLowerCase;

/**
 *
 * @author Brett
 */
public class Stack {
    


final static int MaxStack=100;
Node top = null;


public Stack integeradder(Stack n1, Stack n2){

    Stack ans = new Stack();
    Node nu1 = n1.top;
    Node nu2 = n2.top;

while(!n1.empty()){
    
    ans.push(new NodeData(nu1.data.num+nu2.data.num));
    
    nu1=nu1.nextNode; nu2=nu2.nextNode;
    n1.pop(); n2.pop();
    
}//end while

return ans;

}//end of intadder 

public String palindrome(Queue n){
    
   
    
   Node s=this.top;
   Node q=n.head;
   
   while(!this.empty()){
       
       if (s.data.ch==' '||s.data.ch=='.'||s.data.ch=='?'||s.data.ch=='\''||q.data.ch==','){s=s.nextNode;this.pop();}//end if   
       if(q.data.ch==' '||q.data.ch=='.'||q.data.ch=='?'||q.data.ch=='\''||q.data.ch==','){q=q.nextNode;n.dequeue();}//end if
       
       s.data.ch=toLowerCase(s.data.ch);
       q.data.ch=toLowerCase(q.data.ch);
       
    if(s.compareTo(q)==0){
    
        s=s.nextNode;
        q=q.nextNode;
        
        this.pop();n.dequeue();
           
    }//end if
    
    else{
    
    return "This is not a palindrome";
        
    }//end else
    
    if(this.empty()){
        
        
        return "This is a palindrome";
        
        }//end if
    
  }//end while 
return "This is not a palindrome";


}//end palindrome


public boolean empty(){
 
 return top == null;
 
 }//end of empty

  public void push(NodeData n) { 
      
      Node p = new Node(n);          
      p.nextNode = top;           
      top = p;    
      
  } //end push
 
  public NodeData pop() {  
      
      if (this.empty()){ System.out.println("Stack is empty");
      System.exit(2);
      }//end if
      
      NodeData hold = top.data;
      top = top.nextNode; 
       return hold; 
       
  } //end pop                           
 
 public NodeData peek() { 
     
     if (!this.empty()) {return top.data;}
     return null;    
     
 } //end peek
 
 
}//end of Stack
 


