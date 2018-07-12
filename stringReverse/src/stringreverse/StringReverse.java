/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreverse;

import java.util.Scanner;

/**
 *
 * @author Edwin Wanyoike
 */
public class StringReverse {
  
    public String stringreverse(String str){
        String newStr ="";
        
        for (int i= str.length()-1;i>=0;i--){
            newStr+= str.charAt(i);
            
        }
        return "the reverse of : "+str+" :is "+newStr;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringReverse reverse = new StringReverse ();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to reverse :");  
        String i =sc.nextLine(); 
        System.out.println(reverse.stringreverse(i));
    }
    
}
