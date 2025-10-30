/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.function.Predicate;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author WinDows
 */
public class standradFrame implements ActionListener,ItemListener {
   JFrame frame;
    JPanel downpanel,uppanel;
    JMenuBar fatherMenu ;
    JMenu Mode,Setting;
    JCheckBox precise,nightMode;
    JRadioButton hex,dec,oct,bin;
    JButton b1,b2,b3,b4,b5,b6,b7
    ,b8,b9,b10,b11,b12,opsum , opmult ,opdivide, opsub ,
     C,dot ,opeq,del,pareright , pareleft, arthemtictoright,arthemtictoleft
     ,squareRoot,reminder;
    JButton Standard,programmer,covert;//of Mode menu
    JButton Abutton,Bbutton,Cbutton,Dbutton,Ebutton,Fbutton;//inprogram mode
    JTextField text,hextext,dectext,octtext,bintext;
    JLabel clacLabel ;
    String que="",hiden="";
   
    
    
  public  void showCalc_VersionTow(){
        frame = new JFrame();
        frame.setTitle("CLAC"); 
        frame.setSize(300, 500);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(1200, 50);
        ImageIcon icon = new ImageIcon("D:you.jpg");
        frame.setIconImage(icon.getImage());
        
        uppanel = new JPanel();
        uppanel.setBackground(new Color(0xE0E0E0));
        
        downpanel = new JPanel();
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
        del = new JButton("del");//U+007F
        del.addActionListener(this);
        pareright = new JButton(" ( ");
        pareright.addActionListener(this);
        pareleft = new JButton(" ) ");
        pareleft.addActionListener(this);
        arthemtictoright = new JButton(" << ");
        arthemtictoright.addActionListener(this);
        arthemtictoleft = new JButton(" >> ");
        arthemtictoleft.addActionListener(this);
        reminder = new JButton (" % ");
        /*JButton button = new JButton(icon);
        button.setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);*/
        ImageIcon square = new ImageIcon("D:\\study hungary\\arch\\squareRoot2.png");
         Image resizedImage = square.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
         ImageIcon newIcon = new ImageIcon(resizedImage);
         squareRoot = new JButton(newIcon);
//        squareRoot.setIcon();
//        squareRoot.setPreferredSize(new Dimension(20,20));
//        squareRoot.setContentAreaFilled(true);
//        squareRoot.setBorderPainted(false);
        squareRoot.addActionListener(this);
        
        Abutton = new JButton(" A ");
        Abutton.addActionListener(this);
        Bbutton = new JButton(" B ");
        Bbutton.addActionListener(this);
        Cbutton = new JButton(" C ");
        Cbutton.addActionListener(this);
        Dbutton = new JButton(" D ");
        Dbutton.addActionListener(this);
        Ebutton = new JButton(" E ");
        Ebutton.addActionListener(this);
        Fbutton = new JButton(" F ");
        Fbutton.addActionListener(this);
        
        
        downpanel.setLayout(new GridLayout(6,4));
        
        downpanel.add(arthemtictoright);downpanel.add(arthemtictoleft);downpanel.add(del);downpanel.add(C);
        //second line 
        downpanel.add(pareright);downpanel.add(pareleft);downpanel.add(squareRoot);downpanel.add(opdivide);
        downpanel.add(b1);downpanel.add(b2);downpanel.add(b3);downpanel.add(opmult);
        downpanel.add(b4);downpanel.add(b5);downpanel.add(b6);downpanel.add(opsub);
        downpanel.add(b7);downpanel.add(b8);downpanel.add(b9);downpanel.add(opsum);
        downpanel.add(b10);downpanel.add(dot);downpanel.add(reminder);downpanel.add(opeq);
        
         text = new JTextField("                ");
         text.setBounds(90, 200, 100, 30);
         
         uppanel.setLayout(null);
         uppanel.add(text);
         
         hex = new JRadioButton("HEX ");
         hex.setBounds(12,110 ,70, 20);
         hex.addActionListener(this);
         hex.addItemListener(this);
         dec = new JRadioButton("DEC ");
        dec.setBounds(12,130 ,70, 20);
        dec.addActionListener(this);
         oct = new JRadioButton("OCT ");
         oct.setBounds(12,150 ,70, 20);
         oct.addActionListener(this);
         bin = new JRadioButton("BIN ");
        bin.setBounds(12,170 ,70, 20);
        bin.addActionListener(this);
         ButtonGroup group = new ButtonGroup();
         group.add(hex);group.add(dec);group.add(oct);group.add(bin);
         
        hextext = new JTextField("");
        hextext.setBounds(90, 110, 100, 20);
       
        dectext = new JTextField("");
        dectext.setBounds(90, 130, 100, 20);
        
        octtext = new JTextField("");
        octtext.setBounds(90, 150, 100, 20);
       
        bintext = new JTextField("");
        bintext.setBounds(90, 170, 100, 20);
       
//        uppanel.add(hex); uppanel.add(dec); uppanel.add(oct); uppanel.add(bin);
        
        clacLabel  = new JLabel("STANDRAD");
        clacLabel.setForeground(Color.BLACK);
        clacLabel.setFont(new Font("Arial", Font.BOLD, 15));
        clacLabel.setBounds(10, 60, 200, 20);
        uppanel.add(clacLabel);
        // MODE menu
         Mode =new JMenu("MODE");
         programmer = new JButton("Programmer");
         programmer.addActionListener(this);
         Standard = new JButton("Standrad");
         Standard.addActionListener(this);
         covert = new JButton ("Units Converting");
         Mode.add(programmer); Mode.add(covert);
        //  setting menu
          Setting = new JMenu("Setting");
          precise = new JCheckBox("precise");
          precise.addActionListener(this);
          nightMode = new JCheckBox("night mode");
          nightMode.addActionListener(this);
          Setting.add(nightMode);
          // JMenuBar
         fatherMenu = new JMenuBar();
         fatherMenu.setBounds(0, 0, 120, 22);
         fatherMenu.add(Mode);
         fatherMenu.add(Setting);
         fatherMenu.setBackground(new Color(0x16DCD6));
         uppanel.add(fatherMenu);
          frame.setVisible(true);   
    }   
  
