/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccisequence;

/**
 *
 * @author Edwin Wanyoike
 */
import java.util.*;
public class FibonacciSequence {
    //String startString ="the a fibonacci element is";
    public int fibonacciSequence(int a){
       if (a == 0) 
            return 0;
       else if (a== 1) 
          return 1;
       else 
           return + fibonacciSequence(a- 1) + fibonacciSequence(a- 2) ;
 
 }

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);  
        FibonacciSequence one = new FibonacciSequence ();
        System.out.println("Enter the integer to be the n element  ");  
        int i =sc.nextInt(); 
        
        System.out.println(one.fibonacciSequence(i));
    }
    
}
