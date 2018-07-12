/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missingchar;

import java.util.ArrayList;

/**
 *
 * @author Edwin Wanyoike
 */
public class MissingChar {

    public String missingChar(String str, int n) {
        String [] arrOfStr = str.split("");
         ArrayList <String> newStr = new ArrayList <String> (); 
         int a = arrOfStr.length-1;
         int i = 0;
         while(i<=a){
             newStr.add(arrOfStr[i]);
             i++;
         }
         
         newStr.remove(n);
         String listString = "";

             for (String s : newStr)
               {
                     listString += s;
                      }
             return listString;
         
         
         
        
        
        
         
  
}

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
