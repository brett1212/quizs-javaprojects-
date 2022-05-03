package tutorial2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Node {
    
    NodeData data;
   
    Node nextNode;
    
    public Node(NodeData data){
    
    this.data=data;
    nextNode=null;
    
    }// end node

  


    public Node getNextNode() {
        
        return nextNode;
        
    }//end getNextNode

   

    public void setNextNode(Node nextNode) {
        
        this.nextNode = nextNode;
   
    }//end setNextNode
    

    public int compareTo(Node n){
        
  if(this.data.num!=0){
      
        if(this.data.num== n.data.num){return 0;}
        else if (this.data.num>n.data.num){ return 1;}
        else{return -1;}
  
  }//end if
  
  else{
      
        if(this.data.ch== n.data.ch){return 0;}
        else if (this.data.ch>n.data.ch){ return 1;}
        else{return -1;}
  
  }//end else
  
  }//end compareto
    
    @Override
    public String toString() {
        
        return "Node{" + "data=" + data + ", nextNode=" + nextNode + '}';
        
    }//end tostring
    
    
}//end node
