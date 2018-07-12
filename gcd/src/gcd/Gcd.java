/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

/**
 *
 * @author Edwin Wanyoike
 */
import java.util.*;
public class Gcd {
   
     public String gcd(int a, int b){
         int gcd =1;
         int k = 2;
         while (k <=a && k <= b){
             if ( a%k == 0 && b%k== 0)
                  gcd = k;
                   k++;
                 
             
             
         }
         
        return ">: the GCD of "+a+" and "+b+ " is: "+gcd; 
     }
         
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value one:");  
          int i =sc.nextInt(); 
         System.out.println("Enter value two:"); 
         int j =sc.nextInt(); 
        
        Gcd nums = new Gcd ();
        System.out.println(nums.gcd(i,j));
    }
    
}
