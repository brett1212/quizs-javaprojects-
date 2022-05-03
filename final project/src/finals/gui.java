/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finals;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Brett
 */
public class gui extends JFrame implements ActionListener{

    JLabel am = new JLabel("TYPE:");
    JLabel ty = new JLabel("AMOUNT:");
    Maxheap n;
  
     static JComboBox am1 = new JComboBox();
   static  JComboBox ty1 = new JComboBox();
  
    
    JButton gen = new JButton("GENERATE");
    
    public gui(){ // creates the gui 
    
     this.setTitle("FINAL");
    this.setSize(340, 260);
    this.setLayout(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    
    this.getContentPane().add(am);
    this.getContentPane().add(ty);
    
    
    this.getContentPane().add(am1);
    this.getContentPane().add(ty1);
    
    
    this.getContentPane().add(gen);
    
    
    am.setBounds(80, 20, 60, 50);
    ty.setBounds(80, 80, 60, 50);
    
    
    ty1.setBounds(160, 30, 110, 30);
    am1.setBounds(160, 90, 110, 30);
    
    
    gen.setBounds(130, 150, 100, 30);
    
  
      am1.addItem("SELECT");
      am1.addItem("1");
      am1.addItem("2");
      am1.addItem("3");
      am1.addItem("4");
      am1.addItem("5");
      am1.addItem("6");
      am1.addItem("7");
      am1.addItem("8");
      am1.addItem("9");
      am1.addItem("10");
      am1.addItem("11");
      am1.addItem("12");
      am1.addItem("13");
      am1.addItem("14");
      am1.addItem("15");
    
    
  
    ty1.addItem("SELECT");
    ty1.addItem("MULTIPLE CHOICE");
    ty1.addItem("TRUE/FALSE");
    
    
    gen.addActionListener(this);
    am1.addActionListener(this);
    
    }// end of gui constructor

   
     static int mc=0;
   static int tf=75;
     
    static Maxheap top = null;
    
    public void add(Maxheap n) throws IOException{// creates the linklist that would hold the max heap
    
        Maxheap np;
        
        np =new Maxheap(n);
        
        if(top == null) top = np;
        
        else{//start else
        
            Maxheap curr = top;
            
            while(curr.next!=null){//start while
            
            curr = curr.next;  //finding Last
            }//end while
            
            curr.next = np;
            
        }//end else
        
                  
    }//end of add method
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
         if (ae.getActionCommand().equalsIgnoreCase("GENERATE")) {
             
            if("MULTIPLE CHOICE".equals(ty1.getSelectedItem().toString())){//if multiple choice is chosen this creates the max heap and bring up the multiple choice gui

                for(int i = 0;i<am1.getSelectedIndex();i++ ){
                try {
                    add(n);
                } catch (IOException ex) {
                    Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
             this.dispose();
             new multiple();}
            
            
            
            else if ("TRUE/FALSE".equals(ty1.getSelectedItem().toString())){//if true or false is chosen this creates the max heap and bring up the true or false gui
             
                
                   for(int i = 0;i<am1.getSelectedIndex();i++ ){
                try {
                    add(n);
                } catch (IOException ex) {
                    Logger.getLogger(gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
                
                
             this.dispose();
             new trueandfalse();}
   
      
       
        }
        
         
        
        
        
    }
    
}
