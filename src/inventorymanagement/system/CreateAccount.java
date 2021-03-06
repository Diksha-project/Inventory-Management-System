
package inventorymanagement.system;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class CreateAccount implements ActionListener {
    JFrame f;
    JButton b1,b2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    CreateAccount(){
        
         f = new JFrame("Create Account");
         f.setLayout(null);
         f.setSize(700,800);
         f.setLocation(200,50);
         
        
          
          l1 = new JLabel("SALUATION");
          l1.setLayout(null);
          l1.setBounds(50,50,270,50);
          l1.setFont(new Font("serif",Font.ITALIC,20));
          f.add(l1);
          t1 = new JTextField();
           t1.setBounds(300,70,180,25);
           f.add(t1);
           
           
           
           
          
          l2 = new JLabel(" FIRST NAME");
           l2.setLayout(null);
          l2.setBounds(50,100,270,50);
          l2.setFont(new Font("serif",Font.ITALIC,20));
          f.add(l2);
          t2 = new JTextField();
           t2.setBounds(300,120,180,25);
           f.add(t2);
           
           
           
           
          
          l3 = new JLabel(" LAST NAME");
           l3.setLayout(null);
          l3.setBounds(50,150,250,50);
          l3.setFont(new Font("serif",Font.ITALIC,20));
          f.add(l3);
          t3 = new JTextField();
           t3.setBounds(300,170,180,25);
           f.add(t3);
           
           
           
           
          
          l4= new JLabel("GENDER");
           l4.setLayout(null);
          l4.setBounds(50,200,100,50);
          l4.setFont(new Font("serif",Font.ITALIC,20));
          f.add(l4);
          t4 = new JTextField();
           t4.setBounds(300,220,180,25);
           f.add(t4);
           
           
           
           
          
          l5 = new JLabel("MOBILE");
           l5.setLayout(null);
          l5.setBounds(50,250,100,50);
          l5.setFont(new Font("serif",Font.ITALIC,20));
          f.add(l5);
          t5 = new JTextField();
           t5.setBounds(300,270,180,25);
           f.add(t5);
           
           
           
           
          
          l6 = new JLabel("EMAIL");
           l6.setLayout(null);
          l6.setBounds(50,300,100,50);
          l6.setFont(new Font("serif",Font.ITALIC,20));
          f.add(l6);
          t6 = new JTextField();
           t6.setBounds(300,320,180,25);
           f.add(t6);
           
           
           
          l7 = new JLabel("ADDRESS");
           l7.setLayout(null);
          l7.setBounds(50,350,100,50);
          l7.setFont(new Font("serif",Font.ITALIC,20));
          f.add(l7);
          t7 = new JTextField();
           t7.setBounds(300,370,180,25);
           f.add(t7);
                   
                   
                   
                   
          
          l8 = new JLabel("ROLE");
           l8.setLayout(null);
          l8.setBounds(50,400,100,50);
          l8.setFont(new Font("serif",Font.ITALIC,20));
          f.add(l8);
          t8 = new JTextField();
           t8.setBounds(300,420,180,25);
           f.add(t8);
           
           
           
          
          l9 = new JLabel("STATUS");
           l9.setLayout(null);
          l9.setBounds(50,450,100,50);
          l9.setFont(new Font("serif",Font.ITALIC,20));
          f.add(l9);
          t9 = new JTextField();
           t9.setBounds(300,470,180,25);
           f.add(t9);
           
           
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
          String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String ff = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        
        if(ae.getSource()== b1){
            try{
                conn cc = new conn();
               
               String q = "insert into UserDetails values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"')";
               cc.s.executeUpdate(q);
               JOptionPane.showMessageDialog(null, "Details Successfully Inserted");
               f.setVisible(false);
               new Front();
                }catch(Exception ee){
                    System.out.println("The error is:"+ee);
                }
            
        }
        if(ae.getSource() == b2){
                        
              f.setVisible(false);
               Front d1 = new Front();
                }  
        
        
     }   
    
 public static void main(String[] args){
   CreateAccount ac =  new CreateAccount();
 }   
      
}

  


    