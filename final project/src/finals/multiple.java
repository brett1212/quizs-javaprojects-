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
public class multiple extends JFrame implements ActionListener{
    
     JTextArea printa = new JTextArea();
    JScrollPane scroll = new JScrollPane (printa);
    
    JButton nex = new JButton("NEXT >>");  
    JButton res = new JButton("RESULTS");
    JButton bac = new JButton("BACK");
    
    JRadioButton a = new JRadioButton("A");
    JRadioButton b = new JRadioButton("B");
    JRadioButton c = new JRadioButton("C");
    JRadioButton d = new JRadioButton("D");
    ButtonGroup ans = new ButtonGroup();
       
    
    public multiple(){ // this creates the multiple gui
    
    this.setTitle("FINAL");
    this.setSize(460, 600);
    this.setLayout(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    
    this.getContentPane().add(scroll);
    
    this.getContentPane().add(nex);
    this.getContentPane().add(res);
    this.getContentPane().add(bac);
    
    this.getContentPane().add(a);
    this.getContentPane().add(b);
    this.getContentPane().add(c);
    this.getContentPane().add(d);
    
    ans.add(a);
    ans.add(b);
    ans.add(c);
    ans.add(d);
    
    
     scroll.setBounds(20, 60, 400, 360);
     
     a.setBounds(50, 425, 60, 50);
     b.setBounds(150, 425, 60, 50);
     c.setBounds(250, 425, 60, 50);
     d.setBounds(350, 425, 60, 50);
     
     nex.setBounds(80, 480, 100, 30);
     res.setBounds(250, 480, 100, 30);
     bac.setBounds(320, 20, 100, 30);

    
     bac.addActionListener(this);
     nex.addActionListener(this);
     res.addActionListener(this);
     
     printa.setText(curr.heap[1].ques);   
 
     
    }//end of multiple gui constructor
    
      Maxheap curr =gui.top;
      String results="";
      String youra="";
      int correct=0;
      int grade=0;
      
      
 public void test(){ // this starts the test
      
        
       if(curr!= null){// if curr is not null this prints the question to the text area and also stores or answers
    
     
        results+="\n"+curr.heap[1].ques+"\nAnswer:"+curr.heap[1].ans ;
        
        
        if(a.isSelected()){results+="\nYour Answer:A\n";}
       else if(b.isSelected()){results+="\nYour Answer:B\n";}
       else if(c.isSelected()){results+="\nYour Answer:C\n";}
        else{results+="\nYour Answer:D\n";}
        
        
        if(a.isSelected()){youra="A";}
       else if(b.isSelected()){youra="B";}
       else if(c.isSelected()){youra="C";}
       else{youra="D";}
        
  
        if(curr.heap[1].ans.equals(youra)){correct++;}
        
        curr = curr.next;
        if(curr!=null){
        printa.setText(curr.heap[1].ques);}
        
        else{ printa.setText("Exam Finished Please Push Results"+correct);}
        
              
        
        }//end of if
            
       
   
      
 
 

 
 }
 
 public void grade(){// this calculates your answer and prints out a grade and the correct answers
     
  grade=correct/Integer.valueOf(gui.am1.getSelectedIndex())*100;
 
     
 if(grade>=90){results+="\nExcellent: A ";}
 if(grade>=80&&grade<=89){results+="\nVery Good: B ";}
 if(grade>=70&&grade<=79){results+="\nGood: C ";}
 if(grade>=60&&grade<=69){results+="\nPoor: D ";}
 if(grade<60){results+="\nVery Poor: F ";}
 
 
 printa.setText(results+""+grade+""+gui.am1.getSelectedIndex()+""+correct);
 
 
 
 
 
 
 }// end of grade
    
    

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