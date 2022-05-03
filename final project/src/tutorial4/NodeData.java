/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial4;

import Trees.*;

/**
 *
 * @author Brett
 */
public class NodeData {
  
    int num;
    String job;
    
    public NodeData(int n,String j){
    
   num = n;
   job = j;
    }
    
    public void visit(){
    
        System.out.printf("%s",num);
    }
    
    
    
    
}// end NodeData
