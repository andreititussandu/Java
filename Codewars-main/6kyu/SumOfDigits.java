// DESCRIPTION:
// Digital root is the recursive sum of all the digits in a number.
// Given n, take the sum of the digits of n. If that value has more than one digit, 
// continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.

public class DRoot {
  public static int digital_root(int n) {
        int sum=0;
        int[] dig= new int[10];
        while(n!=0){
            for(int i=0;i<dig.length;i++) {
                dig[i] = n % 10;
                sum+=dig[i];
                n=n/10;
            }
            while(sum/10!=0)
                sum=sum%10+sum/10;
        }
        return sum;
    }
}