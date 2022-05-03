/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Brett
 */
public class trueandfalse extends JFrame implements ActionListener{
    
     JTextArea printa = new JTextArea();
    JScrollPane scroll = new JScrollPane (printa);
    
    JButton nex = new JButton("NEXT >>");  
    JButton res = new JButton("RESULTS");
    JButton bac = new JButton("BACK");
    
    JRadioButton t = new JRadioButton("TRUE");
    JRadioButton f = new JRadioButton("FALSE");
  
    ButtonGroup ans = new ButtonGroup();
       
    
    public trueandfalse(){ //this creates the true and false gui
    
    this.setTitle("FINAL");
    this.setSize(460,600);
    this.setLayout(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    
    this.getContentPane().add(scroll);
    
    this.getContentPane().add(nex);
    this.getContentPane().add(res);
    this.getContentPane().add(bac);
    
    this.getContentPane().add(t);
    this.getContentPane().add(f);
    
    ans.add(t);
    ans.add(f);
   
    
    
     scroll.setBounds(20, 60, 400, 360);
     
     t.setBounds(100, 425, 100, 50);
     f.setBounds(280, 425, 100, 50);  
     
     nex.setBounds(80, 480, 100, 30);
     res.setBounds(250, 480, 100, 30);
     bac.setBounds(320, 20, 100, 30);
    
     
    bac.addActionListener(this);
    res.addActionListener(this);
    nex.addActionListener(this);
          
    printa.setText(curr.heap[1].ques);   

    
    }// end true and false gui constructor
    
    Maxheap curr =gui.top;
      String results="";
      String youra="";
      int correct=0;
      int grade=0;
    
    public void test(){ // this starts the test
      
        
       if(curr!= null){// if curr is not null this prints the question to the text area and also stores or answers
    
     
        results+="\n"+curr.heap[1].ques+"\nAnswer:"+curr.heap[1].ans ;
        
        
        if(t.isSelected()){results+="\nYour Answer:T\n";}
        else{results+="\nYour Answer:F\n";}
        
        
        if(t.isSelected()){youra="T";}
       else{youra="F";}
        
  
        if(curr.heap[1].ans.equals(youra)){correct++;}
        
        curr = curr.next;
        if(curr!=null){
        printa.setText(curr.heap[1].ques);}
        
        else{ printa.setText("Exam Finished Please Push Results"+correct);}
        
              
        
        }//end if
            
       
   
      
 
 

 
 }
    
  public void grade(){// this calculates your answer and prints out a grade and the correct answers
     
  grade=correct/Integer.valueOf(gui.am1.getSelectedIndex())*100;
 
     
 if(grade>=90){results+="\nExcellent: A ";}
 if(grade>=80&&grade<=89){results+="\nVery Good: B ";}
 if(grade>=70&&grade<=79){results+="\nGood: C ";}
 if(grade>=60&&grade<=69){results+="\nPoor: D ";}
 if(grade<60){results+="\nVery Poor: F ";}
 
 
 printa.setText(results+""+grade+""+gui.am1.getSelectedIndex()+""+correct);
 
 
 
 
 
 
 }   
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
  if (ae.getActionCommand().equalsIgnoreCase("BACK")) {      
        
         this.dispose();
         new gui();
  
  }
  
  
  if (ae.getActionCommand().equalsIgnoreCase("NEXT >>")) {      
            
        test();
        
    }  
        
  
  if (ae.getActionCommand().equalsIgnoreCase("RESULTS")) {      
            
        grade();
        
    }
  
    }  
        
        
        
    }
    
    
    
    

