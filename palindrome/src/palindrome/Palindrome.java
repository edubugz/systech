/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author Edwin Wanyoike
 */
import java.util.*;
public class Palindrome {
          
    public String ispalindrome(String str){
        String reverse="";
        
        for(int i=str.length()-1;i>=0;i--){
            
            reverse +=str.charAt(i);
        }
        if(reverse.equals(str)){
            return ">: the string is a palindrome";
        }
        
        return ">: the string is not a palindrome";
        
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Palindrome test = new Palindrome();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check if its palindrome:");  
        String i =sc.nextLine(); 
        
        System.out.println(test.ispalindrome(i));
        
        
    }
    
}
