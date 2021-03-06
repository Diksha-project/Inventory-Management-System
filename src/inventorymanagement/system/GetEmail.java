
package inventorymanagement.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class GetEmail implements ActionListener {
    JFrame f;
    JLabel l1;
    JTextField t1;
    JButton b1;
    GetEmail(){
          f = new JFrame(" GetEmail ");
        f.setLayout(null);
       f.setSize(500,400);
        f.setLocation(150,150);
        
         l1 = new JLabel("EMAIL");
          l1.setLayout(null);
          l1.setBounds(50,50,270,50);
          l1.setFont(new Font("serif",Font.ITALIC,20));
          f.add(l1);
          t1 = new JTextField();
           t1.setBounds(200,70,180,25);
           f.add(t1);
           
            
           b1 = new JButton("SUBMIT");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(70,150,150,40);
        b1.addActionListener(this);
       
        f.add(b1);
        f.setVisible(true);
           
    }
    public void actionPerformed(ActionEvent ae){
        try{
            conn cl = new conn();
            String u = t1.getText();
            String q = "Select * from UserDetails where Email = '"+t1+"'";
            ResultSet rs = cl.s.executeQuery(q);
            if(rs.next()){
                new UpdateAccDetails(u).f.setVisible(true);
                f.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"Invalid Email");
                f.setVisible(false);
            }
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    
    }
    
    public static void main(String[] args){
        new GetEmail();
    }
}
