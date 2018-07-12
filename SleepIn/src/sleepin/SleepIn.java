/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleepin;

/**
 *
 * @author Edwin Wanyoike
 */
public class SleepIn {
    
public boolean sleep(boolean weekday, boolean vacation) {
  if (!weekday || vacation) {
    return true;
  }
  else
  {
      return false;
  }
  
  
}
    public static void main(String[] args) {
        SleepIn days = new SleepIn();
        
        System.out.println(days.sleep(true,true));
        System.out.println(days.sleep(true,false));
        System.out.println(days.sleep(false,false));
        System.out.println(days.sleep(false,true));
    }
    
}
