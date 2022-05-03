/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial4;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Brett
 */
public class Maxheap extends JFrame implements ActionListener {
    
   

    JLabel job1 = new JLabel("JOB:");
    JLabel job2 = new JLabel("JOB:");
    JLabel job = new JLabel("TO:");
    

    JLabel p1 = new JLabel("PRIORITY:");
    JLabel p2 = new JLabel("PRIORITY:");
    

    JTextField jOB1 = new JTextField("");
    JTextField jOB2 = new JTextField("Please re-enter");
    JTextField jOB = new JTextField("");
    
    
    JTextField pCHANGE = new JTextField("");
    
    
    JButton Del = new JButton("DELETE");
    JButton Del1 = new JButton("DELETE MAX");
    JButton ADD = new JButton("ADD");
    JButton CHA = new JButton("CHANGE");
    JButton print = new JButton("PRINT");
    JButton heapify = new JButton("HEAPIFY");
    
    
    JTextArea printa = new JTextArea();
    JScrollPane scroll = new JScrollPane (printa);
 
    
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
    JComboBox c = new JComboBox(model);
    
    

    public Maxheap() throws IOException {
    

    this.setTitle("TUTORIAL4");
    this.setSize(535, 570);
    this.setLayout(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

    this.getContentPane().add(job1);
    this.getContentPane().add(job2);
    this.getContentPane().add(job);
       

    this.getContentPane().add(p1);
    this.getContentPane().add(p2);
    

    this.getContentPane().add(jOB1);
    this.getContentPane().add(jOB2);
    this.getContentPane().add(jOB);
    
    
    
    this.getContentPane().add(pCHANGE);
    
    
    this.getContentPane().add(Del);
    this.getContentPane().add(Del1);
    this.getContentPane().add(ADD);
    this.getContentPane().add(CHA);
    this.getContentPane().add(print);
    this.getContentPane().add(heapify);
    this.getContentPane().add(scroll);
    
    

    this.getContentPane().add(c);
    
    
    job.setBounds(420, 130, 30, 50);
    job1.setBounds(20, 70, 30, 50);
    job2.setBounds(20, 130, 30, 50);

 
    p1.setBounds(170, 70, 60, 50);
    p2.setBounds(170, 130, 60, 50);


     
     jOB1.setBounds(60, 80, 100, 30);
     jOB2.setBounds(60, 140, 100, 30);
     jOB.setBounds(450, 140, 50, 30);
     
     

     c.setBounds(230, 140, 70, 30);
    
    
    pCHANGE.setBounds(230, 80, 50, 30);
    
    
    Del.setBounds(300, 20, 80, 30);
    Del1.setBounds(390, 20, 110, 30);
    ADD.setBounds(300, 80, 60, 30);
    CHA.setBounds(310, 140, 100, 30);
    print.setBounds(210, 470, 100, 30);
    heapify.setBounds(370, 80, 90, 30);
    
    
    scroll.setBounds(20, 200, 475, 250);
    
    ADD.addActionListener(this);
    Del.addActionListener(this);
    Del1.addActionListener(this);
    CHA.addActionListener(this);
    c.addActionListener(this);
    heapify.addActionListener(this);
    print.addActionListener(this);
    
    
    
  
    heap[0]=new NodeData(0,"SELECT");
    model.addElement(heap[0].job);
    
    }
    
   

  
    NodeData heap [] = new NodeData [100];
    int count=0;
    int ci=1; 
    int added = 0;
   
    
    
    
public void HEAPIFY(NodeData heap[],int n,int i){
 

    if(count==0||count==1){printa.setText("Max Heap is either empty or only has one Node ");}
    
    
    else{
    
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

model.removeAllElements(); 
heap[0]=new NodeData(0,"SELECT");
model.addElement(heap[0].job);

String str ="";
for(int g=1; g<=count;g++ ){
   
str= " "+heap[g].num;
  model.addElement(str);    
}
    }
}

public void sort(){

 if(count==0||count==1){printa.setText("Max Heap is either empty or only has one Node ");}
 
 else{
        int n = count; 
  
        // Build heap (rearrange array) 
        for (int i = n / 2 ; i >= 1; i--) 
            HEAPIFY(heap, n, i); 
        

     printa.setText("Sucessful");
 }
}



public void deletemax(){
    
   
    if(count==0){printa.setText("Max Heap is empty");}
    
    
    else{
    
printa.setText("Deletion Sucessful\n"+"\nJob:"+heap[1].job+"\nPRIORITY:"+heap[1].num);
     
         heap[1]  =  heap[count] ; 
              
    

added--;
count--;
ci--;

HEAPIFY(heap,count,1);



    }


}



public void delete(){

    if(count==0){printa.setText("Max Heap is empty");}
    else{
model.removeElementAt(added);
added--;
count--;
ci--;


printa.setText("Deletion Sucessful");

    }
}



public void change(){

    
    if("".equals(jOB.getText())||"".equals(jOB.getText())){printa.setText("Please re-enter a Job and a Priority");}
    
    else{
    
if(count==0){printa.setText("Max Heap is  empty");}


else{
    
heap[c.getSelectedIndex()]=new NodeData(Integer.parseInt(jOB.getText()),jOB2.getText());    ;


HEAPIFY(heap,count,1);
printa.setText("Change Sucessful");


}
    }
}


public void print(){
    
    if(count==0){printa.setText("Max Heap is  empty");}
    else{
String str="";
for(int i=1; i<=count;i++){


 str+= "\nJob: "+heap[i].job+"\n"+"PRIORITY: "+heap[i].num+"\n"+"POSITION: "+i+"\n";


}
 printa.setText(str);


    }


}
    
  public void createheap(){

     
if("".equals(pCHANGE.getText())||"".equals(jOB1.getText())){printa.setText("Please enter a Job and a Priority");}
else{  

heap[ci]=new NodeData(Integer.parseInt(pCHANGE.getText()),jOB1.getText());;
ci++;
if (ci>heap.length-1){printa.setText("Queue is full");}

count++;




printa.setText("Added\nJob: "+jOB1.getText()+"\nPRIORITY: "+pCHANGE.getText()+"\nSucessfully\nWhen finished adding please select HEAPIFY to arange list according to Priority");

pCHANGE.setText("");
jOB1.setText("");

String str = ""+heap[added+1].num;
      model.addElement(str);
           added++; 
   
   
}
  }
    


    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
        
        if (ae.getActionCommand().equalsIgnoreCase("ADD")) {
             
            createheap();
   
      
       
        }
        
        if (ae.getActionCommand().equalsIgnoreCase("HEAPIFY")) {
             
            sort();
        }
        
        
        if (ae.getActionCommand().equalsIgnoreCase("DELETE MAX")) {
             
            deletemax();
        }
        
        
        if (ae.getActionCommand().equalsIgnoreCase("DELETE")) {
             
            delete();
        }
        
        
        if (ae.getActionCommand().equalsIgnoreCase("PRINT")) {
             
            print();
        }
        
        
        if (ae.getActionCommand().equalsIgnoreCase("CHANGE")) {
             
            change();
        }
        

        jOB2.addMouseListener(new MouseAdapter(){
   public void mouseReleased(MouseEvent e) {
    jOB2.setText("");
   }
});
        

        
     
        
    }
    
    
   
    
    
}
