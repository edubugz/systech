/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiples;

import java.util.Scanner;

/**
 *
 * @author Edwin Wanyoike
 */
public class Multiples {
    int sum=0;
   public String multiples (int n){
       
       for (int i =0;i<=n;i++){
           {
               if (i%3==0 || i%5==0){
                   sum +=i;
               }
           }
           
       }
       return "the sum of the multiples of 3 and 5 within range 0 and "+n+" is "+ sum;
   }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the max value of the sequence :");  
        int i =sc.nextInt(); 
        Multiples nums = new Multiples();
        
        System.out.println(nums.multiples(i));
        
        
        
    }
    
}
