

//Write a Java program that takes two numbers as input and display the product of two numbers

package question_5;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Question_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner getVals=new Scanner(System.in);
         
         System.out.print("Enter any number and press enter :");
         
        double num1 =getVals.nextFloat();
        
        System.out.print("Enter any other number and press enter :");
        
        double num2 = getVals.nextFloat();
        
        double numProduct = num1*num2;
        
       System.out.println("the product of the two numbers "+num1+" and "+num2+" is "+ numProduct);
         
        
        
         
         
        
    }
    
}
