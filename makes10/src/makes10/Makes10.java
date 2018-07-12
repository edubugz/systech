//


//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
package makes10;

/**
 *
 * @author Edwin Wanyoike
 */
public class Makes10 {

    public boolean check10(int a,int b){
        if (a == 10 || b == 10 || a+b == 10){
            
            return true;
        }
        
        return false;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Makes10 nums = new Makes10 ();
        
        System.out.println(nums.check10(9,10));
        System.out.println(nums.check10(9,9));
        System.out.println(nums.check10(1,9));
    }
    
}
