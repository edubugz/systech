/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccisum;

/**
 *
 * @author Edwin Wanyoike
 */
import java.util.*;
public class FibonacciSum {
    
    public String fibSum (int n){
        int a; 
        int b = 0;
        int c = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) { // Finds fibonacci sequence
            a = b;
            b = c;
            c = a + b;

            if (c % 2 == 0)  // Check if it's even
                sum += c;
        }
		
		return "the sum of multiples of 3 and 5 from 0 upto "+n+" = "+ sum;
	}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer upto which to sum up the multiples of 3 and 5:");  
          int i =sc.nextInt();
        
        FibonacciSum fibs = new FibonacciSum ();
        System.out.println(fibs.fibSum(i));
    }
    
}
