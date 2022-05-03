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
public class stacktest {
    
    public static void main(String[] args) {
        
        Stack k = new Stack();
        Queue w = new Queue();
        String s="Are we not drawn onward we few drawn onward to new era?";
        
        for(int i=0;i<s.length();i++){

        k.push(new NodeData (s.charAt(i)));
        w.enqueue(new NodeData (s.charAt(i)));
            
        }//end for
        
 
        Stack n1 = new Stack();
        Stack n2 = new Stack();
        Stack ans = new Stack();
        
        n1.push(new NodeData(14));
        n1.push(new NodeData(3));
        
        n2.push(new NodeData(4));
        n2.push(new NodeData(10));
        

       ans= ans.integeradder(n1, n2);
       
        while(!ans.empty()){
        System.out.println(ans.pop());}
       
        System.out.println(k.palindrome(w)); 
        
        
        
        
    }//end main
    
}//end stacktest
