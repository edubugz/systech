/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mixstart;

/**
 *
 * @author Edwin Wanyoike
 */
public class MixStart {

    public boolean mixStart(String str) {
  
  if (str.length () >= 3){
    
    if (str.substring(1,3).equals("ix")){
      
      return true;
    }
  }
  
  return false;
}

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
