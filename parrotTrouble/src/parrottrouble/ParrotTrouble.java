/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parrottrouble;

/**
 *
 * @author Edwin Wanyoike
 */
public class ParrotTrouble {
    
    public boolean talkingParrot(boolean talking, int hour){
        
        if (talking && hour < 7 || talking && hour > 20){
            
            return true;
        }
        return false;
        
    }

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        ParrotTrouble parrot = new ParrotTrouble ();
        
        System.out.println (parrot.talkingParrot(true, 8));
        System.out.println (parrot.talkingParrot(true, 6));
        System.out.println (parrot.talkingParrot(true, 21));
    }
    
}