   @Override
    public void itemStateChanged(ItemEvent e) {
//      if(hex.isSelected())
//            System.out.println("select");
    }
  
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==programmer){
      que = "";
      hiden="";
      uppanel.add(hex); uppanel.add(dec); uppanel.add(oct); uppanel.add(bin);
      Setting.add(precise);
      Mode.remove(programmer);
      Mode.add(Standard);
      uppanel.add(hextext);
      uppanel.add(dectext);
      uppanel.add(octtext);
      uppanel.add(bintext);
      clacLabel.setText("programmer");
      frame.setVisible(true);
      downpanel.setLayout(new GridLayout(6,5));
       downpanel.add(Abutton);downpanel.add(arthemtictoright);downpanel.add(arthemtictoleft);downpanel.add(del);downpanel.add(C);
       downpanel.add(Bbutton);downpanel.add(pareright);downpanel.add(pareleft);downpanel.add(squareRoot);downpanel.add(opdivide);
       downpanel.add(Cbutton); downpanel.add(b1);downpanel.add(b2);downpanel.add(b3);downpanel.add(opmult);
       downpanel.add(Dbutton); downpanel.add(b4);downpanel.add(b5);downpanel.add(b6);downpanel.add(opsub);
       downpanel.add(Ebutton); downpanel.add(b7);downpanel.add(b8);downpanel.add(b9);downpanel.add(opsum);
       downpanel.add(Fbutton); downpanel.add(b10);downpanel.add(dot);downpanel.add(reminder);downpanel.add(opeq);
       
       frame.setVisible(true);
       
      
    }
    if(e.getSource()==Standard){
      uppanel.remove(hex); uppanel.remove(dec); uppanel.remove(oct); uppanel.remove(bin);
      Mode.remove(Standard);
      Mode.add(programmer);
      uppanel.remove(hextext);
      uppanel.remove(dectext);
      uppanel.remove(octtext);
      uppanel.remove(bintext);
      // remove buttons
      downpanel.remove(Abutton);    downpanel.remove(Bbutton); 
      downpanel.remove(Cbutton);   downpanel.remove(Dbutton);
         downpanel.remove(Ebutton);   downpanel.remove(Fbutton);
      frame.setVisible(true);
    }  
    
    //Radio buttons
    
