/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_1;

/**
 *
 * @author User
 */
public class Question_1 {
    
    public boolean nearHundred(int n) {
  
  if (n<= 100 ){
    if ( 100 - Math.abs(n)<= 10)
    {
    return true;
    }
  }
  
  else if (n >100 && n <= 110)
  {
    if (110 - Math.abs(n)<= 10 )
    {
      return true;
    }
  }
    
    else if (n<= 200){
    if ( 200 - Math.abs(n)<= 10)
    {
    return true;
    }
   }
   
   else if (n >200 && n <= 210)
  {
    if (210 - Math.abs(n)<= 10 )
    {
      return true;
    }
  }
  
  else {
    return false;
  }
   
  
   
    
    
  }
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(" hello \n Edwin wanyoike");
        
        
    }
    
}
