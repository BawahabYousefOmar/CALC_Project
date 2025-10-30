/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author WinDows
 */
public class Stack<T> {
 private ArrayList<T> stack = new ArrayList();
    private int top=-1 ;
    T lastDeleted;
    
    Stack(List list){
      top= list.size()-1;
      this.stack.addAll(list);
    }
   Stack(){};
   
   boolean isEmpty(){
       return this.stack.isEmpty();
   }
   void push(ArrayList list){
   top = top==-1? list.size()-1:top + (list.size()-1);
   this.stack.addAll(list);
   }
   void push(T obj){
    top++;  
    this.stack.add(obj);
   }
   void pop(){
       if(this.stack.isEmpty())
           System.out.println("stack is empty!");
       else{
            this.lastDeleted = stack.get(top);
            this.stack.remove(top);
            top--;
            }
     }
   int size(){
   return stack.size();
   }
   T getTop(){
       if(!stack.isEmpty())
    //     pop = stack.size()-1;
     return this.stack.get(top);
   return (T)"";
   }
   String gettopString(){
    if(!stack.isEmpty())
        return (String) this.stack.get(top);
    return "";
  }
    char gettopchar(){
       if(!stack.isEmpty())
           return (char)this.stack.get(top);
   return  '0';
  }
   void showStack(){
       System.out.print("[ ");
       for (int i = top; i >=0; i--) {
           System.out.print(this.stack.get(i)+" ");
       }  
       System.out.println("]");
       
   }
    

 static boolean areBalance(String str){
    return balanced_parenthese(str);
    } 
  
    
    
  private static boolean balanced_parenthese(String str){
     Stack stack = new Stack();
     int len = str.length();
     for (int i = 0; i < len; i++) {
           if(str.charAt(i)=='('||
            str.charAt(i)=='['||str.charAt(i)=='{')
           stack.push(str.charAt(i));
           else if(str.charAt(i)==')'||
            str.charAt(i)==']'||str.charAt(i)=='}')
                    if(stack.isEmpty()||
                       !Stack.is_closed(stack.gettopchar(), str.charAt(i)))
                        return false;
                   else
                        stack.pop();
                       
           }
           return stack.isEmpty();
    }
  private static boolean is_closed(char a, char b){
       if(a=='('&&b==')')
           return true;
       else if(a=='{'&&b=='}')
           return true;
       else if(a=='['&&b==']')
           return true;
       
       return false;
    }
  
 static Stack intializeStack(String str){
     System.out.println(str);
    Stack stack = new Stack();
    int len = str.length();
    int i =0;
    boolean allowNegative= true;
    String sub = ""; 
    while(i<len){
//        stack.showStack();
           if(String.valueOf(str.charAt(i)).matches("[\\d.]+")
                ||(allowNegative&&String.valueOf(str.charAt(i)).matches("-[\\d.]*"))  ){// check if str.char(i)='-' or "-followd by num or num just.
              
              sub= sub + str.charAt(i);
             allowNegative=false;// we hava negative dont allow negative 
           
             if(i==len-1){
                  if(sub.charAt(0)=='-'){// if it neagative
                            if(stack.isEmpty() || !stack.gettopString().matches("-?[\\d.]+"))// if stack just add it
                              if(isItdouble(sub)) stack.push(sub);
//                              else{System.out.println("error not a valid num");}
                             else{ // if it is not add +
                                    stack.push("+");
                              if(isItdouble(sub)) stack.push(sub);
//                              else{System.out.println("error not a valid num");}
                              }
                                                  }
                        else{
                              if(isItdouble(sub)) stack.push(sub);
//                              else{System.out.println("error not a valid num");}
                        
                           }
              }
//              System.out.println("sub= "+sub);
          }
          
          else{
                    if(!sub.isEmpty()){
                        if(sub.charAt(0)=='-'){// if it neagative
                            if(stack.isEmpty() || !stack.gettopString().matches("-?[\\d.]+"))// if stack just add it
                             stack.push(sub);
                             else{ // if it is not add +
                               if(!sub.equals("-"))
                                    stack.push("+");
                                    stack.push(sub);
                              }
                                                  }
                        else{
                              stack.push(sub);
                        
                           }
                              sub="";
                              allowNegative=true; //set to true to allow neg
                           }
                    // make sure if str.char(i)= + or * or /
               if(str.charAt(i)=='-'){
                   sub = str.charAt(i)+"";
                   allowNegative= false;}
               if(str.charAt(i)!='-'&&str.charAt(i)!=' '
                       &&str.charAt(i)!=')'&&str.charAt(i)!='(') 
                   stack.push(str.charAt(i)+"");
               
          
          }
          i++;
    }   
//    stack.showStack();
    return stack;
    }
     
  static boolean isItdouble(String str){
    if(Pattern.matches("-?\\d*.?\\d+", str))
        return true;
   return false;
   }  
  
  private static boolean checkbalancedSings(String str){
         
         Stack temp =  intializeStack(str);
            boolean sign = false;
            while(!temp.isEmpty()){
                 if(temp.gettopString().matches("-?[0-9.]+")&&!sign){
                     temp.pop();
                     sign = true;}
                 else if((temp.gettopString().contains("+")||
                         temp.gettopString().contains("-")||
                         temp.gettopString().contains("*")||
                         temp.gettopString().contains("/"))&&
                         sign){
                        temp.pop();
                         sign = false;}
                 else
                     return false;
           }

           return sign;
           }
      
