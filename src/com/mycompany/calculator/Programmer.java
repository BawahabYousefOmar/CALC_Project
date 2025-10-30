/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author WinDows
 */
public class Programmer implements ActionListener{
    JMenuBar fatherMenu ;
    JMenu Mode;
    JButton b1,b2,b3,b4,b5,b6,b7
    ,b8,b9,b10,b11,b12,opsum , opmult ,opdivide, opsub ,C,dot ,opeq,del,pareright , pareleft;
    JButton programmer,covert;
    JTextField text,hextext,dectext,octtext,bintext;
    String que="";
   
    
    
  public  void showCalc_VersionTow(){
        JFrame frame = new JFrame();
        frame.setSize(300, 500);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(1200, 50);
        ImageIcon icon = new ImageIcon("D:you.jpg");
        frame.setIconImage(icon.getImage());
        
        JPanel uppanel = new JPanel();
        uppanel.setBackground(new Color(0xE0E0E0));
        
        JPanel downpanel = new JPanel();
        downpanel.setBackground(new Color(12,85,150));
        
        frame.add(uppanel);
        frame.add(downpanel);
        
        frame.setLayout(new GridLayout(2,1));
        
         b1 = new JButton(" 1 ");
         b1.addActionListener(this);
         b2 = new JButton(" 2 ");
         b2.addActionListener(this);
         b3 = new JButton(" 3 ");
         b3.addActionListener(this);
         b4 = new JButton(" 4 ");
         b4.addActionListener(this);
         b5 = new JButton(" 5 ");
         b5.addActionListener(this);
         b6= new JButton(" 6 ");
         b6.addActionListener(this);
         b7 = new JButton(" 7 ");
         b7.addActionListener(this);
         b8 = new JButton(" 8 ");
         b8.addActionListener(this);
         b9 = new JButton(" 9 ");
         b9.addActionListener(this);
        b10 = new JButton(" 0 ");
        b10.addActionListener(this);
        opsum = new JButton(" + ");
        opsum.addActionListener(this);
        opmult= new JButton(" * ");
        opmult.addActionListener(this);
        opdivide = new JButton(" / ");
        opdivide.addActionListener(this);
        opsub = new JButton(" - "); 
        opsub.addActionListener(this);
         C     = new JButton(" CE ");
          C.setForeground(new Color(0xFCF40F));
          C.setBackground(new Color(0xFF0000));
        C.addActionListener(this);
        dot = new JButton(" . ");
        dot.setFont(new Font("",Font.BOLD,10));
        dot.addActionListener(this);
        opeq = new JButton(" = ");
        opeq.addActionListener(this);
        del = new JButton(" del ");
        del.addActionListener(this);
        pareright = new JButton(" ( ");
        pareright.addActionListener(this);
        pareleft = new JButton(" ) ");
        pareleft.addActionListener(this);
        
        
        
        downpanel.setLayout(new GridLayout(5,4));
        downpanel.add(pareright);downpanel.add(pareleft);downpanel.add(del);downpanel.add(C);
        downpanel.add(b1);downpanel.add(b2);downpanel.add(b3);downpanel.add(opsub);
        downpanel.add(b4);downpanel.add(b5);downpanel.add(b6);downpanel.add(opmult);
        downpanel.add(b7);downpanel.add(b8);downpanel.add(b9);downpanel.add(opsum);
        downpanel.add(b10);downpanel.add(dot);downpanel.add(opdivide);downpanel.add(opeq);
        
         text = new JTextField("                ");
         text.setBounds(90, 200, 100, 30);
         
         uppanel.setLayout(null);
         uppanel.add(text);
         
         JRadioButton hex = new JRadioButton("HEX ");
         hex.setBounds(12,110 ,70, 20);
         JRadioButton dec = new JRadioButton("DEC ");
         dec.setBounds(12,130 ,70, 20);
         JRadioButton oct = new JRadioButton("OCT ");
         oct.setBounds(12,150 ,70, 20);
         JRadioButton  bin = new JRadioButton("BIN ");
         bin.setBounds(12,170 ,70, 20);
         ButtonGroup group = new ButtonGroup();
         group.add(hex);group.add(dec);group.add(oct);group.add(bin);
        
        uppanel.add(hex); uppanel.add(dec); uppanel.add(oct); uppanel.add(bin);
        
        hextext = new JTextField("");
        hextext.setBounds(90, 110, 100, 20);
        uppanel.add(hextext);
        dectext = new JTextField("");
        dectext.setBounds(90, 130, 100, 20);
        uppanel.add(dectext);
        octtext = new JTextField("");
        octtext.setBounds(90, 150, 100, 20);
        uppanel.add(octtext);
        bintext = new JTextField("");
        bintext.setBounds(90, 170, 100, 20);
        uppanel.add(bintext);
        
        
        
        JLabel programLabel  = new JLabel("PROGRAMMER");
        programLabel.setForeground(Color.BLACK);
        programLabel.setFont(new Font("Arial", Font.BOLD, 15));
        programLabel.setBounds(10, 60, 200, 20);
        uppanel.add(programLabel);
        
         Mode =new JMenu("MODE");
         programmer = new JButton("Programmer");
         covert = new JButton ("Units Converting");
         Mode.add(programmer); Mode.add(covert);
        
         
         fatherMenu = new JMenuBar();
         fatherMenu.setBounds(0, 0, 60, 20);
         fatherMenu.add(Mode);
         fatherMenu.setBackground(new Color(0x16DCD6));
         uppanel.add(fatherMenu);
          frame.setVisible(true);   
    }   
  
