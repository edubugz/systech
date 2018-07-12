/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starthi;

/**
 *
 * @author Edwin Wanyoike
 */
public class StartHi {

 public boolean startHi(String str) {
  if (str.length () >= 2)
  {
    String firstTwo = str.substring(0,2);
    if (firstTwo.equals ("hi")) {
      
      return true;
    }
  }
  
  return false;
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
