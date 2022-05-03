/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finals;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



/**
 *
 * @author Brett
 */
public class Maxheap {
    
  
    NodeData heap [] = new NodeData [6]; // storing both questions,anwers and the postion
    int count=0;                         // amount of leaves
  
    int ci=1;                            
   
    Maxheap next;
    Maxheap data;
    
     public Maxheap(Maxheap nd) throws IOException{
    
        data = nd;
        next = null;
        
        for(int x =0;x<5;x++){   // creating 5 leaves to store within the linklist
        createheap();
        }
        
        
    }
    
    
public void HEAPIFY(NodeData heap[],int n,int i){ 
 

    
       int largest = i; //  largest as root 
        int l = 2*i ; // left = 2*i 
        int r = 2*i + 1; // right = 2*i + 1
  
        // If left child is larger than root 
        if (l <= n && heap[l].num > heap[largest].num) 
            largest = l; 
  
        // If right child is larger than largest so far 
        if (r <= n && heap[r].num > heap[largest].num) 
            largest = r; 
  
        // If largest is not root 
        if (largest != i) 
        { 
            NodeData swap = heap[i]; 
         heap[i]  =  heap[largest] ; 
            heap[largest] = swap; 
  
            // Recursively heapify the affected sub-tree 
            HEAPIFY(heap, n, largest); 
        } 


    
}// end HEAPIFY

public void sort(){


 

        int n = count; 
  
        // Build heap (rearrange array) 
        for (int i = n / 2 ; i >= 1; i--) 
            HEAPIFY(heap, n, i); 
        

}// end sort



    
  public void createheap() throws FileNotFoundException, IOException{

    
         int random = (int)(Math.random() * 100 + 1); // random number generator from 1-100
           int t=0;
        String ques []= new String [150];   // stores questions
        String ans []= new String [150];    // stores answers
        String q ="";                       //stores one question to be sent to nodedata   
        String a = "";                       //stores one answer to be sent to nodedata 
        String quest="";                     // stores and saves the questions from the txt file to the question array
        
        
        FileReader fr = new FileReader("MC.txt");     // read question from txt file
        BufferedReader br = new BufferedReader(fr);
        String str = br.readLine();
        
         
        while(str!=null){    // goes through the txt file line by line
     
           for (int i = 0; i < 5; i++) {
         quest+=str+"\n";
         str=br.readLine();
                }
         
         
         ques[t]=quest;
         ans[t]=str;
         str=br.readLine();
         quest="";
         t++;
           
    }
        if("MULTIPLE CHOICE".equals(gui.ty1.getSelectedItem().toString())){ //if multiple choice is chosen this sends a question and the answer to said question to nodedata
        
          q =ques[gui.mc];
        a = ans[gui.mc];
        gui.mc++;
        
        
        }
        
        
        if("TRUE/FALSE".equals(gui.ty1.getSelectedItem().toString())){ //if true and false is chosen this sends a question and the answer to said question to nodedata
        
          q =ques[gui.tf];
        a = ans[gui.tf];
       gui.tf++;
        
        
        }

heap[ci]=new NodeData(random,q,a); // save the nodedata to a max heap
ci++;

count++;



sort();

   
   

  }
    


   
    
    
   
    
    
}