  private static double CALC(Stack numStack){
        //1- intializeStack_CheckSignsAndClad
        //2-orderpriority
       
//      Stack numStack = orderpriority(stack);
//      numStack.showStack();
//        System.out.println("in calc");
      Stack operStack = new Stack();
      String num1= "";
      String num2 ="";
      String sign ="";
     double a,b;
     while(true){
//         numStack.showStack();
//         System.out.println("in loop outer");
     while(!numStack.isEmpty()){
//         System.out.println("inside innerloop");
//         System.out.print("numstack ");numStack.showStack();
//         System.out.print("\noperstack ");operStack.showStack();
          if(!isValid(numStack)){
             operStack.push(numStack.gettopString());
             numStack.pop();
          }
          else{
          sign = numStack.gettopString();numStack.pop();
          num1 = numStack.gettopString();numStack.pop();
          num2 = numStack.gettopString();numStack.pop();
           a= Double.parseDouble(num1);
           b= Double.parseDouble(num2);
            switch((int)sign.charAt(0)){
                case 42: operStack.push(String.valueOf(b*a));
                         break;
                case 43: operStack.push(String.valueOf(b+a));
                         break;
                case 45: operStack.push(String.valueOf(b-a));
//                        System.out.println(a + "" + b);
                         break;
                case 47: operStack.push(String.valueOf(a/b));
                         break;
                                                       }
          
                             }
     }
        if(operStack.size()==1){
            
             return a = Double.parseDouble(operStack.gettopString());
                 }
       else{
            while(!operStack.isEmpty()){
                String t = operStack.gettopString();
                numStack.push(t);
                operStack.pop();
                 }
           }
     
    }//outer while
    }       
            
  private static Stack orderWith(Stack stack){
       
       Stack numStack = new Stack();
       Stack operStack = new Stack();
       Stack tempStack = new Stack();
       String str;
       double calc ;
       int parenthese = 0;
         String temp = "";
         
         
     while(!stack.isEmpty()){
        // (8+5*-(4+5))
            str = stack.gettopString();
             stack.pop();
//             System.out.println("in first str "+str);
           if(str.matches("-?[0-9.]+")){
              numStack.push(str);
           }
           
           else if(str.equals(")")||str.equals("(") ){
               if(str.equals(")")) 
               parenthese++;
               else{
               parenthese--;
               }
//                System.out.println("in parenthes procedure");
                   while(parenthese!=0) {
                         if(stack.gettopString().equals(")"))
                             parenthese++;
                         if(stack.gettopString().equals("("))
                             parenthese--;
                         if(parenthese!=0)
                         tempStack.push(stack.gettopString());
                         stack.pop();
                   }
                 
                   tempStack.showStack();
                 tempStack = orderWith(tempStack);
//                 System.out.print("tempSack "); tempStack.showStack();
                 calc = CALC(tempStack);
//                 System.out.println("clac= "+calc);
                 stack.push(String.valueOf(calc));
           }
//            
           else{
                if(str.equals("*")){
                    
                     while(!operStack.isEmpty()&&operStack.gettopString().equals("*")){
                                temp = operStack.gettopString();
                                 numStack.push(temp);
                                 operStack.pop();
                                }
                                  operStack.push(str);
                                     }
                else if(str.equals("+")){
                         while(!operStack.isEmpty()){
                              temp = operStack.gettopString();
                              numStack.push(temp);
                              operStack.pop();
                        }
                       operStack.push(str);
                
                }
                else if(str.equals("-")){
                      while(!operStack.isEmpty()){
                              temp = operStack.gettopString();
                              numStack.push(temp);
                              operStack.pop();
                        }
                      operStack.push(str);
                
                }
                else if(str.equals("/")){
                  if(operStack.gettopString().equals("+")||operStack.gettopString().equals("-")){
                             operStack.push(str);
                        }
                        else{
                        while(!operStack.isEmpty()&&(operStack.gettopString().equals("*")||operStack.gettopString().equals("/"))){
                             temp = operStack.gettopString();
                             operStack.pop();
                             numStack.push(temp);

                                     }
                           operStack.push(str);
                               }
                      
                }

                }
          
           }
     
      while(!operStack.isEmpty()){
           temp = operStack.gettopString();
           operStack.pop();
           numStack.push(temp);
      }
      
      return numStack;
                 
    
    }
   
  private static boolean isValid(Stack<String> stack){
    String sign = "";
    String num1 = "";
    String num2 = "";
    if(stack.size()>=3){
      sign = stack.gettopString();stack.pop();
      num1 = stack.gettopString();stack.pop();
      num2 = stack.gettopString();stack.pop();
      if(num1.matches("-?[0-9.]+")&&num2.matches("-?[0-9.]+")){
          stack.push(num2);
          stack.push(num1);
          stack.push(sign);
          return true;}
      else{
          stack.push(num2);
          stack.push(num1);
          stack.push(sign);
          return false;
           }
          }
     return false;
    }
    
   public static double calc(String str){
    Stack stack = intializeStack(str);
   if(Stack.checkbalancedSings(str)&&Stack.areBalance(str))
   {
    stack = orderWith(stack);
    return CALC(stack);
    }
    
    else{
        JOptionPane.showMessageDialog(null, "someThing went wrong\nmake sure of your inputs");
       }
    return 00000000;
    }  
    
      
}
