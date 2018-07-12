/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontback;

/**
 *
 * @author Edwin Wanyoike
 */
public class FrontBack {

    public String frontBack(String str) {
  int i = str.length();
  String middlepart = str.substring (1, i-1);
  return str.charAt (i-1)+middlepart+str.charAt(0);
  
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
