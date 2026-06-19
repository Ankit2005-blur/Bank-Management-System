package Bank.Managemnt.System;

import javax. swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
JButton login,clear,signup;
JTextField cardtextfield;
JPasswordField pintextfield;
Login()
{
    ImageIcon il=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
    Image io=il.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
    ImageIcon i2=new ImageIcon(io);
    JLabel label=new JLabel(i2);
    label.setBounds(80,50,100,100);
      add(label);

      JLabel text=new JLabel("WELCOME TO BANK");
      text.setBounds(190,30,480,150);
      text.setFont(new Font("Oswald",Font.BOLD,30));
      add(text);

      JLabel cardno=new JLabel("CARD NUMBER :");
         cardno.setBounds(190,120,200,100);
         cardno.setFont(new Font("Oswald",Font.BOLD,20));
         add(cardno);

         JLabel pin=new JLabel("PIN :");
         pin.setBounds(190,160,200,100);
         pin.setFont(new Font("Oswald",Font.BOLD,20));
         add(pin);

         cardtextfield=new JTextField();
         cardtextfield.setBounds(360,150,300,30);
         cardtextfield.setFont(new Font("Oswald", Font.PLAIN,20));
         add(cardtextfield);

         pintextfield=new JPasswordField();
        pintextfield.setBounds(360,190,300,30);
        pintextfield.setFont(new Font("Oswald", Font.PLAIN,20));
         add(pintextfield);

          login=new JButton("SIGN IN");
         login.setBounds(360,240,150,30);
         login.setBackground(Color.BLACK);
         login.setForeground(Color.WHITE);
         login.addActionListener(this);
         add(login);

          clear=new JButton("CLEAR");
         clear.setBounds(520,240,150,30);
         clear.setBackground(Color.BLACK);
         clear.setForeground(Color.WHITE);
         clear.addActionListener(this);
         add(clear);

          signup=new JButton("SIGN UP");
          signup.setBounds(450,300,150,30);
          signup.setBackground(Color.BLACK);
          signup.setForeground(Color.WHITE);
          signup.addActionListener(this);
          add(signup);

    setSize(800,400);
    setLayout(null);
    setLocation(350,180);
    setTitle("AUTOMATED TELLER MACHINE");
    getContentPane().setBackground(Color.white);
     setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==clear)
    {
        cardtextfield.setText("");
        pintextfield.setText("");
    }
    else if(ae.getSource()==login)
    {

    }
    else if(ae.getSource()==signup)
    {

    }

}
public static void main(String args[])
{

    Login ob=new Login();
}

}
