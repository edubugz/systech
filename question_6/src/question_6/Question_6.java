
// Write a Java program to print the sum (addition), multiply, subtract,
//divide and remainder of two numbers

package question_6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Question_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner getVals=new Scanner(System.in);
         System.out.println ("program to print the sum (addition), multiply, subtract, divide and remainder of two numbers;\n");
         System.out.println("Enter any number and press enter :");
         
        double num1 =getVals.nextDouble();
        
        System.out.println("Enter any other number and press enter :");
        
        double num2 = getVals.nextDouble();
      
        double numProduct = num1*num2;
        double numSum = num1+num2;
        double numSubtract = num1 - num2;
        double numDivision = num1/num2;
        double numRemainder = num1 % num2;
        
       System.out.println("1: the product of the two numbers "+num1+" and "+num2+" is "+ numProduct);
       System.out.println("2: the sum of the two numbers "+num1+" and "+num2+" is "+numSum);
       System.out.println("3: the difference between the two numbers "+num1+" and "+num2+" is "+numSubtract);
       System.out.println("4: "+num1+" divided by "+num2+" is "+numDivision);
       System.out.println("5: the remainder when "+ num1 + " is divided by "+ num2 +" is "+numRemainder);
    
    
    } 
    
}
