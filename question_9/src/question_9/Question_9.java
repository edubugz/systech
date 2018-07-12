

// Write a Java program to print the area and perimeter of a circle
package question_9;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Question_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner getVals=new Scanner(System.in);
        System.out.println("program to find the area and perimeter of a circle:");
        System.out.println("Enter the radius of the circle:");
         
        double radius =getVals.nextDouble();
        
        double diameter = radius*2;
        double pi = 3.142;
        
        double area = pi *(radius*radius);
        double perimeter = pi * diameter;
        
        System.out.println(":> the area of the circle = "+ area);
        System.out.println(":> the perimeter of the circle is = "+ perimeter);
        
        
                
                }
    
}
