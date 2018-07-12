/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkint;

/**
 *
 * @author Edwin Wanyoike
 */
import java.util.*;
public class Checkint {
 static int fib(int n)
    {
    /* Declare an array to store Fibonacci numbers. */
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0
    int i;
      
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0;
    f[1] = 1;
     
    for (i = 2; i <= n; i++)
    {
       /* Add the previous 2 numbers in the series
         and store it */
        f[i] = f[i-1] + f[i-2];
    }
      
    return f[n];
    }
      
    public static void main (String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the  number: ");
        int n=in.nextInt();
        
        
        
        System.out.println(fib(n));
    }
}