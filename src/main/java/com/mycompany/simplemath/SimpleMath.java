/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.simplemath;

import java.util.Scanner;

/**
 *
 * @author hades
 */
public class SimpleMath {
    
   double x,y ;
   
  public  static void Add(){
      
      
         Scanner scanner;
        scanner = new Scanner(System.in);
        //X
        System.out.println("Enter The Value For  X");
        double x=scanner.nextDouble();
        
       // Y
       System.out.println("Enter The Value For  Y");
       double y=scanner.nextDouble();
       double addSum = x + y;
       System.out.println("The Sum of two double numbers is  = " + addSum  );
     
        
       
      }
  
  
  public  static void Minus(){
      
      
         Scanner scanner;
        scanner = new Scanner(System.in);
        //X
        System.out.println("Enter The Value For  X");
        double x=scanner.nextInt();
        
       // Y
       System.out.println("Enter The Value For  Y");
       double y=scanner.nextInt();
       double deductResult = x - y;
       System.out.println("The Difference of numbers x,y   = " + deductResult  );
     
        
       
      }
  
  
  public  static void Divide(){
      
      
         Scanner scanner;
        scanner = new Scanner(System.in);
        //X
        System.out.println("Enter The Value For  X");
        double x=scanner.nextInt();
        
       // Y
       System.out.println("Enter The Value For  Y");
       double y=scanner.nextInt();
       double qouted = x / y;
       System.out.println("The qoutien of  numbers x,y is  = " + qouted   );
     
        
       
      }
  
  
  
  public  static void Multiply(){
      
      
         Scanner scanner;
        scanner = new Scanner(System.in);
        //X
        System.out.println("Enter The Value For  X");
        double x=scanner.nextInt();
        
       // Y
       System.out.println("Enter The Value For  Y");
       double y=scanner.nextInt();
       double product = x - y;
       System.out.println("The product of two numbers is   = " + product  );
     
        
       
      }
  
  
  
  

    public static void main(String[] args) {
       Add();
       Minus();
       Divide();
       Multiply();
               
    }
}
