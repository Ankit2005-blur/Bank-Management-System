package Bank.Managemnt.System;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class signupone extends JFrame implements ActionListener{
    JButton next;
    signupone()
    {
        Random run=new Random();
        Long random=Math.abs((run.nextLong()%9000L)+1000L);
        JLabel formno=new JLabel("APPLICATION FORM NO. "+random);
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

        JLabel name=new JLabel("Name:");
        name.setBounds(60,0,300,300);
        name.setFont(new Font("Oswald",Font.BOLD,15));
        add(name);

        JTextField nametextfield=new JTextField();
        nametextfield.setBounds(180,140,280,20);
        nametextfield.setFont(new Font("Oswald",Font.BOLD,15));
        add(nametextfield);


        JLabel fname=new JLabel("Father's Name:");
        fname.setBounds(60,40,300,300);
        fname.setFont(new Font("Oswald",Font.BOLD,15));
        add(fname);

        JTextField fnametextfield=new JTextField();
        fnametextfield.setBounds(180,180,280,20);
        fnametextfield.setFont(new Font("Oswald",Font.BOLD,15));
        add(fnametextfield);


        JLabel dob=new JLabel("Date of Birth:");
        dob.setBounds(60,80,300,300);
        dob.setFont(new Font("Oswald",Font.BOLD,15));
        add(dob);

        JDateChooser date=new JDateChooser();
        date.setBounds(180,220,280,20);
        date.setForeground(Color.BLACK);
        add(date);


        JLabel gender =new JLabel("Gender:");
        gender.setBounds(60,120,300,300);
        gender.setFont(new Font("Oswald",Font.BOLD,15));
        add(gender);

        JRadioButton male=new JRadioButton("Male");
        male.setBounds(180,260,70,20);
        add(male);

        JRadioButton female=new JRadioButton("Female");
        female.setBounds(280,260,70,20);
        add(female);

        JRadioButton other=new JRadioButton("Other");
        other.setBounds(390,260,70,20);
        add(other);


        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);


        JLabel email=new JLabel("Email Address:");
        email.setBounds(60,160,300,300);
        email.setFont(new Font("Oswald",Font.BOLD,15));
        add(email);

        JTextField emailtextfield=new JTextField();
        emailtextfield.setBounds(180,300,280,20);
        emailtextfield.setFont(new Font("Oswald",Font.BOLD,15));
        add(emailtextfield);


        JLabel marital =new JLabel("Marital Status:");
        marital.setBounds(60,200,300,300);
        marital.setFont(new Font("Oswald",Font.BOLD,15));
        add(marital);

        JRadioButton married=new JRadioButton("Married");
        married.setBounds(180,340,100,20);
        add(married);

        JRadioButton unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(320,340,100,20);
        add(unmarried);

        ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);



        JLabel address =new JLabel("Address:");
        address.setBounds(60,240,300,300);
        address.setFont(new Font("Oswald",Font.BOLD,15));
        add(address);

        JTextField addtextfield=new JTextField();
        addtextfield.setBounds(180,380,280,20);
        addtextfield.setFont(new Font("Oswald",Font.BOLD,15));
        add(addtextfield);


        JLabel city =new JLabel("City:");
        city.setBounds(60,280,300,300);
        city.setFont(new Font("Oswald",Font.BOLD,15));
        add(city);

        JTextField citytextfield=new JTextField();
        citytextfield.setBounds(180,420,280,20);
        citytextfield.setFont(new Font("Oswald",Font.BOLD,15));
        add(citytextfield);


        JLabel pin =new JLabel("Pin Code:");
        pin.setBounds(60,320,300,300);
        pin.setFont(new Font("Oswald",Font.BOLD,15));
        add(pin);

        JTextField pintextfield=new JTextField();
        pintextfield.setBounds(180,460,280,20);
        pintextfield.setFont(new Font("Oswald",Font.BOLD,15));
        add(pintextfield);


        JLabel state =new JLabel("State:");
        state.setBounds(60,360,300,300);
        state.setFont(new Font("Oswald",Font.BOLD,15));
        add(state);

        JTextField statetextfield=new JTextField();
        statetextfield.setBounds(180,500,280,20);
        statetextfield.setFont(new Font("Oswald",Font.BOLD,15));
        add(statetextfield);

        next=new JButton("Next");
        next.setBounds(180,550,150,20);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(Color.white);
        setSize(500,750);
        setLayout(null);
        setLocation(500,40);
        setTitle("SIGNUP PAGE");
        setVisible(true);



    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==next)
        {

        }
    }
    public static void main(String args[])
    {
        signupone ob=new signupone();
    }
}
