/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringyak;

/**
 *
 * @author Edwin Wanyoike
 */
import java.util.*;
public class StringYak {
   
    public String stringYak(String str){
        
  return str.replace(str.substring(str.indexOf("y"),str.indexOf
  ("k",str.indexOf("y"))+1),"");
}

    public static void main(String[] args) {
        // TODO code application logic here
        StringYak news1 = new StringYak();
        StringYak news2 = new StringYak();
        StringYak news3 = new StringYak();
        System.out.println(news1.stringYak("yakpak"));
        System.out.println(news2.stringYak("pakyak"));
        System.out.println(news3.stringYak("yak123ya"));
    }
    
}
