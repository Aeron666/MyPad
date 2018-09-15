/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypad;

/**
 *
 * @author Admin
 */
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class Calc {
    public static void main(String []args){
        JFrame f=new JFrame();
        f.setSize(400,500);
        JTextField t1=new JTextField(20);
        t1.setBounds(05,32,280,60);
        f.add(t1);//text field is added
        JTextArea a1=new JTextArea();
        a1.setBounds(05,94,280,40);
        f.add(a1);//text area is added
        JPasswordField pwd=new JPasswordField();
        pwd.setBounds(281,8,100,20);
        f.add(pwd);//password field is added

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1=new JLabel("View");
        l1.setBounds(05,02,100,30);
        f.add(l1);//View label is added
        JLabel l2=new JLabel("Edit");
        l2.setBounds(40,02,100,30);
        f.add(l2);//Edit label is added
        JLabel l3=new JLabel("Help");
        l3.setBounds(70,02,100,30);
        f.add(l3); //help label is added 
        JButton b1=new JButton("C");
        b1.setBounds(289,32,90,30);
        f.add(b1);
        JButton b2=new JButton("CE");
        b2.setBounds(289, 72, 90, 30);
        f.add(b2);
        JCheckBox cb1= new JCheckBox("blah");
        cb1.setBounds(5,135,50,30);
        f.add(cb1);
        JCheckBox cb2= new JCheckBox("hola",true);
        cb2.setBounds(60,135,50,30);
        f.add(cb2);
        JRadioButton r1= new JRadioButton("User");
        r1.setBounds(150,135,80,30);
        JRadioButton r2=new JRadioButton("Guest");
        r2.setBounds(240,135,80,30);
        ButtonGroup bj1= new ButtonGroup();
        bj1.add(r1);//r1 is add to the group1
        bj1.add(r2);// r2 is added to the group1
        ButtonGroup bj2=new ButtonGroup();
        bj2.add(cb1);//cb1 is added to the group2
        bj2.add(cb2);//cb2 is added to the group2
        f.add(r1);//r1 is added to the frame
        f.add(r2);//r2 is added to the frame
        f.setLayout(null);//layout is set to null
        f.setVisible(true);
    }
}
