/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notstring;

/**
 *
 * @author Edwin Wanyoike
 */
import java.util.*;
public class NotString {

    public String notString(String str) {
       
   String [] arrOfStr = str.split(" ",0);
       
        
        if ( arrOfStr [0].equals("not")){
            
            return str;
        }
        
        else {
            
            ArrayList <String> newStr = new ArrayList <String> (); 
            newStr.add ("not");
            //newStr.add (" ");
           
            int x = 0;
            while (x < arrOfStr.length){
                newStr.add (" ");
                newStr.add (arrOfStr[x]);
                
                x++;
            }
            
            String listString = "";

             for (String s : newStr)
               {
                     listString += s;
                      }
             return listString;
             
        }
  
}

    public static void main(String[] args) {
        
        NotString st1 = new NotString ();
        
        //System.out.println(st1.notString("strong"));
        
        System.out.println(st1.notString("edwin not"));
    }
    
}
