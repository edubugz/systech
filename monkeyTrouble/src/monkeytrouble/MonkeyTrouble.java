/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monkeytrouble;

/**
 *
 * @author Edwin Wanyoike
 */
public class MonkeyTrouble {

    public boolean monkeySmile(boolean aSmile,boolean bSmile){
        if (aSmile && bSmile || !aSmile && !bSmile){
            return true;
        }
        
        return false;
        
    }
    public static void main(String[] args) {
        MonkeyTrouble smiling = new MonkeyTrouble ();
        
        System.out.println(smiling.monkeySmile(true, true));
        System.out.println(smiling.monkeySmile(true, false));
        System.out.println(smiling.monkeySmile(false,false));
        System.out.println(smiling.monkeySmile(false,true));
    }
    
}
