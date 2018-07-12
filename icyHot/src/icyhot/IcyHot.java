/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icyhot;

/**
 *
 * @author Edwin Wanyoike
 */
public class IcyHot {
public boolean icyHot(int temp1, int temp2) {
  
  if ( (temp1 < 0 && temp2 >100) ||(temp1>100 && temp2<0))
  
  {
    
    return true;
  }
  
  return false;
}

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
