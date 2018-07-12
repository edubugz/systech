// program to print the area and perimeter of a rectangle
package question_11;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Question_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner getVals = new Scanner(System.in);

        System.out.println("program to print the area and perimeter of a rectangle \n");

        System.out.println("enter the height of the rectangle");
        double height = getVals.nextDouble();

        System.out.println("enter the width of the rectangle ");
        double width = getVals.nextDouble();

        double recArea = height * width;
        double recPerimeter = (height * 2) + (width * 2);

        System.out.println(">: the area of the rectangle is " + recArea);
        System.out.println(">: the perimeter of the rectangle is " + recPerimeter);

    }

}
