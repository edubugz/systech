/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author Edwin Wanyoike
 */
public class FizzBuzz {
    
   public String fizzBuzz(int n){
       String one = "fizz";
       String two = "buzz";
       if (n%3 == 0 || n%5 == 0){
           if(n%3==0 && n%5!=0){
               
               return one;
           }
          
           else if (n%5 == 0 && n%3!=0){
               return two;
           }
           
           return one+two;
           
       }
       return String.valueOf(n);
   }
    public static void main(String[] args) {
        
        FizzBuzz test = new FizzBuzz ();
        
        for (int i=9;i<=20;i++){
        System.out.println(test.fizzBuzz(i));
        }
        
    }
    
}
