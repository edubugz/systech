
//Given two int values, return their sum. Unless the two values are the same,
//then return double their sum.


package sumdouble;

/**
 *
 * @author Edwin Wanyoike
 */
public class SumDouble {
    public int sum (int a,int b){
        if (a==b){
            int sum = 2*(a+b);
            return sum;
        } 
        
        else {
            int sum = a+b;
            return sum;
        }
       
        
    }
    public static void main(String[] args) {
       SumDouble firstNums = new SumDouble();
       
       System.out.println (firstNums.sum(1,2));
       System.out.println (firstNums.sum(3,2));
       System.out.println (firstNums.sum(2,2));
    }
    
}
