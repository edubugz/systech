/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deldel;

/**
 *
 * @author Edwin Wanyoike
 */
public class DelDel {
    
public String delDel(String str) {
  String modified="";
  if (str.length () >=4){
  if ( str.substring(1,4).equals("del")){
    
    return str.substring (0,1) + str.substring(4,str.length());
  }
  }
  
  
  return str;
}

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
