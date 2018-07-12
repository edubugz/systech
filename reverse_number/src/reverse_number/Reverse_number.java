/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse_number;

import java.util.*;
public class Reverse_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number to reverse: ");
		 String num = input.nextLine();
                 
		String [] arrOfStr = num.split("");
                int len = arrOfStr.length -1;
                
                while (len >= 0){
                System.out.print(arrOfStr[len]);
                len--;
                  
                }
                System.out.print("\n");
               
                 
		input.close();
    }
    
}