  public void actionPerformed(ActionEvent e){
     
    if(e.getSource()==b1)
        {
        que = que+"1";
        text.setText(que);
        }
    if(e.getSource()==b2)
            {
        que = que+("2");
        text.setText(que);
            }
    if(e.getSource()==b3)  
        {
         que=que+"3";
         text.setText(que);
        }
    if(e.getSource()==b4)
     {
     que = que.concat("4");
      text.setText(que);
         System.out.println(que);
     }
    if(e.getSource()==b5) 
        {
       que =  que.concat("5");
       text.setText(que);
        }
    if(e.getSource()==b6)
    {
        que = que.concat("6");
        text.setText(que);
    }  
    if(e.getSource()==b7)
    {
     que =   que.concat("7");
       text.setText(que);
    }
    if(e.getSource()==b8)
    {
       que = que.concat("8");
       text.setText(que);
    }
    if(e.getSource()==b9)
    {
       que = que.concat("9");
       text.setText(que);
    }
    if(e.getSource()==b10)
    {
      que = que.concat("0");
      text.setText(que);
    }
    if(e.getSource()==opsum)
       {
       que = que.concat("+");
       text.setText(que);}
       if(e.getSource()==opeq)
       {
         double re = Stack.calc(que);
          text.setText(String.valueOf(re));
       }
       if(e.getSource()==del)
       {
       que = que.substring(0, que.length()-1);
       text.setText(que);
       }
        if(e.getSource()==C)
       {
       que = "";
       text.setText(que);
       }
        if(e.getSource()==opsub)
       {
       que = que.concat("-");
       text.setText(que);
       }
        if(e.getSource()==opmult)
       {
       que = que.concat("*");
       text.setText(que);
       } 
        
       if(e.getSource()==opdivide)
       {
       que = que.concat("/");
       text.setText(que);
       }
         if(e.getSource()==pareright)
       {
       que = que.concat("(");
       text.setText(que);
       }
           if(e.getSource()==pareleft)
       {
       que = que.concat(")");
       text.setText(que);
       }
      if(e.getSource()==dot)
       {
       que = que.concat(".");
       text.setText(que);
       }
   }
   
}
