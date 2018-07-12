

// 10. Write a Java program that takes three numbers as input to calculate and print the average of the numbers

package question_10;

import java.util.Scanner;
import java.util.stream.*;

/**
 *
 * @author User
 */
public class Question_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner getVals=new Scanner(System.in);
        System.out.println("program that takes three numbers as input to calculate and print the average of the numbers:");
        
        System.out.println("Enter the three numbers separated by \" - \" :");
        String nums =getVals.nextLine();
        String [] arrOfStr = nums.split("-");
       
        double sum = 0;
        int i = 0;
        int x = arrOfStr.length;
    
        if( x>3){
            System.out.println("please enter only 3 numbers");
        }
        
        else{
         while(i< arrOfStr.length)
         {
             sum += Double.parseDouble(arrOfStr[i]);
             i++;
             
         }
         
         System.out.println("the average of the three numbers is : "+ sum/x);
        
        }        
        
        
        
        
        
        
        
        
        
       // double average = (num1+num2+num3)/3;
        
        //System.out.println("the average of the three numbers is "+ average);
        
    }
    
}
