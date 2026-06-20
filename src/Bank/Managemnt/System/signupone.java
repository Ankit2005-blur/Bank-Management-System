package Bank.Managemnt.System;
import javax.swing.*;
import java.awt.*;
import java.util.*;


public class signupone extends JFrame{

    signupone()
    {
        Random run=new Random();
        Long random=Math.abs((run.nextLong()%9000L)+1000L);
        JLabel formno=new JLabel("APPLICATION FORM NO."+random);
        formno.setBounds(110,-80,500,300);
        formno.setFont(new Font("Oswald",Font.BOLD,20));
        add(formno);

        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image il=image.getImage().getScaledInstance(80,70,Image.SCALE_DEFAULT);
        ImageIcon il2=new ImageIcon(il);
        JLabel log=new JLabel(il2);
        log.setBounds(30,50,80,70);
        add(log);

        JLabel detail=new JLabel("Page 1: Personal Details");
        detail.setBounds(140,-50,300,300);
        detail.setFont(new Font("Oswald",Font.BOLD,15));
        add(detail);

        JLabel name=new JLabel("NAME:");
        name.setBounds(60,0,300,300);
        name.setFont(new Font("Oswald",Font.BOLD,15));
        add(name);

        getContentPane().setBackground(Color.white);
        setSize(500,750);
        setLayout(null);
        setLocation(500,40);
        setTitle("SIGNUP PAGE");
        setVisible(true);



    }
    public static void main(String args[])
    {
        signupone ob=new signupone();
    }
}
