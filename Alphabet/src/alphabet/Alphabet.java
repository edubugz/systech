/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabet;
import java.util.*;
public class Alphabet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         	int num, reverse = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number to reverse: ");
		num = input.nextInt();
		
		while(num != 0) {
			reverse *= 10;
			reverse += num % 10;
			num /= 10;
		}
		System.out.println("Reversed number is: " + reverse);
		input.close();
	}
    }
    