//    if(e.getSource()==hex){
//    String x = String.valueOf(Stack.calc(que));
//     x = String.valueOf(Decimal.hexaFloatToDecimal(x));
//     dectext.setText(x);
//    }

    if(nightMode.isSelected())
    {
        uppanel.setBackground(new Color(0x343a45));
        fatherMenu.setBackground(new Color(0x248f2));
        text.setBackground(new Color(0x878c87));
    }
    else
    {
      uppanel.setBackground(Color.red);
    }
    if(e.getSource()==b1)
        {
        que = que+"1";
        hiden= hiden+"1";
        text.setText(que);
        
       
        }
    if(e.getSource()==b2)
            {
        que = que+("2");
        hiden= hiden+"2";
        text.setText(que);
            }
    if(e.getSource()==b3)  
        {
         que=que+"3";
         hiden= hiden+"3";
         text.setText(que);
        }
    if(e.getSource()==b4)
     {
     que = que.concat("4");
     hiden= hiden+"4";
      text.setText(que);
         System.out.println(que);
     }
    if(e.getSource()==b5) 
        {
       que =  que.concat("5");
       hiden= hiden+"5";
       text.setText(que);
        }
    if(e.getSource()==b6)
    {
        que = que.concat("6");
        hiden= hiden+"6";
        text.setText(que);
    }  
    if(e.getSource()==b7)
    {
     que =   que.concat("7");
     hiden= hiden+"7";
       text.setText(que);
    }
    if(e.getSource()==b8)
    {
       que = que.concat("8");
       hiden= hiden+"8";
       text.setText(que);
    }
    if(e.getSource()==b9)
    {
       que = que.concat("9");
       hiden= hiden+"9";
       text.setText(que);
    }
    if(e.getSource()==b10)
    {
      que = que.concat("0");
      hiden= hiden+"0";
      text.setText(que);
    }
    if(e.getSource()==opsum)
       {
       que = que.concat("+");
       hiden= hiden+"+";
       text.setText(que);}
      
       if(e.getSource()==del)
       {
       if(que.length()>0)
       que = que.substring(0, que.length()-1);
       if(hiden.length()>0)
       hiden = hiden.substring(0,hiden.length()-1);
       text.setText(que);
       }
        if(e.getSource()==C)
       {
       que = "";
       hiden= "";
       text.setText(que);
       }
        if(e.getSource()==opsub)
       {
       que = que.concat("-");
       hiden= hiden+"-";
       text.setText(que);
       }
        if(e.getSource()==opmult)
       {
       que = que.concat("*");
       hiden= hiden+"*";
       text.setText(que);
       } 
        
       if(e.getSource()==opdivide)
       {
       que = que.concat("/");
       hiden= hiden+"/";
       text.setText(que);
       }
         if(e.getSource()==pareright)
       {
       que = que.concat("(");
       hiden= hiden+"(";
       text.setText(que);
       }
           if(e.getSource()==pareleft)
       {
       que = que.concat(")");
       hiden= hiden+")";
       text.setText(que);
       }
      if(e.getSource()==dot)
       {
       que = que.concat(".");
       hiden= hiden+".";
       text.setText(que);
       }
      if(e.getSource()==arthemtictoright)
      {
      que =  que.concat("<<");
      hiden= hiden.concat("/2");
      text.setText(que);
      }
      if(e.getSource()==arthemtictoleft)
      {
      que =  que.concat(">>");
      hiden= hiden.concat("*2");
      text.setText(que);
      }
       if(e.getSource()==squareRoot)
      {
      double re = Stack.calc(que);
      que = String.valueOf(Math.sqrt(re));
        if(precise.isSelected())
             text.setText(que);
        else{
            text.setText(que.replaceAll("(\\.\\d{2})\\w*", "$1"));
            }
         hiden= que;
            }
      if(e.getSource()==Abutton)
      {
       que = que.concat("A");
       hiden= hiden+"A";
       text.setText(que);
      }   
       
     if(e.getSource()==Bbutton)
      {
       que = que.concat("B");
       hiden= hiden+"B";
       text.setText(que);
      }   
     if(e.getSource()==Cbutton)
      {
       que = que.concat("C");
       hiden= hiden+"C";
       text.setText(que);
      }   
     if(e.getSource()==Dbutton)
      {
       que = que.concat("D");
       hiden= hiden+"D";
       text.setText(que);
      }   
     if(e.getSource()==Ebutton)
      {
       que = que.concat("E");
       hiden= hiden+"E";
       text.setText(que);
      } 
    if(e.getSource()==Fbutton)
      {
       que = que.concat("F");
       hiden= hiden+"F";
       text.setText(que);
      }
    
      if(e.getSource()==opeq)
       {
      Predicate<JRadioButton> Ischoosed = i -> i.isSelected();
      System.out.println(que.matches("[0-9./*\\+-]+"));
     if(Ischoosed.test(hex)||Ischoosed.test(dec)||Ischoosed.test(oct)
             ||Ischoosed.test(bin)){
        if(hex.isSelected()){
         que = recievehex(hiden);
         double re = Stack.calc(que);
       
         que = String.valueOf(re);
         hiden = que;
         if(precise.isSelected())
             {
               text.setText(Decimal.decimalFloatToHexa(que));
             }
         else
             {
                 text.setText(Decimal.decimalFloatToHexa(que).replaceAll("(\\.\\d{2})\\w*", "$1"));             
              }
        }
        else if(dec.isSelected())
        {// the number in decimal no need to convert.
                double re = Stack.calc(que);
                System.out.println("re "+re);
                que = String.valueOf(re);
                hiden = que;
             if(precise.isSelected())
             {
               text.setText(que);
             }
             else
             {
                 text.setText((que).replaceAll("(\\.\\d{2})\\w*", "$1"));             
              }
        }
        else if(oct.isSelected())
        {
          que = recieveoct(hiden);
          System.out.println(que + " he "+hiden);
          double re = Stack.calc(que);
          System.out.println("re "+re);
          que = String.valueOf(re);
          hiden = que;
           if(precise.isSelected())
             {
//                presiceSelected();
                text.setText(Decimal.decimalFloatToOctel(que));
             }
           else
             {
//                presiceNotSelected();
                text.setText(Decimal.decimalFloatToOctel(que).replaceAll("(\\.\\d{2})\\w*", "$1"));             
              }
          }
        else if(bin.isSelected())
        {
          que = recievebin(hiden);
          double re = Stack.calc(que);
          que = String.valueOf(re);
          hiden = que;
            if(precise.isSelected())
             {
//                presiceSelected();
                text.setText(Decimal.decimalFloatToBinary(que));
             }
           else
             {
//                presiceNotSelected();
                text.setText(Decimal.decimalFloatToBinary(que).replaceAll("(\\.\\d{2})\\w*", "$1"));             
              }
          
        }
        if(precise.isSelected())
            presiceSelected();
        else
            presiceNotSelected();
           
     }
        else{
         double re = Stack.calc(hiden);
         que = (String.valueOf(re));
         hiden= que;
         text.setText(que);}
       }
   }

