/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

/**
 *
 * @author Edwin Wanyoike
 */
import java.util.Scanner;  
public class PrimeNumber {
      public String prime (double a){
          int b = (int)a;
          double pfactor = a-1;
        if (b == 1){
            
            return b+" is prime";
        }
        else{
            
             while(pfactor>1){
                 
                 if (b%pfactor == 0){
                     
                     return b+" is not prime";
                 }
                 
                 pfactor--;
             }
             
             return b+" is prime";
          
          
      }
      }
      
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
     
   System.out.println("Enter the integer you want to check if it's a prime number: ");  
   double i =sc.nextDouble();  
   if (i ==(int)i){
   PrimeNumber num1 = new PrimeNumber ();
       // for (int i=0;i<=10;i++){
   System.out.println(num1.prime(i));
   
   }
   else {
       
   System.out.println("number is not a prime number");
        
    }   
   }     
}
    

