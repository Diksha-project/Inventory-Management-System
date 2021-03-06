
package inventorymanagement.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AddItems implements ActionListener{
    JFrame f;
    JButton b1,b2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
        AddItems(){
            
             f = new JFrame("Add Items");
         f.setLayout(null);
         f.setSize(700,800);
         f.setLocation(200,50);
         
        
          
          l1 = new JLabel("ItemName");
          l1.setLayout(null);
          l1.setBounds(50,50,270,50);
          l1.setFont(new Font("serif",Font.ITALIC,20));
          f.add(l1);
          t1 = new JTextField();
           t1.setBounds(300,70,180,25);
           f.add(t1);
           
           
           
           
          
          l2 = new JLabel(" ItemCategory");
           l2.setLayout(null);
          l2.setBounds(50,100,270,50);
          l2.setFont(new Font("serif",Font.ITALIC,20));
          f.add(l2);
          t2 = new JTextField();
           t2.setBounds(300,120,180,25);
           f.add(t2);
           
           
           
           
          
          l3 = new JLabel(" ItemQuantity");
           l3.setLayout(null);
          l3.setBounds(50,150,250,50);
          l3.setFont(new Font("serif",Font.ITALIC,20));
          f.add(l3);
          t3 = new JTextField();
           t3.setBounds(300,170,180,25);
           f.add(t3);
           
           
           
           
          
          l4= new JLabel("ItemUnit");
           l4.setLayout(null);
          l4.setBounds(50,200,100,50);
          l4.setFont(new Font("serif",Font.ITALIC,20));
          f.add(l4);
          t4 = new JTextField();
           t4.setBounds(300,220,180,25);
           f.add(t4);
           
           
           
           
          
          l5 = new JLabel("ItemUnitPrice");
           l5.setLayout(null);
          l5.setBounds(50,250,100,50);
          l5.setFont(new Font("serif",Font.ITALIC,20));
          f.add(l5);
          t5 = new JTextField();
           t5.setBounds(300,270,180,25);
           f.add(t5);
           
           
           
           
          
          l6 = new JLabel("ItemStatus");
           l6.setLayout(null);
          l6.setBounds(50,300,100,50);
          l6.setFont(new Font("serif",Font.ITALIC,20));
          f.add(l6);
          t6 = new JTextField();
           t6.setBounds(300,320,180,25);
           f.add(t6);
           
           
           
          
           
           
           b1 = new JButton("SUBMIT");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(50,500,150,40);
        b1.addActionListener(this);
       
        f.add(b1);
        
      
        
         b2 = new JButton("CANCEL");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300,500,150,40);
       b2.addActionListener(this);
        f.add(b2);
           
         f.setVisible(true);
         

}
        public void actionPerformed(ActionEvent ae){
             String aa = t1.getText();
        String bb = t2.getText();
        String cc = t3.getText();
        String dd = t4.getText();
        String ee = t5.getText();
        String fff = t6.getText();
     
        
        if(ae.getSource()== b1){
            try{
                conn co = new conn();
               
               String qe = "insert into ItemDetails values('"+aa+"','"+bb+"','"+cc+"','"+dd+"','"+ee+"','"+fff+"')";
               co.s.executeUpdate(qe);
               JOptionPane.showMessageDialog(null, "Details Successfully Inserted");
               f.setVisible(false);
               new Front();
                }catch(Exception ex){
                    System.out.println("The error is:"+ex);
                }
            
        }
        if(ae.getSource() == b2){
                        
              f.setVisible(false);
               Front d1 = new Front();
                }  
        
        
     }   
        
   public static void main(String[] args){
       new AddItems();
   } 
}