private void presiceSelected()
{
    dectext.setText(que);
    hextext.setText(Decimal.decimalFloatToHexa(que));
    // to make just two zeros after decimal point 
    bintext.setText(Decimal.decimalFloatToBinary(que));
    // check for octel form is not 9 or 8;
    if(Decimal.decimalFloatToOctel(que).contains("9")||Decimal.decimalFloatToOctel(que).contains("8"))
        octtext.setText("--------------");
    else{
    octtext.setText(Decimal.decimalFloatToOctel(que));
       }

}
private void presiceNotSelected()
{
    dectext.setText(que.replaceAll("(\\.\\d{2})\\w*", "$1"));
     hextext.setText(Decimal.decimalFloatToHexa(que).replaceAll("(\\.\\d{2})\\w*", "$1"));
     // to make just two zeros after decimal point 
     bintext.setText(Decimal.decimalFloatToBinary(que).replaceAll("(\\.\\d{2})\\w*", "$1"));
     // check for octel form is not 9 or 8;
     if(Decimal.decimalFloatToOctel(que).contains("9")||Decimal.decimalFloatToOctel(que).contains("8"))
         octtext.setText("--------------");
     else{
     octtext.setText(Decimal.decimalFloatToOctel(que).replaceAll("(\\.\\d{2})\\w*", "$1"));
        }  
}
 private String recievehex(String que){
     int len = que.length();
     String temp="";
     String hex = "";
     System.out.println("in recieve");
     Predicate<Character> isOper = (i)->{
     return i=='+'||i=='-'||i=='/'||i=='*';
     };
     for (int i = 0; i < len; i++) {
         System.out.println("que.charati "+que.charAt(i));
         if(isOper.test(que.charAt(i))){
             if(hex.isEmpty())
                temp = temp + que.charAt(i);
             else{
                 System.out.println("hex "+hex);
                hex = String.valueOf(Decimal.hexaFloatToDecimal(hex));
                temp = temp + hex + que.charAt(i);
                hex = "";
             }
         
         }
         else{
             
            hex = hex + que.charAt(i);
            if(i==len-1){
                System.out.println("hex "+hex);
            temp = temp + String.valueOf(Decimal.hexaFloatToDecimal(hex));
            }
                    
         }
     }
     System.out.println("temp "+temp);
     return temp;
 }
 
 private String recieveoct(String que)
 {  
     if(que.contains("9")||que.contains("8"))
         return "";
   
   
     int len = que.length();
     String temp="";
     String oct = "";
     Predicate<Character> isOper = (i)->
     {
     return i=='+'||i=='-'||i=='/'||i=='*';
     };
     
      for (int i = 0; i < len; i++) {
           System.out.println("que.charati "+que.charAt(i));
         if(isOper.test(que.charAt(i))){
             if(oct.isEmpty())
                temp = temp + que.charAt(i);
              else{
                 System.out.println("oct "+oct);
                 oct = String.valueOf(Decimal.octelFloatToDecimal(oct));
                 temp = temp + oct + que.charAt(i);
                 oct = "";
               }
         
         }
          else{
             
            oct = oct + que.charAt(i);
            if(i==len-1){
                System.out.println("octel "+oct);
                temp = temp + String.valueOf(Decimal.octelFloatToDecimal(oct));
            }
 }
      }
     
     System.out.println("temp "+temp);
     return temp;
   }
 
 private String recievebin(String que)
 {
  if(!que.matches("[01.?]+"))// make sure it 01 and .
           return "";
  
   int len = que.length();
     String temp="";
     String bin = "";
     Predicate<Character> isOper = (i)->
     {
     return i=='+'||i=='-'||i=='/'||i=='*';
     };
     
      for (int i = 0; i < len; i++) {
           System.out.println("que.charati "+que.charAt(i));
         if(isOper.test(que.charAt(i))){
             if(bin.isEmpty())
                temp = temp + que.charAt(i);
              else{
                 System.out.println("oct "+bin);
                 bin = String.valueOf(Decimal.binaFloatToDecimal(bin));
                 temp = temp + bin + que.charAt(i);
                 bin = "";
               }
         
         }
          else{
             
            bin = bin + que.charAt(i);
            if(i==len-1){
                System.out.println("octel "+bin);
                temp = temp + String.valueOf(Decimal.binaFloatToDecimal(bin));
            }
 }
      }
     
     System.out.println("temp "+temp);
     return temp;
 }
    
}
