/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 *
 * @author WinDows
 */
public class Decimal {
  static boolean isItdouble(String str){
    if(Pattern.matches("-?\\d*.?\\d+", str))
        return true;
   return false;
   } 
  public static boolean checkIsNumric(String a){
// After that we use the matches() method to check if it contains
// digits 0 to 9 and a period character.
  return a!=null & a.matches("[0-9./*\\+-]+");
  }
  public static String removeZerosInBeginning(String a){
         for (int i = 0; i < a.length(); i++) {
             if( a.charAt(i)!='0'&& a.charAt(i)!= ' '){
                 a=a.substring(i);
             break;}
         }
     return a;
     }
  public static int binToDeci(String bina){
        int sum =0;
       // System.out.println(bina.charAt(0));
        for (int i = 0; i < bina.length(); i++) {
             if(bina.charAt(i)!='0'&&bina.charAt(i)!='1'){
                 System.out.println("invalid input!");
                 break;}
             else{
             int xon =Integer.parseInt(String.valueOf(bina.charAt(i)));
             sum+= xon*os(2,bina.length()-(i+1));
            }
       
             }
    
    return sum;
     }
  public static float binaFloatToDecimal(String str){
        String s ="";
        String d = "";
        float decimalFloatForm=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='.'){
                for (int j = i+1; j < str.length(); j++) {
                    s = s.concat(String.valueOf(str.charAt(j)));
                }
                break;
                 }
            else{
            d=d.concat(String.valueOf(str.charAt(i)));
            }
        }
        for (int i = -1,j=0; i >= -s.length();j++, i--) {
          decimalFloatForm += Math.pow(2, i)*Integer.valueOf(String.valueOf(s.charAt(j)));
        }
        return binToDeci(d)+decimalFloatForm;
  }
  public static String decimalFloatToBinary(String str){
    int flag =0;
    int stop=0;
    String floatform= getnumberAfterDecimalPoint(str);
    String bina = "";
     if(!floatform.isEmpty()){// check if a there no num after decimal point
            bina = ".";
     do{    
          float numform = Float.parseFloat(floatform);//convert to float type
          numform*=2; 
          if(numform>1){bina=bina.concat("1");}
          else if(numform<1){bina=bina.concat("0");}
          else{bina=bina.concat("1"); flag=1;}
  // in case the numform is 1 it means there is no nubers after the de
  //cimal point so stop;
          floatform=String.valueOf(numform);//convert to String again ;
          floatform=getnumberAfterDecimalPoint(floatform);
         
          stop++;
      }while(flag!=1&&stop<=8);
     }
     return decimalToBin(Float.parseFloat(getNumbersBeforeDecimaPoint(str))).concat(bina);
  }
  public static String decimalToBin(float decimal){
      String bina = "";
      for (int i = 7; i >=0; i--) {
            if(decimal-os(2,i)>=0){
                bina = bina + "1";
                if(i==4) bina+=" ";
                decimal-=os(2,i);}
             else{
              bina = bina + "0";
              if(i==4) bina+=" ";
            }
      }
    bina = removeZerosInBeginning(bina);
    return bina;    
       } 
  public static String getnumberAfterDecimalPoint(String str){
    if(str.contains(".")){
     for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='.'){
              str = str.substring(i);
               break;
            }
        }
         return str;
    }
    else{
    return "";
    }
    
  }
  public static String getNumbersBeforeDecimaPoint(String str){
      if(str.contains("."))
      {
        for (int i = 0; i < str.length(); i++) {
             if(str.charAt(i)=='.'){
               str = str.substring(0, i);
               break;}
      }
        
        return str;
      }
      else{
          
      return str;
      }
     
      
  }
  public static int OctelToDec(String oct){
         int sum = 0;
         if(oct=="8"||oct=="9"){System.out.print("invalid input");}
         
        else{
        for (int i = oct.length()-1,j=0; i >=0||j<oct.length(); j++,i--) {
             int xon = Integer.parseInt(String.valueOf(oct.charAt(j)));
             sum+= os(8,i) * xon;
        }
         }   
     return sum;
     
     } 
  public static String decimalToOctl(float decimal){
        String solution = "";
        for (int i = 7; i >= 0; i--) {
            for (int j = 7; j >= 0; j--) {
                if(decimal-(os(8,i)*j)>=0){
                solution = solution.concat(String.valueOf(j));
                if(i==4) solution+=" ";
                decimal= decimal-(os(8,i)*j);
                  break;
                 } 
            }
         }
     solution= removeZerosInBeginning(solution);
     return solution;
     }
  public static float octelFloatToDecimal(String str){
        String s ="";
        String d = "";
        float decimalFloatForm=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='.'){
                for (int j = i+1; j < str.length(); j++) {
                    s = s.concat(String.valueOf(str.charAt(j)));
                }
                break;
                 }
            else{
            d=d.concat(String.valueOf(str.charAt(i)));
            }
        }
        for (int i = -1,j=0; i >= -s.length();j++, i--) {
          decimalFloatForm += Math.pow(8, i)*Integer.valueOf(String.valueOf(s.charAt(j)));
        }
        return OctelToDec(d)+decimalFloatForm;
  
  }
  public static String decimalFloatToOctel(String str){
    int stop=0;
    String floatform = getnumberAfterDecimalPoint(str);
    String bina = "";
     if(!floatform.isEmpty()){
          bina = ".";
     do{  
         float numform = Float.parseFloat(floatform);//convert to float type
          numform*=8; // the base 8
         
          floatform=String.valueOf(numform);//convert to String again ;
          bina=bina.concat(getNumbersBeforeDecimaPoint(floatform));
          floatform=getnumberAfterDecimalPoint(floatform);
          stop++;
      }while(stop<=8);// any number , just to determine how many itrates
     }
      return decimalToOctl(Float.parseFloat(getNumbersBeforeDecimaPoint(str))).concat(bina);
  }
  public static int hexaToDec(String hexa){
         int decimal = 0 ;
         for (int i = 0,j=hexa.length()-1; i < hexa.length()&&j>=0;j--, i++) {
             if(hexa.charAt(i)!='A'&&hexa.charAt(i)!='B'
               &&hexa.charAt(i)!='C'&& hexa.charAt(i)!='D'
               &&hexa.charAt(i)!='E'&&hexa.charAt(i)!='F'){
                decimal += (Integer.parseInt(String.valueOf(hexa.charAt(i)))) * os(16,j);
                  }
             else{
                   decimal += ((int)hexa.charAt(i) -55 ) * os(16,j);
                  
             }  
         }
         
          return decimal;     
     } 
  public static float hexaFloatToDecimal(String str){
        String s ="";
        String d = "";
        float decimalFloatForm=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='.'){
                for (int j = i+1; j < str.length(); j++) {
                    s = s.concat(String.valueOf(str.charAt(j)));
                }
                break;
                 }
            else{
            d=d.concat(String.valueOf(str.charAt(i)));
            }
        } 
        for (int i = -1,j=0; i >= -s.length();j++, i--) {
                if(s.charAt(j)!='A'&&s.charAt(j)!='B'
                    &&s.charAt(j)!='C'&&s.charAt(j)!='D'
                    &&s.charAt(j)!='E'&&s.charAt(j)!='F'){
                decimalFloatForm += Math.pow(16, i)*Integer.valueOf(String.valueOf(s.charAt(j)));}
                else{decimalFloatForm+= Math.pow(16, i)*((int)s.charAt(j) -55 );}
        }
       return decimalFloatForm+hexaToDec(d);
   
   }
  public static String decimalToHexa(float decimal){
     String hexa="";
       for (int i = 7; i >= 0; i--) {// the power of 16
            for (int j = 15; j >= 0; j--) { //from 0 - F
                
                if(decimal-(os(16,i))*j>=0){
                   if(j>9){ // A-F
                   hexa+=((char)(j+55));
                   if(i==4) hexa+=" ";
                     }
                   else{
                       hexa+=String.valueOf(j);
                       if(i==4) hexa+=" ";
                       }
                   decimal=decimal-(os(16,i))*j;
                   break;
                  } 
              }
       }
     hexa = removeZerosInBeginning(hexa);
     return hexa;
     } 
  public static String decimalFloatToHexa(String str){
        int stop=0;
        String floatform = getnumberAfterDecimalPoint(str);
        String bina = "";
        if(!floatform.isEmpty()){// check if a there no num after decimal point
            bina = ".";
        do{  
          float numform = Float.parseFloat(floatform);//convert to float type
          numform*=16; 
          floatform=String.valueOf(numform);//convert to String again ;
          int j = Integer.parseInt(getNumbersBeforeDecimaPoint(floatform));
          if(j>9){ 
             bina +=((char)(j+55));
          }
          else{ 
             bina = bina.concat(j+"");
          }
          
          floatform=getnumberAfterDecimalPoint(floatform);      
          stop++;
      }while(stop<=8);
        }
  return String.valueOf(decimalToHexa(Float.parseFloat(getNumbersBeforeDecimaPoint(str)))).concat(bina);
  }
  public static float os (int a, int b){
        
        
        float c=a;
        if(b>=0){
        if(b==1) return c;
        else if(b==0){c=1; return c; }
        else{
            for (int i = 1; i < b; i++) { 
                c=c*a;
                 }
            return  c;
           } 
           }
        else{  if(b==-1){ 
                c=1/c;   return c;}
               else{  
                    for (int i = -1; i > b; i--) {
                        c=c*a;
                                }
               c=1/c;  return c;   }
           
            }    
        
    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(decimalFloatToHexa("15.45"));
        /*      System.out.println("4+3".matches("[0-9.-]+"));
       // TODO code application logic here
      Scanner in = new Scanner (System.in);
        char y = 'y';
        System.out.println("        converting numbers");
        System.out.println("        -------------------");
       
        do{
        System.out.println(" press the number:");
        System.out.println(" decimal ----> 1");
        System.out.println(" binary  ----> 2");
        System.out.println(" octel   ----> 3");
        System.out.println(" hexa    ----> 4");
        int num = in.nextInt();
        
        if(num==1){
           System.out.println("enter the number: ");
           String x = in.next();
           System.out.println("binary form = "+ decimalFloatToBinary(x) + "b");
           System.out.println("octel form = "+ decimalFloatToOctel(x) + "o");
           System.out.println("hexa form = "+  decimalFloatToHexa(x) + "h");
            }
        if(num==2){
            System.out.println("enter the number: ");
            String x = in.next();
            float a = binaFloatToDecimal(x);
            System.out.println("decimal form = "+ a + "d");
            System.out.println("octel form = "+ decimalFloatToOctel(a+"") + "o" );
            System.out.println("hexa form = "+ decimalFloatToHexa(a+"") + "h");}
    check: if(num==3){//octel
           System.out.println("enter the number: ");
           String x = in.next();
            for (int i = 0; i < x.length(); i++) {
                 if(x.charAt(i)=='8'||x.charAt(i)=='9'){
                    System.out.println("wrong input!");break check;}  }    
             
           float a = octelFloatToDecimal(x);
           System.out.println("decimal form = "+ a + "d");
           System.out.println("binary form = "+ decimalFloatToBinary(a+"") +"b");
           System.out.println("hexa form = "+ decimalFloatToHexa(a+"") + "h");
        }
        if(num==4){//hexa
           System.out.println("enter the number: ");
          String x = in.next();
          float a = hexaFloatToDecimal(x);
           System.out.println("decimal form = "+ a + "d");
           System.out.println("binary form = "+ decimalFloatToBinary(a+"") + "b" );
           System.out.println("octel form = "+ decimalFloatToOctel(a+"") + "o");}
           System.out.println("press 'y' to repeat" );
           y = in.next().charAt(0);
           
        
        
      
        
        }while(y=='y'||y=='Y');
        System.out.println("thank you ! see you");
       
       /**/
}  
}
