package inventorymanagement.system;
import java.awt.Color;

import javax.swing.*;
import java.awt.event.*;


 class Front implements ActionListener {
    JFrame f;
    JButton b1,b2,b3;
    
    Front(){
        f = new JFrame(" Front Page ! ");
        f.setLayout(null);
       f.setSize(500,400);
        f.setLocation(150,150);
        
       
       b1 = new JButton ("Create Account");
       b1.setLayout(null);
       b1.setBounds(30,50,100,30);
       b1.setForeground(Color.BLACK);
       b1.addActionListener(this);
       f.add(b1);
       
       
       b2 = new JButton (" Add Items");
       b2.setLayout(null);
       b2.setBounds(30,100,100,30);
       b2.setForeground(Color.BLACK);
       b2.addActionListener(this);
       f.add(b2);
       
       b3 = new JButton (" UpdateAccDetails");
       b3.setLayout(null);
       b3.setBounds(30,150,100,30);
       b3.setForeground(Color.BLACK);
       b3.addActionListener(this);
       f.add(b3);
      
       
        f.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
           CreateAccount C = new CreateAccount();
            
        }
        
          if(ae.getSource()==b2){
              GetEmail ge= new GetEmail();
           
        }
          
          if(ae.getSource()==b3){
              GetEmail GE= new GetEmail();
           
        }
    }
    public static void main(String [] args){
        Front f= new Front();
    }
    
}