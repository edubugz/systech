/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildstrings;

/**
 *
 * @author Edwin Wanyoike
 */
import java.util.*;

public class BuildStrings {

    public String buildstrings(String [] stringOfArr)
    {
        StringBuilder newString = new StringBuilder();
        for (int i=0;i<=stringOfArr.length-1;i++)
        {
            if (stringOfArr[i].equalsIgnoreCase("x"))
            {
                newString.append(stringOfArr[i]);
            }
        }
        return newString.toString();
    }
    public static void main(String[] args) {
        
         BuildStrings inputString = new BuildStrings ();
         Console cons = System.console();
         
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the String to check for \"X\" :");
         
         String typedString = sc.nextLine();
         String [] typedStringtoArr = typedString.split("",0);
         
         System.out.println(inputString.buildstrings(typedStringtoArr));
         
         
         
         
         

        
    }
    
}
