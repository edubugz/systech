
// Write a Java program that takes a number as input and prints its multiplication table upto 10

package question_7;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Question_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner getVals=new Scanner(System.in);
         
         System.out.println("Enter any number to get its multiplication table upto 10:");
         
        double num1 =getVals.nextFloat();
        
        int count = 1;
        
        while (count<11){
            
            System.out.println(">: " +num1 +" X "+count+" = "+num1*count);
            count++;
        }
        
        
        
    }
    
}
