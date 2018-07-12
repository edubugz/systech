/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backaround;

/**
 *
 * @author Edwin Wanyoike
 */
public class BackAround {

    public String backAround(String str) {
  int i = str.length();
    return str.charAt (i-1)+str+str.charAt(i-1);
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
